# Retos

1. **JavaFX no viene con el JDK.** El entorno tenía Java 24, pero no Maven ni el SDK de JavaFX. Había que decidir entre pedir al usuario que instale herramientas o dejar un script que descargue JavaFX y compile a mano. El ZIP del SDK de Gluon se quedó en 0 bytes; los JAR de Maven Central sí se descargaron.

2. **Traducir un diagrama de casos de uso a pantallas.** El include "Pedir datos" no es un botón extra: es un paso obligatorio dentro de "Solicitar saludo". El reto fue no mezclar captura de datos y saludo en una sola vista, para que el flujo se lea igual que el modelo.

3. **Validar datos sin inflar el alcance.** Edad como texto da errores fáciles (`abc`, vacío, números negativos). El reto fue validar lo mínimo para que el saludo tenga sentido, sin convertir el ejercicio en un sistema de registro.

4. **Módulos de Java.** Un `module-info.java` obliga a abrir los paquetes de controladores a `javafx.fxml`. Si eso se olvida, la app compila y falla al cargar el FXML.

5. **Documentar prompts de una sola conversación.** El usuario pidió la secuencia de prompts. El reto fue no inventar un historial falso: el mensaje original es el prompt 01; el resto resume las decisiones de implementación que se ejecutaron a partir de ese mensaje.
