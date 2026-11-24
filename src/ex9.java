import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un texto (termina con un punto):");
        String texto = input.nextLine();

        String[] palabras = texto.split(" ");
        int numPalabras = palabras.length;

        String vocales = "aeiouáéíóú";
        String minusculas = texto.toLowerCase();
        int numVocales = 0;

        for (int i = 0; i < minusculas.length(); i++) {
            if (vocales.indexOf(minusculas.charAt(i)) >= 0) {
                numVocales++;
            }
        }

        System.out.println("Palabras: " + numPalabras);
        System.out.println("Vocales: " + numVocales);

    }
}