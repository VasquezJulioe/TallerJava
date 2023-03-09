import java.util.Scanner;
public class Punto_1 {
    private static int edad;
    public static void main(String[] args) {
    System.out.print("Digite su edad: ");
    Scanner input = new Scanner(System.in);
    edad = input.nextInt();

        if (edad >= 18) {
            System.out.print("Usted es mayor de edad");
        } else {
            System.out.print("Usted es menor de edad");
        }

    }
}
