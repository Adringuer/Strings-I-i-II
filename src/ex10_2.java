import java.util.Scanner;

public class ex10_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] alumnos = {"Paula", "Santiago", "Pascual", "Jorge", "Saul", "Enrique"};

        System.out.println("¿Qué posición quieres cambiar?");
        int posicion = input.nextInt();
        String basura = input.nextLine();

        if (posicion >= 0 && posicion < alumnos.length) {
            System.out.println("El nombre en esa posición es: " + alumnos[posicion]);

            System.out.println("Introduce el nuevo nombre:");
            String nuevoNombre = input.nextLine();

            alumnos[posicion] = nuevoNombre;

            for (int i = 0; i < alumnos.length; i++) {
                System.out.print(alumnos[i]);

                if (i < alumnos.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("La posición introducida no existe");
        }
    }
}