import java.util.Scanner;
public class Punto_4 {
private static String ciudad, pais;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Digite su ciudad: ");
        ciudad = input.nextLine();

        Scanner inputA = new Scanner(System.in);
        System.out.print("Digite su pais: ");
        pais = inputA.nextLine();

        System.out.print("La ciudad "+ciudad+", es la capital del pais "+pais);

    }
}