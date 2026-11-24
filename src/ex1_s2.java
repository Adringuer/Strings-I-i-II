import java.util.Scanner;

public class ex1_s2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introdueix una cadena:");
        String cadena = input.nextLine();

        System.out.println("La longitud de la cadena és: " + cadena.length());

    }
}