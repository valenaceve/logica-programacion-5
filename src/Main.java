import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        // Crear un diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("fuego", "fire");
        diccionario.put("sueño", "dream");
        diccionario.put("libro", "book");
        diccionario.put("alegría", "joy");
        diccionario.put("arte", "art");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("sol", "sun");
        diccionario.put("amigo", "friend");
        diccionario.put("ciudad", "city");
        diccionario.put("trabajo", "job");
        diccionario.put("ropa", "clothes");
        diccionario.put("comida", "food");
        diccionario.put("familia", "family");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("amarillo", "yellow");

        // Obtener 5 palabras al azar en español
        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        Random rand = new Random();
        String[] palabrasAleatorias = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasAleatorias[i] = palabrasEspanol[rand.nextInt(palabrasEspanol.length)];
        }

        // Pedir al usuario que ingrese las traducciones
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("¡Vamos a jugar traduce la palap!");
        for (String palabraEsp : palabrasAleatorias) {
            System.out.print("Traduce '" + palabraEsp + "' al inglés: ");
            String respuestaUsuario = scanner.nextLine().toLowerCase();
            String traduccionCorrecta = diccionario.get(palabraEsp).toLowerCase();

            if (respuestaUsuario.equals(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + traduccionCorrecta);
                respuestasIncorrectas++;
            }
        }

        // Mostrar el resultado
        System.out.println("Juego terminado. Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
