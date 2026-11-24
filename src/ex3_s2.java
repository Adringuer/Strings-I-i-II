import java.util.Scanner;

public class ex3_s2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introdueix una cadena:");
        String cadena = input.nextLine();

        if (cadena.length() < 2) {
            System.out.println("");
        } else {
            String primers = cadena.substring(0, 2);
            String darrers = cadena.substring(cadena.length() - 2);
            System.out.println(primers + darrers);
        }
    }
}