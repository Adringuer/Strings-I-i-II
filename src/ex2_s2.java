import java.util.Scanner;

public class ex2_s2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introdueix una cadena:");
        String cadena = input.nextLine();

        String resultat = "{";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (cadena.indexOf(c) == i) {
                int frequencia = 0;

                for (int j = 0; j < cadena.length(); j++) {
                    if (cadena.charAt(j) == c) {
                        frequencia++;
                    }
                }

                if (i > 0) {
                    resultat = resultat + ", ";
                }
                resultat = resultat + "'" + c + "': " + frequencia;
            }
        }

        resultat = resultat + "}";
        System.out.println(resultat);
    }
}