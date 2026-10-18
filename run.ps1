# Descarga JavaFX si hace falta, compila el módulo y abre la aplicación.
$ErrorActionPreference = "Stop"
$root = $PSScriptRoot
Set-Location $root

$javafxVersion = "21.0.5"
$libDir = Join-Path $root "lib\javafx"
$outDir = Join-Path $root "out"

if (-not (Get-Command java -ErrorAction SilentlyContinue)) {
    Write-Error "No se encontró Java en PATH. Instala un JDK 21 o superior."
}

New-Item -ItemType Directory -Force -Path $libDir | Out-Null

$artifacts = @(
    "javafx-base",
    "javafx-graphics",
    "javafx-controls",
    "javafx-fxml"
)

function Get-File($url, $destination) {
    Write-Host "Descargando $url"
    curl.exe -L --fail --retry 3 --retry-delay 2 -o $destination $url
    if ($LASTEXITCODE -ne 0 -or -not (Test-Path $destination) -or (Get-Item $destination).Length -lt 1000) {
        throw "No se pudo descargar $url"
    }
}

foreach ($name in $artifacts) {
    $jar = Join-Path $libDir "$name-$javafxVersion-win.jar"
    if (-not (Test-Path $jar)) {
        $url = "https://repo1.maven.org/maven2/org/openjfx/$name/$javafxVersion/$name-$javafxVersion-win.jar"
        Get-File $url $jar
    }
}

$modulePath = $libDir
if (-not (Test-Path (Join-Path $libDir "javafx-controls-$javafxVersion-win.jar"))) {
    Write-Error "No se encontraron los JAR de JavaFX en $libDir"
}

if (Test-Path $outDir) {
    Remove-Item $outDir -Recurse -Force
}
New-Item -ItemType Directory -Force -Path $outDir | Out-Null

$sources = Get-ChildItem (Join-Path $root "src\main\java") -Recurse -Filter *.java | ForEach-Object { $_.FullName }

Write-Host "Compilando..."
& javac --module-path $modulePath -d $outDir $sources
if ($LASTEXITCODE -ne 0) {
    Write-Error "Falló la compilación."
}

$resources = Join-Path $root "src\main\resources"
Copy-Item -Path (Join-Path $resources "*") -Destination $outDir -Recurse -Force

Write-Host "Iniciando Solicitar saludo..."
& java --enable-native-access=javafx.graphics --module-path "$outDir;$modulePath" --module edu.estudiante.saludo/edu.estudiante.saludo.MainApp
