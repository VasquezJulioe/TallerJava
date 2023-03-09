
// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene

import java.io.*;

public class Punto_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int opcionmenu;
		int opcionusuario;
		String registroarreglos_1;
		String registroarreglos_2;
		String registroarreglos_3;
		String registroingreso_1;
		String registroingreso_2;
		String registroingreso_3;
		String registrosalida_1;
		String registrosalida_2;
		String registrosalida_3;
		String salirregistros;
		String terminar;
		String usuario_1;
		String usuario_2;
		String usuario_3;
		usuario_1 = "Julio";
		usuario_2 = "Yelenis";
		usuario_3 = "Juel";
		registroingreso_1 = "";
		registroingreso_2 = "";
		registroingreso_3 = "";
		registrosalida_1 = "";
		registrosalida_2 = "";
		registrosalida_3 = "";
		registroarreglos_1 = "";
		registroarreglos_2 = "";
		registroarreglos_3 = "";
		do {
			System.out.println("Bienvenido al taller El Maquinista");
			System.out.println();
			System.out.println("       Menu de opciones");
			System.out.println("1. Registro de ingreso al taller");
			System.out.println("2. Registro salida del taller");
			System.out.println("3. Registro arreglos realizados");
			System.out.println("4. Mostrar registros de las motos");
			opcionmenu = Integer.parseInt(bufEntrada.readLine());
			System.out.println(); // no hay forma directa de borrar la consola en Java
			switch (opcionmenu) {
			case 1:
				System.out.println("Elegir una de los siguientes usuarios");
				System.out.println("__________________________");
				System.out.println("1. "+usuario_1);
				System.out.println("Moto: MT-D3");
				System.out.println("Marca: Yamaha");
				System.out.println("__________________________");
				System.out.println("2. "+usuario_2);
				System.out.println("Moto: GSXS 750");
				System.out.println("Marca: Suzuki");
				System.out.println("__________________________");
				System.out.println("3. "+usuario_3);
				System.out.println("Moto: CB 650");
				System.out.println("Marca: Honda");
				System.out.println("__________________________");
				do {
					System.out.print("Digite el usuario a registarar: ");
					opcionusuario = Integer.parseInt(bufEntrada.readLine());
					switch (opcionusuario) {
					case 1:
						System.out.print("Digite el registro de ingreso: ");
						registroingreso_1 = bufEntrada.readLine();
						break;
					case 2:
						System.out.print("Digite el registro de ingreso: ");
						registroingreso_2 = bufEntrada.readLine();
						break;
					case 3:
						System.out.print("Digite el registro de ingreso: ");
						registroingreso_3 = bufEntrada.readLine();
						break;
					}
				} while (!(!registroingreso_1.equals("")|!registroingreso_2.equals("")|!registroingreso_3.equals("")));
				System.out.println(); // no hay forma directa de borrar la consola en Java
				break;
			case 2:
				System.out.println("Elegir una de los siguientes usuarios");
				System.out.println("__________________________");
				System.out.println("1. "+usuario_1);
				System.out.println("Moto: MT-D3");
				System.out.println("Marca: Yamaha");
				System.out.println("__________________________");
				System.out.println("2. "+usuario_2);
				System.out.println("Moto: GSXS 750");
				System.out.println("Marca: Suzuki");
				System.out.println("__________________________");
				System.out.println("3. "+usuario_3);
				System.out.println("Moto: CB 650");
				System.out.println("Marca: Honda");
				System.out.println("__________________________");
				do {
					System.out.print("Digite el usuario a registarar: ");
					opcionusuario = Integer.parseInt(bufEntrada.readLine());
					switch (opcionusuario) {
					case 1:
						System.out.print("Digite el registro de Salida: ");
						registrosalida_1 = bufEntrada.readLine();
						break;
					case 2:
						System.out.print("Digite el registro de Salida: ");
						registrosalida_2 = bufEntrada.readLine();
						break;
					case 3:
						System.out.print("Digite el registro de Salida: ");
						registrosalida_3 = bufEntrada.readLine();
						break;
					}
				} while (!(!registrosalida_1.equals("")|!registrosalida_2.equals("")|!registrosalida_3.equals("")));
				System.out.println(); // no hay forma directa de borrar la consola en Java
				break;
			case 3:
				System.out.println("Elegir una de los siguientes usuarios");
				System.out.println("__________________________");
				System.out.println("1. "+usuario_1);
				System.out.println("Moto: MT-D3");
				System.out.println("Marca: Yamaha");
				System.out.println("__________________________");
				System.out.println("2. "+usuario_2);
				System.out.println("Moto: GSXS 750");
				System.out.println("Marca: Suzuki");
				System.out.println("__________________________");
				System.out.println("3. "+usuario_3);
				System.out.println("Moto: CB 650");
				System.out.println("Marca: Honda");
				System.out.println("__________________________");
				do {
					System.out.print("Digite el usuario a registarar: ");
					opcionusuario = Integer.parseInt(bufEntrada.readLine());
					switch (opcionusuario) {
					case 1:
						System.out.print("Digite el registro de Arreglos: ");
						registroarreglos_1 = bufEntrada.readLine();
						break;
					case 2:
						System.out.print("Digite el registro de Arreglos: ");
						registroarreglos_2 = bufEntrada.readLine();
						break;
					case 3:
						System.out.print("Digite el registro de Arreglos: ");
						registroarreglos_3 = bufEntrada.readLine();
						break;
					}
				} while (!(!registroarreglos_1.equals("")|!registroarreglos_2.equals("")|!registroarreglos_3.equals("")));
				System.out.println(); // no hay forma directa de borrar la consola en Java
				break;
			case 4:
				System.out.println("Elegir una de los siguientes usuarios");
				System.out.println("__________________________");
				System.out.println("1. "+usuario_1);
				System.out.println("Moto: MT-D3");
				System.out.println("Marca: Yamaha");
				System.out.println("__________________________");
				System.out.println("2. "+usuario_2);
				System.out.println("Moto: GSXS 750");
				System.out.println("Marca: Suzuki");
				System.out.println("__________________________");
				System.out.println("3. "+usuario_3);
				System.out.println("Moto: CB 650");
				System.out.println("Marca: Honda");
				System.out.println("__________________________");
				do {
					System.out.print("Digite el usuario a mostrar: ");
					opcionusuario = Integer.parseInt(bufEntrada.readLine());
					switch (opcionusuario) {
					case 1:
						System.out.println("El registro de ingreso:"+registroingreso_1);
						System.out.println("El registro de Salida:"+registrosalida_1);
						System.out.println("El registro de Arreglos:"+registroarreglos_1);
						break;
					case 2:
						System.out.println("El registro de ingreso:"+registroingreso_2);
						System.out.println("El registro de Salida:"+registrosalida_2);
						System.out.println("El registro de Arreglos:"+registroarreglos_2);
						break;
					case 3:
						System.out.println("El registro de ingreso:"+registroingreso_3);
						System.out.println("El registro de Salida:"+registrosalida_3);
						System.out.println("El registro de Arreglos:"+registroarreglos_3);
						break;
					default:
						System.out.println("El usuario no existe");
						System.out.println();
					}
				} while (!(opcionusuario==1 || opcionusuario==2 || opcionusuario==3));
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

