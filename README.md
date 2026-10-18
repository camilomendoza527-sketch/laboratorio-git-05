# Solicitar saludo (JavaFX)

Aplicación de escritorio en **Java / JavaFX** que implementa el caso de uso **Solicitar saludo**, con el include **Pedir datos**.

## Modelo de requerimiento

| Elemento | Descripción |
| --- | --- |
| Actor | Estudiante |
| Caso de uso | Solicitar saludo |
| Include | Pedir datos |
| Resultado | El estudiante es saludado por su nombre y se menciona su edad |

### Flujo

1. El estudiante hace clic en **Solicitar saludo**.
2. El sistema solicita **nombre**, **edad** y **hora (AM/PM)**.
3. El estudiante ingresa lo solicitado.
4. El sistema saluda al estudiante por su nombre y menciona su edad.

La hora AM/PM se usa para elegir el encabezado del saludo (`Buenos días` o `Buenas tardes`).

## Requisitos

- JDK 21 o superior (probado con Java 24).
- Windows (el script `run.ps1` descarga el SDK de JavaFX si hace falta).
- Opcional: Maven, si prefieres `mvn javafx:run`.

JavaFX **no** viene incluido en el JDK. El script de ejecución lo descarga en `lib/`.

## Cómo ejecutar

En PowerShell, desde la raíz del proyecto:

```powershell
.\run.ps1
```

Si aparece un aviso de política de ejecución:

```powershell
Set-ExecutionPolicy -Scope Process Bypass
.\run.ps1
```

Con Maven (si lo tienes instalado):

```bash
mvn javafx:run
```

## Estructura

```
P.CURSOR/
├── README.md
├── pom.xml
├── run.ps1
├── src/main/java/...          código Java
├── src/main/resources/...     FXML y CSS
├── docs/prompts/              secuencia de prompts
└── docs/reflexion/            retos, descubrimientos, sorpresas
```

## Documentación adicional

- [docs/prompts](docs/prompts/README.md): secuencia de prompts usados para construir el proyecto.
- [docs/reflexion](docs/reflexion/README.md): reflexión sobre lo realizado.
