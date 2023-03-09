import java.util.Scanner;
public class Punto_3 {
    private static int edad;
    private static String nombre;
    static String apellidos;

    public static void main(String[] args) {
        System.out.print("Digite su nombre: ");
        Scanner input = new Scanner(System.in);
        nombre = input.nextLine();
        System.out.print("Digite sus apellidos: ");
        Scanner inputA = new Scanner(System.in);
        apellidos = inputA.nextLine();
        System.out.print("Digite su edad: ");
        Scanner inputE = new Scanner(System.in);
        edad = inputE.nextInt();

        if (edad >= 18) {
            System.out.print(nombre+" "+apellidos+" usted es mayor de edad por lo tanto puede entrar.");
        } else {
            System.out.print(nombre+" "+apellidos+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }

    }
}
