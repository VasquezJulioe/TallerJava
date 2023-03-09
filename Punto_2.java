import java.util.Scanner;
public class Punto_2 {
    private static int edad;

    public static void main(String[] args) {
        System.out.print("Digite su edad: ");
        Scanner input = new Scanner(System.in);
        edad = input.nextInt();

        if (edad < 18) {
            System.out.print("Usted aun es un niño(a).");
        } else {
            System.out.print("Usted ya es un adulto(a).");
        }

    }
}
