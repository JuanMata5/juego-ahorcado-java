# Ahorcados en Java

## Descripción

El juego de Ahorcados es un clásico juego de palabras donde el objetivo es adivinar una palabra secreta letra por letra. El jugador tiene un número limitado de intentos para adivinar la palabra. Si no logra adivinar la palabra antes de que se acaben los intentos, el juego termina.

Este proyecto implementa el juego de Ahorcados en Java, utilizando la consola para interactuar con el jugador. La palabra secreta es fija, pero el juego permite la entrada de letras y la adivinanza de la palabra completa.

## Características

-   **Entrada de letras**: El jugador puede ingresar letras para adivinar la palabra.
-   **Adivinanza de la palabra completa**: El jugador tiene la opción de ingresar la palabra completa para ganar directamente.
-   **Contador de intentos**: El jugador cuenta con un número limitado de intentos antes de perder el juego.
-   **Visualización de progreso**: La palabra se muestra con letras adivinadas y guiones bajos para las letras no adivinadas.
-   **Mensajes claros**: Proporciona retroalimentación al jugador sobre si la letra ingresada es correcta o incorrecta y cuántos intentos le quedan.

## Cómo Jugar

1.  Ejecuta el programa en un entorno de desarrollo de Java.
2.  La consola mostrará una serie de guiones bajos representando la longitud de la palabra secreta.
3.  Ingresa una letra para adivinar o la palabra completa.
4.  El juego te indicará si la letra es correcta o incorrecta y mostrará el progreso de adivinanza.
5.  Si adivinas la palabra antes de que se acaben los intentos, ganarás. De lo contrario, perderás y se mostrará la palabra secreta.

## Requisitos

-   Java Development Kit (JDK) instalado en tu sistema.
-   Un entorno de desarrollo compatible con Java (Eclipse, IntelliJ IDEA, etc.) o la terminal para compilar y ejecutar el programa.

## Ejecución

Para ejecutar el juego, compila el archivo `Ahorcado.java` y luego ejecútalo. Puedes hacerlo desde la línea de comandos con los siguientes comandos:
javac Ahorcado.java
 java Ahorcado