
import java.util.Scanner;

public class Punto_2 {
    private final static double PI = 3.14;
    private static String nombre;
    private static String apellidos;
    private static int edad;
    private static float estatura;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        nombre = input.nextLine();

        Scanner inputA = new Scanner(System.in);
        System.out.print("Digite sus apellidos: ");
        apellidos = inputA.nextLine();

        Scanner inputB = new Scanner(System.in);
        System.out.print("Digite su edad: ");
        edad = inputB.nextInt();

        Scanner inputC = new Scanner(System.in);
        System.out.print("Digite su estatura: ");
        estatura = inputC.nextFloat();

        System.out.print("Bienvenido "+nombre+" "+apellidos+" tiene una edad de "+edad+" con una estatura de "+estatura);

    }
}
