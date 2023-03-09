
import java.io.*;

public class Punto_8 {
	static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	public static boolean comprobaraprobacion(double puntajetitular) {
		boolean aprobado;
		if (puntajetitular>59) {
			aprobado = true;
			System.out.println("Aprobado.");
		} else {
			aprobado = false;
			System.out.println("Reprobado.");
		}
		return aprobado;
	}

	public static String funcionsalir() throws IOException {
		String terminar;
		System.out.println();
		System.out.print("Deseas salir del taller (S/N): ");
		terminar = bufEntrada.readLine();
		if (terminar.equals("s") || terminar.equals("S")) {
			System.out.println();
			System.out.println("Gracias! Por elegirnos!");
		} else {
			System.out.println();
		}
		return terminar;
	}

	public static void mostrartitular(String titular_1, String titular_2, String titular_3, String titular_4, String titular_5, String titular_6, String titular_7, String titular_8) {
		System.out.println("Elegir una de los siguientes usuarios");
		System.out.println("__________________________");
		System.out.println("1. "+titular_1);
		System.out.println("2. "+titular_2);
		System.out.println("3. "+titular_3);
		System.out.println("4. "+titular_4);
		System.out.println("5. "+titular_5);
		System.out.println("6. "+titular_6);
		System.out.println("7. "+titular_7);
		System.out.println("8. "+titular_8);
		System.out.println("__________________________");
	}

	public static void mostrarmenu() {
		System.out.println("Bienvenido a la escuela El Maestro");
		System.out.println();
		System.out.println("     Menu de opciones");
		System.out.println("1. Registrar usuario");
		System.out.println("2. Ingresar al curso");
		System.out.println("3. Consultar las pruebas");
		System.out.println("4. Salir del programa");
	}

