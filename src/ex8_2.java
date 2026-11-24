import java.util.Scanner;

public class ex8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pelicula = "Forrest Gump";
        String minusculas = pelicula.toLowerCase();

        System.out.println("Bienvenido al Mini juego del ahorcado");
        System.out.println("Intenta adivinar la pelicula");

        String resultado = "";
        for (int i = 0; i < pelicula.length(); i++) {
            char c = pelicula.charAt(i);

            if (i == 0 || c == ' ') {
                resultado = resultado + c;
            } else {
                resultado = resultado + "*";
            }
        }
        System.out.println(resultado);

        System.out.println("Introduce una letra:");
        char letra = input.nextLine().toLowerCase().charAt(0);

        resultado = "";
        for (int i = 0; i < pelicula.length(); i++) {
            char c = pelicula.charAt(i);

            if (i == 0 || c == ' ' || minusculas.charAt(i) == letra) {
                resultado = resultado + c;
            } else {
                resultado = resultado + "*";
            }
        }
        System.out.println(resultado);
    }
}