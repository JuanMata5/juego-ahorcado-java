import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {

        // Inicializa el escáner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String secret_word = "programacion"; // La palabra secreta a adivinar
        int maximum_attempts = 10; // Máximo de intentos permitidos
        int attempts = 0; // Contador de intentos realizados
        boolean word_guessed = false; // Variable que indica si se adivinó la palabra

        // Array para almacenar las letras adivinadas
        char[] char_guessed = new char[secret_word.length()];

        // Inicializa el array con guiones bajos
        for (int i = 0; i < char_guessed.length; i++) {
            char_guessed[i] = '_'; // Reemplaza cada letra con un guion bajo
        }

        // Bucle principal del juego
        while (!word_guessed && attempts < maximum_attempts) {
            // Muestra la palabra a adivinar (con guiones bajos) y la cantidad de letras
            System.out.println("Palabra a adivinar: " + String.valueOf(char_guessed) + " (" + secret_word.length() + " letras)");
            System.out.print("Ingresa una letra o la palabra completa: ");

            // Lee la entrada del usuario
            String input = scanner.nextLine().toLowerCase(); // Convierte a minúsculas

            // Verifica si el usuario ingresó la palabra completa
            if (input.equals(secret_word)) {
                word_guessed = true; // Marca que la palabra ha sido adivinada
                System.out.println("¡Felicidades, adivinaste la palabra: " + secret_word + "!");
                break; // Sale del bucle si se adivina la palabra
            }

            // Si se ingresó solo una letra
            if (input.length() == 1) {
                char letter = input.charAt(0); // Obtiene la letra ingresada
                boolean correct_word = false; // Marca si la letra es correcta

                // Comprueba si la letra está en la palabra secreta
                for (int i = 0; i < secret_word.length(); i++) {
                    if (secret_word.charAt(i) == letter) {
                        char_guessed[i] = letter; // Reemplaza el guion bajo por la letra correcta
                        correct_word = true; // Marca que la letra es correcta
                    }
                }

                // Si la letra no es correcta
                if (!correct_word) {
                    attempts++; // Incrementa el contador de intentos
                    System.out.println("¡Incorrecto! Te quedan " + (maximum_attempts - attempts) + " intentos.");
                }
            } else {
                // Mensaje si el usuario no ingresa una letra o la palabra completa
                System.out.println("Por favor, ingresa una sola letra o la palabra completa.");
            }

            // Verifica si la palabra ha sido adivinada
            if (String.valueOf(char_guessed).equals(secret_word)) {
                word_guessed = true; // Marca que la palabra ha sido adivinada
                System.out.println("¡Felicidades, adivinaste la palabra: " + secret_word + "!");
            }
        }

        // Cierra el escáner
        scanner.close();

        // Mensaje final si se acaban los intentos
        if (attempts == maximum_attempts) {
            System.out.println("¡Lo siento! palabra incorrecta. La palabra era: " + secret_word);
        }
    }
}
