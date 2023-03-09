import java.util.Scanner;
public class Punto_5 {
    private static String nombrePropietario, nombreMascota, tipoMascota;
    private static int edadMascota;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite nombre de la mascota: ");
        nombreMascota = input.nextLine();

        Scanner inputA = new Scanner(System.in);
        System.out.print("Digite el tipo de mascota: ");
        tipoMascota = inputA.nextLine();

        Scanner inputB = new Scanner(System.in);
        System.out.print("Digite edad de la mascota: ");
        edadMascota = inputB.nextInt();

        Scanner inputC = new Scanner(System.in);
        System.out.print("Digite nombre del propietario: ");
        nombrePropietario = inputC.nextLine();

        System.out.print(nombreMascota+" es un(a) "+tipoMascota+" el cual, tiene "+edadMascota+" años de edad y "+nombrePropietario+" es actualmente su dueño(a).");
    }
}
