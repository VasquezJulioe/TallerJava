
import java.io.*;

public class Punto_7 {
	static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

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

	public static void mostrartitular(String titular_1, String titular_2, String titular_3, String titular_4, String titular_5){
		System.out.println("Elegir una de los siguientes usuarios");
		System.out.println("__________________________");
		System.out.println("1. "+titular_1);
		System.out.println("__________________________");
		System.out.println("2. "+titular_2);
		System.out.println("__________________________");
		System.out.println("3. "+titular_3);
		System.out.println("__________________________");
		System.out.println("4. "+titular_4);
		System.out.println("__________________________");
		System.out.println("5. "+titular_5);
		System.out.println("__________________________");
	}

	public static void mostrarmenu() {
		System.out.println("Bienvenido a El Guardian");
		System.out.println();
		System.out.println("     Menu de opciones");
		System.out.println("1. Ingresar al parqueadero");
		System.out.println("2. Retirar del parqueadero");
		System.out.println("3. Realizar una consulta");
		System.out.println("4. Salir del programa");
	}

	public static void main(String[] args) throws IOException {
		int opcionmenu;
		int opcionusuario;
		boolean parqueado_1;
		boolean parqueado_2;
		boolean parqueado_3;
		boolean parqueado_4;
		boolean parqueado_5;
		int placatitular_1;
		int placatitular_2;
		int placatitular_3;
		int placatitular_4;
		int placatitular_5;
		String terminar;
		String titular_1;
		String titular_2;
		String titular_3;
		String titular_4;
		String titular_5;
		titular_1 = "vehiculo 1";
		titular_2 = "vehiculo 2";
		titular_3 = "vehiculo 3";
		titular_4 = "vehiculo 4";
		titular_5 = "vehiculo 5";
		placatitular_1 = 300;
		placatitular_2 = 250;
		placatitular_3 = 289;
		placatitular_4 = 579;
		placatitular_5 = 879;
		parqueado_1 = true;
		parqueado_2 = false;
		parqueado_3 = false;
		parqueado_4 = false;
		parqueado_5 = true;
		terminar = "";
		do {
			mostrarmenu();
			opcionmenu = Integer.parseInt(bufEntrada.readLine());
			System.out.println(); // no hay forma directa de borrar la consola en Java
			if (opcionmenu != 4) {
			mostrartitular(titular_1,titular_2,titular_3,titular_4,titular_5);
			}
			switch (opcionmenu) {
				case 1 -> {
					do {
						System.out.print("Digite el vehiculo a ingresar: ");
						opcionusuario = Integer.parseInt(bufEntrada.readLine());
						switch (opcionusuario) {
							case 1 -> {
								if (parqueado_1) {
									System.out.println("El vehiculo ya se encuentra en el parqueadero");
								} else {
									System.out.print(titular_1 + " ingresado");
									parqueado_1 = true;
								}
							}
							case 2 -> {
								if (parqueado_2) {
									System.out.println("El vehiculo ya se encuentra en el parqueadero");
								} else {
									System.out.print(titular_2 + " ingresado");
									parqueado_2 = true;
								}
							}
							case 3 -> {
								if (parqueado_3) {
									System.out.println("El vehiculo ya se encuentra en el parqueadero");
								} else {
									System.out.print(titular_3 + " ingresado");
									parqueado_3 = true;
								}
							}
							case 4 -> {
								if (parqueado_4) {
									System.out.println("El vehiculo ya se encuentra en el parqueadero");
								} else {
									System.out.print(titular_4 + " ingresado");
									parqueado_4 = true;
								}
							}
							case 5 -> {
								if (parqueado_5) {
									System.out.println("El vehiculo ya se encuentra en el parqueadero");
								} else {
									System.out.print(titular_5 + " ingresado");
									parqueado_5 = true;
								}
							}
						}
					} while (!(opcionusuario > 0 && 6 > opcionusuario));
				}
				case 2 -> {
					do {
						System.out.print("Digite el vehiculo que desea retirar: ");
						opcionusuario = Integer.parseInt(bufEntrada.readLine());
						switch (opcionusuario) {
							case 1 -> {
								if (!parqueado_1) {
									System.out.println("El vehiculo ya no se encuentra en el parqueadero");
								} else {
									System.out.println(titular_1 + " Retirado");
									parqueado_1 = false;
								}
							}
							case 2 -> {
								if (!parqueado_2) {
									System.out.println("El vehiculo ya no se encuentra en el parqueadero");
								} else {
									System.out.println(titular_2 + " Retirado");
									parqueado_2 = false;
								}
							}
							case 3 -> {
								if (!parqueado_3) {
									System.out.println("El vehiculo ya no se encuentra en el parqueadero");
								} else {
									System.out.println(titular_3 + " Retirado");
									parqueado_3 = false;
								}
							}
							case 4 -> {
								if (!parqueado_4) {
									System.out.println("El vehiculo ya no se encuentra en el parqueadero");
								} else {
									System.out.println(titular_4 + " Retirado");
									parqueado_4 = false;
								}
							}
							case 5 -> {
								if (!parqueado_5) {
									System.out.println("El vehiculo ya no se encuentra en el parqueadero");
								} else {
									System.out.println(titular_5 + " Retirado");
									parqueado_5 = false;
								}
							}
						}
					} while (!(opcionusuario > 0 && 6 > opcionusuario));
				}
				case 3 -> {
					do {
						System.out.print("Digite el usuario a consultar: ");
						opcionusuario = Integer.parseInt(bufEntrada.readLine());
						switch (opcionusuario) {
							case 1 -> {
								System.out.println("__________________________");
								System.out.println("1. " + titular_1);
								System.out.println("Nombre: Jose Rojas");
								System.out.println("Telefono: 3156475867");
								System.out.println("Placa: " + placatitular_1);
								System.out.println("Marca: Toyota");
								System.out.println("En parqueadero: " + parqueado_1);
								System.out.println("__________________________");
							}
							case 2 -> {
								System.out.println("__________________________");
								System.out.println("2. " + titular_2);
								System.out.println("Nombre: Yelenis Navarro");
								System.out.println("Telefono: 3165161249");
								System.out.println("Placa: " + placatitular_2);
								System.out.println("Marca: Chevrolet");
								System.out.println("En parqueadero: " + parqueado_2);
								System.out.println("__________________________");
							}
							case 3 -> {
								System.out.println("__________________________");
								System.out.println("3. " + titular_3);
								System.out.println("Nombre: Fulano Sutano");
								System.out.println("Telefono: 3004356786");
								System.out.println("Placa: " + placatitular_3);
								System.out.println("Marca: Toyota");
								System.out.println("En parqueadero: " + parqueado_3);
								System.out.println("__________________________");
							}
							case 4 -> {
								System.out.println("__________________________");
								System.out.println("4. " + titular_4);
								System.out.println("Nombre: Juan Arrieta");
								System.out.println("Telefono: 3163164089");
								System.out.println("Placa: " + placatitular_4);
								System.out.println("Marca: Jeep");
								System.out.println("En parqueadero: " + parqueado_4);
								System.out.println("__________________________");
							}
							case 5 -> {
								System.out.println("__________________________");
								System.out.println("5. " + titular_5);
								System.out.println("Nombre: Julio Vasquez");
								System.out.println("Telefono: 3186594878");
								System.out.println("Placa: " + placatitular_5);
								System.out.println("Marca: Hyunday");
								System.out.println("En parqueadero: " + parqueado_5);
								System.out.println("__________________________");
							}
						}
					} while (!(opcionusuario > 0 && 6 > opcionusuario));
				}
				case 4 -> terminar = funcionsalir();
				default -> System.out.println("La opcion no es valida");
			}
			System.out.println();
		} while (!(terminar.equals("s") || terminar.equals("S")));
	}

}
