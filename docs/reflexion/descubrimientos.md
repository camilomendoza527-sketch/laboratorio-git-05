# Descubrimientos

1. **El include se mapea bien a una segunda escena.** Clic en "Solicitar saludo" navega a "Pedir datos". Eso hace visible la relación de inclusión: no hay saludo sin datos.

2. **AM/PM sí aporta al caso de uso.** El requerimiento pide hora AM/PM aunque el resultado hable de nombre y edad. Usarla en el encabezado del saludo evita un campo decorativo.

3. **FXML + CSS separan el diseño del flujo.** Los controladores solo orquestan navegación y validación; el texto del saludo vive en `SaludoService`. Eso facilita explicar el diseño en una defensa o en un README.

4. **Un script de ejecución es parte del entregable.** En un laboratorio, "abre el IDE y corre" no siempre funciona. `run.ps1` convierte la restricción JavaFX en algo reproducible.

5. **La documentación académica pide rastro, no solo código.** README, prompts y reflexión no son adornos: muestran cómo se interpretó el modelo y qué se aprendió al implementarlo.
