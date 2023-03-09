
import java.io.*;

public class Punto_10 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cantidadtitular_1;
		double cantidadtitular_2;
		double cantidadtitular_3;
		double movimiento;
		int opcionmenu;
		int opcionusuario;
		String terminar;
		String titular_1;
		String titular_2;
		String titular_3;
		cantidadtitular_1 = 300;
		cantidadtitular_2 = 250;
		cantidadtitular_3 = 289;
		titular_1 = "Julio";
		titular_2 = "Yelenis";
		titular_3 = "Juel";
		do {
			System.out.println("Bienvenido a Su Banco Fiel");
			System.out.println();
			System.out.println("     Menu de opciones");
			System.out.println("1. Realizar un Ingreso");
			System.out.println("2. Realizar un Retiro");
			System.out.println("3. Realizar una consulta");
			opcionmenu = Integer.parseInt(bufEntrada.readLine());
			System.out.println(); // no hay forma directa de borrar la consola en Java
			System.out.println("Elegir una de los siguientes usuarios");
			System.out.println("__________________________");
			System.out.println("1. "+titular_1);
			System.out.println("__________________________");
			System.out.println("2. "+titular_2);
			System.out.println("__________________________");
			System.out.println("3. "+titular_3);
			System.out.println("__________________________");
			switch (opcionmenu) {
			case 1:
				do {
					System.out.print("Digite el usuario a ingresar:");
					opcionusuario = Integer.parseInt(bufEntrada.readLine());
					switch (opcionusuario) {
					case 1:
						System.out.print("Digite la cantidad que desea ingresar:");
						movimiento = Double.parseDouble(bufEntrada.readLine());
						if (movimiento>0) {
							cantidadtitular_1 = cantidadtitular_1+movimiento;
							System.out.println("Nueva Cantidad: "+cantidadtitular_1);
						} else {
							System.out.println("La cantidad debe ser superior a cero");
						}
						break;
					case 2:
						System.out.print("Digite la cantidad que desea ingresar:");
						movimiento = Double.parseDouble(bufEntrada.readLine());
						if (movimiento>0) {
							cantidadtitular_2 = cantidadtitular_2+movimiento;
							System.out.println("Nueva Cantidad: "+cantidadtitular_2);
						} else {
							System.out.println("La cantidad debe ser superior a cero");
						}
						break;
					case 3:
						System.out.print("Digite la cantidad que desea ingresar:");
						movimiento = Double.parseDouble(bufEntrada.readLine());
						if (movimiento>0) {
							cantidadtitular_3 = cantidadtitular_3+movimiento;
							System.out.println("Nueva Cantidad: "+cantidadtitular_3);
						} else {
							System.out.println("La cantidad debe ser superior a cero");
						}
						break;
					}
				} while (!(opcionusuario>0 && 4>opcionusuario));
				break;
			case 2:
				do {
					System.out.print("Digite el usuario que desea retirar:");
					opcionusuario = Integer.parseInt(bufEntrada.readLine());
					switch (opcionusuario) {
					case 1:
						System.out.print("Digite la cantidad que desea retirar:");
						movimiento = Double.parseDouble(bufEntrada.readLine());
						if (movimiento<=cantidadtitular_1) {
							cantidadtitular_1 = cantidadtitular_1-movimiento;
							System.out.println("Nueva Cantidad: "+cantidadtitular_1);
						} else {
							System.out.println("La cantidad supera la disponible");
						}
						break;
					case 2:
						System.out.print("Digite la cantidad que desea retirar:");
						movimiento = Double.parseDouble(bufEntrada.readLine());
						if (movimiento<=cantidadtitular_2) {
							cantidadtitular_2 = cantidadtitular_2-movimiento;
							System.out.println("Nueva Cantidad: "+cantidadtitular_2);
						} else {
							System.out.println("La cantidad supera la disponible");
						}
						break;
					case 3:
						System.out.print("Digite la cantidad que desea retirar:");
						movimiento = Double.parseDouble(bufEntrada.readLine());
						if (movimiento<=cantidadtitular_3) {
							cantidadtitular_3 = cantidadtitular_3-movimiento;
							System.out.println("Nueva Cantidad: "+cantidadtitular_3);
						} else {
							System.out.println("La cantidad supera la disponible");
						}
						break;
					}
				} while (!(opcionusuario>0 && 4>opcionusuario));
				break;
			case 3:
				do {
					System.out.print("Digite el usuario a consultar:");
					opcionusuario = Integer.parseInt(bufEntrada.readLine());
					switch (opcionusuario) {
					case 1:
						System.out.println("__________________________");
						System.out.println("1. "+titular_1);
						System.out.println("Id: 1");
						System.out.println("Cantidad: "+cantidadtitular_1);
						System.out.println("__________________________");
						break;
					case 2:
						System.out.println("__________________________");
						System.out.println("2. "+titular_2);
						System.out.println("Id: 2");
						System.out.println("Cantidad: "+cantidadtitular_2);
						System.out.println("__________________________");
						break;
					case 3:
						System.out.println("__________________________");
						System.out.println("3. "+titular_3);
						System.out.println("Id: 3");
						System.out.println("Cantidad: "+cantidadtitular_3);
						System.out.println("__________________________");
						break;
					}
				} while (!(opcionusuario>0 && 4>opcionusuario));
				break;
			default:
				System.out.println("La opcion no es valida");
			}
			System.out.println();
			System.out.print("Deseas salir del taller (S/N): ");
			terminar = bufEntrada.readLine();
			if (terminar.equals("s") || terminar.equals("S")) {
				System.out.println();
				System.out.println("Gracias! Por elegirnos taller El Maquinista!");
			} else {
				System.out.println(); // no hay forma directa de borrar la consola en Java
				System.out.println();
			}
		} while (!(terminar.equals("s") || terminar.equals("S")));
	}


}