	public static void main(String[] args) throws IOException {
		boolean aprobado_1;
		boolean aprobado_2;
		boolean aprobado_3;
		boolean aprobado_4;
		boolean aprobado_5;
		boolean aprobado_6;
		boolean aprobado_7;
		boolean aprobado_8;
		int opcionmenu;
		int opcionusuario;
		int puntajetitular_1;
		int puntajetitular_2;
		int puntajetitular_3;
		int puntajetitular_4;
		int puntajetitular_5;
		int puntajetitular_6;
		int puntajetitular_7;
		int puntajetitular_8;
		String terminar;
		String titular_1;
		String titular_2;
		String titular_3;
		String titular_4;
		String titular_5;
		String titular_6;
		String titular_7;
		String titular_8;
		titular_1 = "Jose";
		titular_2 = "Daniel";
		titular_3 = "Juan";
		titular_4 = "Yele";
		titular_5 = "Julio";
		titular_6 = "Juel";
		titular_7 = "Victoria";
		titular_8 = "Victor";
		puntajetitular_1 = 60;
		puntajetitular_2 = 55;
		puntajetitular_3 = 45;
		puntajetitular_4 = 75;
		puntajetitular_5 = 87;
		puntajetitular_6 = 80;
		puntajetitular_7 = 97;
		puntajetitular_8 = 77;
		aprobado_1 = true;
		aprobado_2 = false;
		aprobado_3 = false;
		aprobado_4 = true;
		aprobado_5 = true;
		aprobado_6 = true;
		aprobado_7 = true;
		aprobado_8 = true;
		terminar = "";
		do {
			mostrarmenu();
			opcionmenu = Integer.parseInt(bufEntrada.readLine());
			System.out.println(); // no hay forma directa de borrar la consola en Java
			if (opcionmenu != 4) {
			mostrartitular(titular_1,titular_2,titular_3,titular_4,titular_5,titular_6,titular_7,titular_8);
			}
			switch (opcionmenu) {
				case 1 -> {
					do {
						System.out.print("Digite el usuario a registrar: ");
						opcionusuario = Integer.parseInt(bufEntrada.readLine());
						switch (opcionusuario) {
							case 1 -> {
								System.out.print("Ingrese el nombre del usuario:");
								titular_1 = bufEntrada.readLine();
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_1 = Integer.parseInt(bufEntrada.readLine());
								aprobado_1 = comprobaraprobacion(puntajetitular_1);
							}
							case 2 -> {
								System.out.print("Ingrese el nombre del usuario:");
								titular_2 = bufEntrada.readLine();
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_2 = Integer.parseInt(bufEntrada.readLine());
								aprobado_2 = comprobaraprobacion(puntajetitular_2);
							}
							case 3 -> {
								System.out.print("Ingrese el nombre del usuario:");
								titular_3 = bufEntrada.readLine();
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_3 = Integer.parseInt(bufEntrada.readLine());
								aprobado_3 = comprobaraprobacion(puntajetitular_3);
							}
							case 4 -> {
								System.out.print("Ingrese el nombre del usuario:");
								titular_4 = bufEntrada.readLine();
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_4 = Integer.parseInt(bufEntrada.readLine());
								aprobado_4 = comprobaraprobacion(puntajetitular_4);
							}
							case 5 -> {
								System.out.print("Ingrese el nombre del usuario:");
								titular_5 = bufEntrada.readLine();
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_5 = Integer.parseInt(bufEntrada.readLine());
								aprobado_5 = comprobaraprobacion(puntajetitular_5);
							}
							case 6 -> {
								System.out.print("Ingrese el nombre del usuario:");
								titular_6 = bufEntrada.readLine();
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_6 = Integer.parseInt(bufEntrada.readLine());
								aprobado_6 = comprobaraprobacion(puntajetitular_6);
							}
							case 7 -> {
								System.out.print("Ingrese el nombre del usuario:");
								titular_7 = bufEntrada.readLine();
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_7 = Integer.parseInt(bufEntrada.readLine());
								aprobado_7 = comprobaraprobacion(puntajetitular_7);
							}
							case 8 -> {
								System.out.print("Ingrese el nombre del usuario:");
								titular_8 = bufEntrada.readLine();
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_8 = Integer.parseInt(bufEntrada.readLine());
								aprobado_8 = comprobaraprobacion(puntajetitular_8);
							}
						}
					} while (!(opcionusuario > 0 && 9 > opcionusuario));
				}
				case 2 -> {
					do {
						System.out.print("Digite el usuario a ingresar: ");
						opcionusuario = Integer.parseInt(bufEntrada.readLine());
						switch (opcionusuario) {
							case 1 -> {
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_1 = Integer.parseInt(bufEntrada.readLine());
								aprobado_1 = comprobaraprobacion(puntajetitular_1);
							}
							case 2 -> {
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_2 = Integer.parseInt(bufEntrada.readLine());
								aprobado_2 = comprobaraprobacion(puntajetitular_2);
							}
							case 3 -> {
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_3 = Integer.parseInt(bufEntrada.readLine());
								aprobado_3 = comprobaraprobacion(puntajetitular_3);
							}
							case 4 -> {
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_4 = Integer.parseInt(bufEntrada.readLine());
								aprobado_4 = comprobaraprobacion(puntajetitular_4);
							}
							case 5 -> {
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_5 = Integer.parseInt(bufEntrada.readLine());
								aprobado_5 = comprobaraprobacion(puntajetitular_5);
							}
							case 6 -> {
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_6 = Integer.parseInt(bufEntrada.readLine());
								aprobado_6 = comprobaraprobacion(puntajetitular_6);
							}
							case 7 -> {
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_7 = Integer.parseInt(bufEntrada.readLine());
								aprobado_7 = comprobaraprobacion(puntajetitular_7);
							}
							case 8 -> {
								System.out.print("Ingrese el puntaje del usuario:");
								puntajetitular_8 = Integer.parseInt(bufEntrada.readLine());
								aprobado_8 = comprobaraprobacion(puntajetitular_8);
							}
						}
					} while (!(opcionusuario > 0 && 9 > opcionusuario));
				}
				case 3 -> {
					do {
						System.out.print("Digite el usuario a consultar: ");
						opcionusuario = Integer.parseInt(bufEntrada.readLine());
						switch (opcionusuario) {
							case 1 -> {
								System.out.println("__________________________");
								System.out.println("1. Usuario 1");
								System.out.println("Nombre: " + titular_1);
								System.out.println("Calificacion: " + puntajetitular_1);
								System.out.println("Aprobacion: " + aprobado_1);
								System.out.println("__________________________");
							}
							case 2 -> {
								System.out.println("__________________________");
								System.out.println("2. Usuario 2");
								System.out.println("Nombre: " + titular_2);
								System.out.println("Calificacion: " + puntajetitular_2);
								System.out.println("Aprobacion: " + aprobado_2);
								System.out.println("__________________________");
							}
							case 3 -> {
								System.out.println("__________________________");
								System.out.println("3. Usuario 3");
								System.out.println("Nombre: " + titular_3);
								System.out.println("Calificacion: " + puntajetitular_3);
								System.out.println("Aprobacion: " + aprobado_3);
								System.out.println("__________________________");
							}
							case 4 -> {
								System.out.println("__________________________");
								System.out.println("4. Usuario 4");
								System.out.println("Nombre: " + titular_4);
								System.out.println("Calificacion: " + puntajetitular_4);
								System.out.println("Aprobacion: " + aprobado_4);
								System.out.println("__________________________");
							}
							case 5 -> {
								System.out.println("__________________________");
								System.out.println("5. Usuario 5");
								System.out.println("Nombre: " + titular_5);
								System.out.println("Calificacion: " + puntajetitular_5);
								System.out.println("Aprobacion: " + aprobado_5);
								System.out.println("__________________________");
							}
							case 6 -> {
								System.out.println("__________________________");
								System.out.println("6. Usuario 6");
								System.out.println("Nombre: " + titular_6);
								System.out.println("Calificacion: " + puntajetitular_6);
								System.out.println("Aprobacion: " + aprobado_6);
								System.out.println("__________________________");
							}
							case 7 -> {
								System.out.println("__________________________");
								System.out.println("7. Usuario 7");
								System.out.println("Nombre: " + titular_7);
								System.out.println("Calificacion: " + puntajetitular_7);
								System.out.println("Aprobacion: " + aprobado_7);
								System.out.println("__________________________");
							}
							case 8 -> {
								System.out.println("__________________________");
								System.out.println("8. Usuario 8");
								System.out.println("Nombre: " + titular_8);
								System.out.println("Calificacion: " + puntajetitular_8);
								System.out.println("Aprobacion: " + aprobado_8);
								System.out.println("__________________________");
							}
							default -> System.out.println("El usuario no existe.");
						}
					} while (!(opcionusuario > 0 && 9 > opcionusuario));
				}
				case 4 -> terminar = funcionsalir();
				default -> System.out.println("La opcion no es valida");
			}
			System.out.println();
		} while (!(terminar.equals("s") || terminar.equals("S")));
	}

}
