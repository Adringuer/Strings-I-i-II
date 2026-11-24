import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pelicula = "Forrest Gump";
        String minusculas = pelicula.toLowerCase();

        String letras = "";

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

        for (int intento = 1; intento <= 3; intento++) {
            System.out.println("Introduce una letra:");
            char letra = input.nextLine().toLowerCase().charAt(0);

            letras = letras + letra;

            resultado = "";
            for (int i = 0; i < pelicula.length(); i++) {
                char c = pelicula.charAt(i);

                if (i == 0 || c == ' ' || letras.indexOf(minusculas.charAt(i)) >= 0) {
                    resultado = resultado + c;
                } else {
                    resultado = resultado + "*";
                }
            }
            System.out.println(resultado);
        }
    }
}
