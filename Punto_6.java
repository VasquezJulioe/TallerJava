
import java.io.*;

public class Punto_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		boolean finalizar;
		String nombre_1;
		String nombre_2;
		String nombre_3;
		String nombre_bucar;
		int opcion;
		int opcion_b;
		int opcion_e;
		int opcion_eliminar = 0;
		String organizacion_1;
		String organizacion_2;
		String organizacion_3;
		String telefono_1;
		String telefono_2;
		String telefono_3;
		String terminar;
		nombre_1 = "";
		nombre_2 = "";
		nombre_3 = "";
		telefono_1 = "";
		telefono_2 = "";
		telefono_3 = "";
		organizacion_1 = "";
		organizacion_2 = "";
		organizacion_3 = "";
		finalizar = false;
		do {
			System.out.println("     Menu de usuario");
			System.out.println("1. Registrar nuevos usuarios");
			System.out.println("2. Buscar contactos almacenados");
			System.out.println("3. Eliminar contacto");
			System.out.println("4. Salir del sistema");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
				case 1 -> {
					System.out.print("Ingrese el nombre completo: ");
					nombre_1 = bufEntrada.readLine();
					System.out.print("Ingrese el numero de telefono: ");
					telefono_1 = bufEntrada.readLine();
					while (telefono_1.equals(telefono_2) || telefono_1.equals(telefono_3)) {
						System.out.println("El telefono ya esta registrado");
						System.out.print("Por favor digitar un telefono distinto: ");
						telefono_1 = bufEntrada.readLine();
					}
					System.out.print("Ingrese la organizacion: ");
					organizacion_1 = bufEntrada.readLine();
					System.out.println();
					System.out.println("Registro Exitoso");
					System.out.println();
					System.out.print("Ingrese el nombre completo: ");
					nombre_2 = bufEntrada.readLine();
					System.out.print("Ingrese el numero de telefono: ");
					telefono_2 = bufEntrada.readLine();
					while (telefono_1.equals(telefono_2) || telefono_2.equals(telefono_3)) {
						System.out.println("El telefono ya esta registrado");
						System.out.print("Por favor digitar un telefono distinto: ");
						telefono_2 = bufEntrada.readLine();
					}
					System.out.print("Ingrese la organizacion: ");
					organizacion_2 = bufEntrada.readLine();
					System.out.println();
					System.out.println("Registro Exitoso");
					System.out.println();
					System.out.print("Ingrese el nombre completo: ");
					nombre_3 = bufEntrada.readLine();
					System.out.print("Ingrese el numero de telefono: ");
					telefono_3 = bufEntrada.readLine();
					while (telefono_3.equals(telefono_2) || telefono_1.equals(telefono_3)) {
						System.out.println("El telefono ya esta registrado");
						System.out.print("Por favor digitar un telefono distinto: ");
						telefono_3 = bufEntrada.readLine();
					}
					System.out.print("Ingrese la organizacion: ");
					organizacion_3 = bufEntrada.readLine();
					System.out.println();
					System.out.println("Registro Exitoso");
					System.out.println();
				}
				// Contactos Almacenados
				case 2 -> {
					System.out.println("1. Mostrar contatos registrados");
					System.out.println("2. Buscar contacto por nombre");
					opcion_b = Integer.parseInt(bufEntrada.readLine());
					switch (opcion_b) {
						case 1 -> {
							System.out.println("1.   Usuario No1");
							System.out.println("Nombre completo: " + nombre_1);
							System.out.println("Numero de telefono: " + telefono_1);
							System.out.println("Organizacion: " + organizacion_1);
							System.out.println("2.   Usuario No2");
							System.out.println("Nombre completo: " + nombre_2);
							System.out.println("Numero de telefono: " + telefono_2);
							System.out.println("Organizacion: " + organizacion_2);
							System.out.println("3.   Usuario No3");
							System.out.println("Nombre completo: " + nombre_3);
							System.out.println("Numero de telefono: " + telefono_3);
							System.out.println("Organizacion: " + organizacion_3);
						}
						case 2 -> {
							System.out.print("Ingrese el nombre que desea buscar: ");
							nombre_bucar = bufEntrada.readLine();
							System.out.println(" ");
							if (nombre_bucar.equals(nombre_1)) {
								System.out.println("nombre completo: " + nombre_1);
								System.out.println("numero de telefono: " + telefono_1);
								System.out.println("Organizacion: " + organizacion_1);
							} else {
								if (nombre_bucar.equals(nombre_2)) {
									System.out.println("nombre completo: " + nombre_2);
									System.out.println("numero de telefono: " + telefono_2);
									System.out.println("Organizacion: " + organizacion_2);
								} else {
									if (nombre_bucar.equals(nombre_3)) {
										System.out.println("nombre completo: " + nombre_3);
										System.out.println("numero de telefono: " + telefono_3);
										System.out.println("Organizacion: " + organizacion_3);
									} else {
										System.out.println("El nombre no esta registado");
									}
								}
							}
						}
						default ->
								System.out.println("Seleccion erronea, por favor seleccionar una de las opciones existentes");
					}
					System.out.println(" ");
				}
				// Eliminar contacto
				case 3 -> {
					System.out.println("1. Mostrar contatos para eliminar");
					System.out.println("2. Buscar contacto por nombre");
					opcion_e = Integer.parseInt(bufEntrada.readLine());
					switch (opcion_e) {
						case 1 -> {
							System.out.println("1.   Usuario No1");
							System.out.println("Nombre completo: " + nombre_1);
							System.out.println("Numero de telefono: " + telefono_1);
							System.out.println("Organizacion: " + organizacion_1);
							System.out.println("2.   Usuario No2");
							System.out.println("Nombre completo: " + nombre_2);
							System.out.println("Numero de telefono: " + telefono_2);
							System.out.println("Organizacion: " + organizacion_2);
							System.out.println("3.   Usuario No3");
							System.out.println("Nombre completo: " + nombre_3);
							System.out.println("Numero de telefono: " + telefono_3);
							System.out.println("Organizacion: " + organizacion_3);
							System.out.println();
							System.out.println("Digite el usuario a eliminar");
							opcion_eliminar = Integer.parseInt(bufEntrada.readLine());
							switch (opcion_eliminar) {
								case 1 -> {
									nombre_1 = "";
									telefono_1 = "";
									organizacion_1 = "";
									System.out.println("Usuario No1 Eliminado");
								}
								case 2 -> {
									nombre_2 = "";
									telefono_2 = "";
									organizacion_2 = "";
									System.out.println("Usuario No2 Eliminado");
								}
								case 3 -> {
									nombre_3 = "";
									telefono_3 = "";
									organizacion_3 = "";
									System.out.println("Usuario No3 Eliminado");
								}
								default ->
										System.out.println("Seleccion erronea, por favor seleccionar una de las opciones existentes");
							}
						}
						case 2 -> {
							System.out.print("Ingrese el nombre que desea eliminar: ");
							nombre_bucar = bufEntrada.readLine();
							if (nombre_bucar.equals(nombre_1)) {
								System.out.println("Nombre completo: " + nombre_1);
								System.out.println("Numero de telefono: " + telefono_1);
								System.out.println("Organizacion: " + organizacion_1);
								opcion_eliminar = 1;
							} else {
								if (nombre_bucar.equals(nombre_2)) {
									System.out.println("Nombre completo: " + nombre_2);
									System.out.println("Numero de telefono: " + telefono_2);
									System.out.println("Organizacion: " + organizacion_2);
									opcion_eliminar = 2;
								} else {
									if (nombre_bucar.equals(nombre_3)) {
										System.out.println("Nombre completo: " + nombre_3);
										System.out.println("Numero de telefono: " + telefono_3);
										System.out.println("Organizacion: " + organizacion_3);
										opcion_eliminar = 3;
									} else {
										System.out.println("El nombre no esta registado");
									}
								}
							}
							switch (opcion_eliminar) {
								case 1 -> {
									nombre_1 = "";
									telefono_1 = "";
									organizacion_1 = "";
									System.out.println("Usuario No1 Eliminado");
								}
								case 2 -> {
									nombre_2 = "";
									telefono_2 = "";
									organizacion_2 = "";
									System.out.println("Usuario No2 Eliminado");
								}
								case 3 -> {
									nombre_3 = "";
									telefono_3 = "";
									organizacion_3 = "";
									System.out.println("Usuario No3 Eliminado");
								}
								default ->
										System.out.println("Seleccion erronea, por favor seleccionar una de las opciones existentes");
							}
						}
						default ->
								System.out.println("Seleccion erronea, por favor seleccionar una de las opciones existentes");
					}
					System.out.println(" ");
				}
				case 4 -> {
					System.out.println();
					System.out.print("Deseas salir del sistema? (S/N):");
					terminar = bufEntrada.readLine();
					if (terminar.equals("s") || terminar.equals("S")) {
						finalizar = true;
						System.out.println();
						System.out.println("Gracias por utilizar este programa!");
					} else {
						System.out.println(); // no hay forma directa de borrar la consola en Java
						System.out.println("Elige la accion que deseas realizar:");
						System.out.println();
					}
				}
				default ->
						System.out.println("Seleccion erronea, por favor seleccionar una de las opciones existentes");
			}
		} while (!(finalizar));
	}

}

