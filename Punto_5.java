
import java.io.*;

public class Punto_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		boolean finalizar;
		String nombre;
		int opcion;
		String terminar;
		finalizar = false;
		nombre = "Victoria";
		do {
			System.out.println(" Menu de usuario");
			System.out.println("1. Captura nombre");
			System.out.println("2. Saludar persona");
			System.out.println("3. Salir del sistema");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
				case 1 -> {
					System.out.print("Ingrese el nombre para captura: ");
					nombre = bufEntrada.readLine();
					System.out.println("Nombre capturado: " + nombre);
					System.out.println();
				}
				case 2 -> {
					System.out.println("Hola " + nombre + " es un placer Saludarte");
					System.out.println();
				}
				case 3 -> {
					System.out.println();
					System.out.print("Deseas salir del sistema? (S/N):");
					terminar = bufEntrada.readLine();
					if (terminar.equals("s") || terminar.equals("S")) {
						finalizar = true;
						System.out.println();
						System.out.println("Gracias por utilizar este programa!");
					} else {
						System.out.println(); // no hay forma directa de borrar la consola en Java
						System.out.println("Elige la operacion que deseas realizar:");
						System.out.println();
					}
				}
				default ->
						System.out.println("Seleccion erronea, por favor seleccionar una de las opciones existentes");
			}
		} while (!(finalizar));
	}


}

