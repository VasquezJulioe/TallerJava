
import java.util.Scanner;

public class Punto_1 {
    private final static double PI = 3.14;
    private static String nombre;
    private static String apellidos;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite su nombre");
        nombre = input.nextLine();

        Scanner inputA = new Scanner(System.in);
        System.out.println("Digite sus apellidos");
        apellidos = inputA.nextLine();

        System.out.println("Bienvenido "+nombre+" "+apellidos);

    }
}