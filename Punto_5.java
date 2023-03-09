
import java.io.*;

public class Punto_5{

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		boolean bandera;
		int cantcaja_1;
		int cantcaja_2;
		int cantcaja_3;
		int cantcaja_4;
		int cantcomprar;
		int cantmedic_1;
		int cantmedic_2;
		int cantmedic_3;
		int cantmedic_4;
		int cantmedidisponible;
		cantmedidisponible = 1;
		String medic;
		String medic_1;
		String medic_2;
		String medic_3;
		String medic_4;
		int opcioncompra;
		int opcionmenu;
		double preciocomprado;
		double preciomedic_1;
		double preciomedic_2;
		double preciomedic_3;
		double preciomedic_4;
		String terminar;
		double total_factura;
		medic = "";
		medic_1 = "Aspirina";
		medic_2 = "Omeprazol";
		medic_3 = "Paracetamol";
		medic_4 = "Acetaminofen";
		preciomedic_1 = 47.8;
		preciomedic_2 = 75.7;
		preciomedic_3 = 58.3;
		preciomedic_4 = 24.5;
		cantmedic_1 = 5;
		cantmedic_2 = 6;
		cantmedic_3 = 8;
		cantmedic_4 = 9;
		cantcaja_1 = 5;
		cantcaja_2 = 6;
		cantcaja_3 = 8;
		cantcaja_4 = 9;
		total_factura = 0;
		cantcomprar = 0;
		preciocomprado = 0;
		do {
			System.out.println("Bienvenido a la Drogueria mi Salud");
			System.out.println();
			System.out.println("   Menu de opciones");
			System.out.println("1. Compra de productos");
			System.out.println("2. Consultar precios");
			System.out.println("3. Devolucion de producto");
			System.out.println("4. Generar factura");
			opcionmenu = Integer.parseInt(bufEntrada.readLine());
			bandera = true;
			System.out.println(); // no hay forma directa de borrar la consola en Java
			switch (opcionmenu) {
			case 1:
				System.out.println("Elegir una de las siguientes medicamentos");
				System.out.println("__________________________");
				System.out.println("1. "+medic_1);
				System.out.println("Sirve: "+"Casi para todo");
				System.out.println("Unidades en Caja: 16");
				System.out.println("Precio: "+preciomedic_1+" pesos");
				System.out.println("Disponibles: "+cantmedic_1);
				System.out.println("__________________________");
				System.out.println("2. "+medic_2);
				System.out.println("Sirve: "+"Para la acidez del estomago");
				System.out.println("Unidades en Caja: 10");
				System.out.println("Precio: "+preciomedic_2+" pesos");
				System.out.println("Disponibles: "+cantmedic_2);
				System.out.println("__________________________");
				System.out.println("3. "+medic_3);
				System.out.println("Sirve: "+"Para aliviar el dolor");
				System.out.println("Unidades en Caja: 8");
				System.out.println("Precio: "+preciomedic_3+" pesos");
				System.out.println("Disponibles: "+cantmedic_3);
				System.out.println("__________________________");
				System.out.println("4. "+medic_4);
				System.out.println("Sirve: "+"Para el dolor ligero o moderado");
				System.out.println("Unidades en Caja: 6");
				System.out.println("Precio: "+preciomedic_4+" pesos");
				System.out.println("Disponibles: "+cantmedic_4);
				System.out.println("__________________________");
				System.out.print("Eliga el producto a comprar: ");
				opcioncompra = Integer.parseInt(bufEntrada.readLine());
				do {
					System.out.print("Ingrese la cantidad que desee comprar: ");
					cantcomprar = Integer.parseInt(bufEntrada.readLine());
				} while (cantcomprar<=0);
				System.out.println(); // no hay forma directa de borrar la consola en Java
				switch (opcioncompra) {
				case 1:
					medic = medic_1;
					cantmedidisponible = cantmedic_1;
					preciocomprado = preciomedic_1;
					break;
				case 2:
					medic = medic_2;
					cantmedidisponible = cantmedic_2;
					preciocomprado = preciomedic_2;
					break;
				case 3:
					medic = medic_3;
					cantmedidisponible = cantmedic_3;
					preciocomprado = preciomedic_3;
					break;
				case 4:
					medic = medic_4;
					cantmedidisponible = cantmedic_4;
					preciocomprado = preciomedic_4;
					break;
				default:
					System.out.println("La opcion no es valida");
					bandera = false;
				}
				if ((cantmedidisponible >= cantcomprar) && bandera) {
					total_factura = total_factura+cantcomprar*preciocomprado;
					switch (opcioncompra) {
					case 1:
						cantmedic_1 = cantmedic_1-cantcomprar;
						break;
					case 2:
						cantmedic_2 = cantmedic_2-cantcomprar;
						break;
					case 3:
						cantmedic_3 = cantmedic_3-cantcomprar;
						break;
					case 4:
						cantmedic_4 = cantmedic_4-cantcomprar;
						break;
					default:
						System.out.print("");
					}
					System.out.println("El medicamento "+medic+" fue añadido a la facura.");
					System.out.println("La compra tiene un valor de: "+total_factura+" pesos");
				} else {
					System.out.println("No hay esa cantidad, por favor revisar disponibilidad.");
				}
				break;
			case 2:
				System.out.println("Los precios son los siguientes");
				System.out.println("__________________________");
				System.out.println("1. "+medic_1);
				System.out.println("Sirve: "+"Casi para todo");
				System.out.println("Unidades en Caja: 16");
				System.out.println("Precio: "+preciomedic_1+" pesos");
				System.out.println("Disponibles: "+cantmedic_1);
				System.out.println("__________________________");
				System.out.println("2. "+medic_2);
				System.out.println("Sirve: "+"Para la acidez del estomago");
				System.out.println("Unidades en Caja: 10");
				System.out.println("Precio: "+preciomedic_2+" pesos");
				System.out.println("Disponibles: "+cantmedic_2);
				System.out.println("__________________________");
				System.out.println("3. "+medic_3);
				System.out.println("Sirve: "+"Para aliviar el dolor");
				System.out.println("Unidades en Caja: 8");
				System.out.println("Precio: "+preciomedic_3+" pesos");
				System.out.println("Disponibles: "+cantmedic_3);
				System.out.println("__________________________");
				System.out.println("4. "+medic_4);
				System.out.println("Sirve: "+"Para el dolor ligero o moderado");
				System.out.println("Unidades en Caja: 6");
				System.out.println("Precio: "+preciomedic_4+" pesos");
				System.out.println("Disponibles: "+cantmedic_4);
				System.out.println("__________________________");
				break;
			case 3:
				System.out.println("Elegir el medicamento a devolver: ");
				System.out.println("__________________________");
				System.out.println("1. "+medic_1);
				System.out.println("Sirve: "+"Casi para todo");
				System.out.println("Unidades en Caja: 16");
				System.out.println("Precio: "+preciomedic_1+" pesos");
				System.out.println("Disponibles: "+cantmedic_1);
				System.out.println("__________________________");
				System.out.println("2. "+medic_2);
				System.out.println("Sirve: "+"Para la acidez del estomago");
				System.out.println("Unidades en Caja: 10");
				System.out.println("Precio: "+preciomedic_2+" pesos");
				System.out.println("Disponibles: "+cantmedic_2);
				System.out.println("__________________________");
				System.out.println("3. "+medic_3);
				System.out.println("Sirve: "+"Para aliviar el dolor");
				System.out.println("Unidades en Caja: 8");
				System.out.println("Precio: "+preciomedic_3+" pesos");
				System.out.println("Disponibles: "+cantmedic_3);
				System.out.println("__________________________");
				System.out.println("4. "+medic_4);
				System.out.println("Sirve: "+"Para el dolor ligero o moderado");
				System.out.println("Unidades en Caja: 6");
				System.out.println("Precio: "+preciomedic_4+" pesos");
				System.out.println("Disponibles: "+cantmedic_4);
				System.out.println("__________________________");
				System.out.print("Eliga el producto a devolver");
				opcioncompra = Integer.parseInt(bufEntrada.readLine());
				do {
					System.out.print("Ingrese la cantidad que desee devolver:");
					cantcomprar = Integer.parseInt(bufEntrada.readLine());
				} while (cantcomprar<=0);
				System.out.println(); // no hay forma directa de borrar la consola en Java
				switch (opcioncompra) {
				case 1:
					medic = medic_1;
					cantmedidisponible = cantmedic_1;
					preciocomprado = preciomedic_1;
					break;
				case 2:
					medic = medic_2;
					cantmedidisponible = cantmedic_2;
					preciocomprado = preciomedic_2;
					break;
				case 3:
					medic = medic_3;
					cantmedidisponible = cantmedic_3;
					preciocomprado = preciomedic_3;
					break;
				case 4:
					medic = medic_4;
					cantmedidisponible = cantmedic_4;
					preciocomprado = preciomedic_4;
					break;
				default:
					System.out.println("La opcion no es valida");
					bandera = false;
				}
				if (bandera) {
					total_factura = total_factura-cantcomprar*preciocomprado;
					switch (opcioncompra) {
					case 1:
						cantmedic_1 = cantmedic_1+cantcomprar;
						break;
					case 2:
						cantmedic_2 = cantmedic_2+cantcomprar;
						break;
					case 3:
						cantmedic_3 = cantmedic_3+cantcomprar;
						break;
					case 4:
						cantmedic_4 = cantmedic_4+cantcomprar;
						break;
					default:
						System.out.print("");
					}
					System.out.println("El medicamento "+medic+" fue devuelto exitosamente.");
					System.out.println("La devolucion le retorna un valor de: "+cantcomprar*preciocomprado+" pesos");
				} else {
					System.out.println("No hay esa cantidad, por favor revisar disponibilidad.");
				}
				break;
			case 4:
				if (!medic.equals("")) {
					System.out.println();
					System.out.println("Total en factura");
					System.out.println("Medicamento: "+medic);
					System.out.println("Cantidad: "+cantcomprar);
					System.out.println("Precio: "+preciocomprado);
					System.out.println(total_factura+" pesos");
				} else {
					System.out.println("No se ha generado ninguna compra");
					System.out.println(" ");
				}
				break;
			default:
				System.out.println("La opcion no es valida");
			}
			System.out.print("");
			System.out.println("Deseas salir de la drogeria? (S/N)");
			terminar = bufEntrada.readLine();
			if (terminar.equals("s") || terminar.equals("S")) {
				System.out.println();
				System.out.println("Total en factura");
				System.out.println(total_factura+" pesos");
				System.out.println("Gracias! Por comprar en mi Salud!");
			} else {
				System.out.println(); // no hay forma directa de borrar la consola en Java
				System.out.println("Nueva operacion:");
			}
		} while (!(terminar.equals("s") || terminar.equals("S")));
	}


}

