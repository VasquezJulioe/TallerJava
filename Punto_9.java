
import java.io.*;

public class Punto_9 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura;
		double ancho;
		double base;
		int opcionmenu;
		double respuesta;
		System.out.println("Calcular el area ");
		System.out.println("1. Rectangulo");
		System.out.println("2. Triangulo");
		System.out.println("3. Trapecio");
		System.out.print("Elija la figura: ");
		opcionmenu = Integer.parseInt(bufEntrada.readLine());
		switch (opcionmenu) {
			case 1 -> {
				System.out.print("Digite el primer lado del Rectangulo:");
				altura = Double.parseDouble(bufEntrada.readLine());
				System.out.print("Digite el segundo lado del Rectangulo:");
				ancho = Double.parseDouble(bufEntrada.readLine());
				respuesta = altura * ancho;
				System.out.println("El area del rectagulo es: " + respuesta);
				System.out.println();
			}
			case 2 -> {
				System.out.print("Digite la altura del triangulo:");
				altura = Double.parseDouble(bufEntrada.readLine());
				System.out.print("Digite la base del triangulo:");
				base = Double.parseDouble(bufEntrada.readLine());
				respuesta = altura * base / 2;
				System.out.println("El area del triangulo es: " + respuesta);
				System.out.println();
			}
			case 3 -> {
				System.out.print("Digite la base mayor del trapecio:");
				base = Double.parseDouble(bufEntrada.readLine());
				System.out.print("Digite la base menor del trapecio:");
				ancho = Double.parseDouble(bufEntrada.readLine());
				System.out.print("Digite la altura del trapecio:");
				altura = Double.parseDouble(bufEntrada.readLine());
				respuesta = ((base + ancho) * altura) / 2;
				System.out.println("El area del triangulo es: " + respuesta);
				System.out.println();
			}
			default -> System.out.println("La opcion no existe, por favor digite una de las disponibles.");
		}
	}


}

