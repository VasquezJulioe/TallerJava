
import java.util.Scanner;

public class Punto_3 {
    private static String nombre,nombrePadre,nombreMadre;
    private static String apellidos,apellidosPadre,apellidosMadre;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        nombre = input.nextLine();

        Scanner inputA = new Scanner(System.in);
        System.out.print("Digite sus apellidos: ");
        apellidos = inputA.nextLine();

        Scanner inputB = new Scanner(System.in);
        System.out.print("Digite nombre del Padre: ");
        nombrePadre = inputB.nextLine();

        Scanner inputC = new Scanner(System.in);
        System.out.print("Digite apellidos del Padre: ");
        apellidosPadre = inputC.nextLine();

        Scanner inputD = new Scanner(System.in);
        System.out.print("Digite nombre de la Madre: ");
        nombreMadre = inputD.nextLine();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Digite apellidos de la Madre: ");
        apellidosMadre = input1.nextLine();
        System.out.print("Yo "+ nombre +" "+ apellidos +" soy hijo de "+nombreMadre+" y "+nombrePadre);

    }
}
