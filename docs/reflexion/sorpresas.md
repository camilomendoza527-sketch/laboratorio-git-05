# Sorpresas

1. **El JDK moderno no incluye JavaFX.** Es fácil asumir que `java` basta. La primera sorpresa es que JavaFX se trata como una dependencia externa (Maven o SDK de Gluon).

2. **El caso de uso es pequeño y aun así pide tres pantallas.** Un saludo parece un `System.out.println`. Con el flujo de 4 pasos y el include, la UI cuenta una historia distinta a un formulario único.

3. **Maven ausente no bloquea el proyecto.** Se puede entregar `pom.xml` para quien lo use y un script PowerShell para quien no lo tenga. Esa doble vía no era obvia al leer solo "usar Java/JavaFX".

4. **Un campo AM/PM cambia el tono del mensaje.** El mismo nombre y la misma edad suenan distinto por la mañana o por la tarde. El modelo pedía el dato; el efecto en el texto es mayor de lo que parece.

5. **Pedir "prompts utilizados" obliga a ser explícito.** En una sesión única, el prompt del usuario es el origen. Documentarlo tal cual, con faltas incluidas, deja evidencia del requerimiento real, no de una versión ya corregida.
