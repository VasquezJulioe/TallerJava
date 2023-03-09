
import java.io.*;

public class Punto_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		boolean almacen;
		int cantalmendra;
		int cantfresa;
		int cantidadtorta;
		int cantmousse;
		int cantnutella;
		String decoracion;
		String direccion;
		boolean finalizar;
		int identificacion;
		String nombrecompleto;
		int opcion;
		int opcionsabor;
		int opciontorta;
		double precio = 0;
		double precioalmendra;
		double preciofresa;
		double preciomousse;
		double precionutella;
		String sabor;
		String terminar;
		String torta = "";
		double total_dia;
		almacen = true;
		finalizar = false;
		// venta inicial del dia
		total_dia = 100;
		// chocolate
		cantnutella = 1;
		cantmousse = 6;
		// vainilla
		cantfresa = 2;
		cantalmendra = 3;
		// precio de las tortas
		precionutella = 10;
		preciomousse = 70;
		preciofresa = 20;
		precioalmendra = 30;
		do {
			System.out.println("Bienvenidos a la panaderia");
			System.out.println("1. Establecer pedido");
			System.out.println("2. Tortas disponibles");
			System.out.println("3. Ventas del Dia");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Elegir uno de los sabores");
				System.out.println("1. Chocolate");
				System.out.println("2. Vainilla");
				opcionsabor = Integer.parseInt(bufEntrada.readLine());
				System.out.println(); // no hay forma directa de borrar la consola en Java
				switch (opcionsabor) {
				case 1:
					System.out.println("Elegir una de las siguientes tortas de Chocolate");
					System.out.println(" ");
					System.out.println("1. Torta de Nutella");
					System.out.println("__________________________");
					System.out.println("Sabor: Chocolate");
					System.out.println("Relleno: Arequipe y leche condensada");
					System.out.println("Decoracion: Cacahuates");
					System.out.println("Porciones: 18");
					System.out.println("Precio: "+precionutella+" pesos");
					System.out.println("Disponibles: "+cantnutella);
					System.out.println(" ");
					System.out.println("2. Torta Mousse");
					System.out.println("__________________________");
					System.out.println("Sabor: Chocolate");
					System.out.println("Relleno: Ganache");
					System.out.println("Decoracion: Geometrico");
					System.out.println("Porciones: 12");
					System.out.println("Precio : "+preciomousse+" pesos");
					System.out.println("Disponibles: "+cantmousse);
					System.out.println();
					opciontorta = Integer.parseInt(bufEntrada.readLine());
					// Limpiar Pantalla
					switch (opciontorta) {
					case 1:
						torta = "Torta de Nutella";
						precio = precionutella;
						break;
					case 2:
						torta = "Torta Mousse";
						precio = precionutella;
						break;
					default:
						System.out.println("La opcion elegida NO existe");
					}
					break;
				case 2:
					System.out.println("Elegir una de las siguientes tortas de Vainilla");
					System.out.println(" ");
					System.out.println("1. Torta de Fresa");
					System.out.println(" __________________________");
					System.out.println("Sabor: Vainilla");
					System.out.println("Relleno: Fresa");
					System.out.println("Decoracion: Frutal");
					System.out.println("Porciones: 12");
					System.out.println("Precio: "+preciofresa+" pesos");
					System.out.println("Disponibles: "+cantfresa);
					System.out.println(" ");
					System.out.println("2. Torta de Almendra");
					System.out.println(" __________________________");
					System.out.println("Sabor: Vainilla");
					System.out.println("Relleno: Manjar blanco");
					System.out.println("Decoracion: Azucar moreno");
					System.out.println("Porciones: 30");
					System.out.println("Precio: "+precioalmendra+" pesos");
					System.out.println("Disponibles: "+cantalmendra);
					System.out.println();
					opciontorta = Integer.parseInt(bufEntrada.readLine());
					// Limpiar Pantalla
					switch (opciontorta) {
					case 1:
						torta = "Torta de Fresa";
						precio = preciofresa;
						break;
					case 2:
						torta = "Torta de Almendra";
						precio = precioalmendra;
						break;
					default:
						System.out.println("La opcion elegida NO existe");
					}
					break;
				default:
					System.out.println("La opcion elegida NO existe");
				}
				System.out.println("Ingrese la cantidad que desee ordenar:");
				cantidadtorta = Integer.parseInt(bufEntrada.readLine());
				if (torta.equals("Torta de Nutella")) {
					if (cantnutella>=cantidadtorta && cantidadtorta>0) {
						cantnutella = cantnutella-cantidadtorta;
						almacen = true;
					} else {
						System.out.println("No hay esa cantidad, por favor revisar disponibilidad.");
						almacen = false;
					}
				} else {
					if (torta.equals("Torta Mousse")) {
						if (cantmousse>=cantidadtorta && cantidadtorta>0) {
							cantmousse = cantmousse-cantidadtorta;
							almacen = true;
						} else {
							System.out.println("No hay esa cantidad, por favor revisar disponibilidad.");
							almacen = false;
						}
					} else {
						if (torta.equals("Torta de Fresa")) {
							if (cantfresa>=cantidadtorta && cantidadtorta>0) {
								cantfresa = cantfresa-cantidadtorta;
								almacen = true;
							} else {
								System.out.println("No hay esa cantidad, por favor revisar disponibilidad.");
								almacen = false;
							}
						} else {
							if (torta.equals("Torta de Almendra")) {
								if (cantalmendra>=cantidadtorta && cantidadtorta>0) {
									cantalmendra = cantalmendra-cantidadtorta;
									almacen = true;
								} else {
									System.out.println("No hay esa cantidad, por favor revisar disponibilidad.");
									almacen = false;
								}
							}
						}
					}
				}
				if (almacen) {
					System.out.println("Ingrese sus datos");
					System.out.println("Ingrese nombre completo");
					nombrecompleto = bufEntrada.readLine();
					System.out.println("Ingrese identificacion");
					identificacion = Integer.parseInt(bufEntrada.readLine());
					System.out.println("Ingrese direccion");
					direccion = bufEntrada.readLine();
					System.out.println(" ");
					System.out.println("__________Detalle de la Compra__________");
					System.out.println("Comprador: "+nombrecompleto);
					System.out.println("Id: "+identificacion);
					System.out.println("Direccion: "+direccion);
					System.out.println("Cantidad de tortas: "+cantidadtorta+" "+torta+" -Precio por und: "+precio+" pesos");
					System.out.println("Total del pedido: "+cantidadtorta*precio);
					System.out.println("Favor de realizar el pago en la caja para hacer la entrega");
					precio = precio*cantidadtorta;
					total_dia = total_dia+precio;
				}
				break;
			case 2:
				System.out.println("Tortas disponibles");
				if (cantnutella>0) {
					System.out.println(cantnutella+" und. Torta de Nutella "+precionutella+" pesos");
				}
				if (cantmousse>0) {
					System.out.println(cantmousse+" und. Torta Mousse "+preciomousse+" pesos");
				}
				if (cantfresa>0) {
					System.out.println(cantfresa+" und. Torta de Fresa "+preciofresa+" pesos");
				}
				if (cantalmendra>0) {
					System.out.println(cantalmendra+" und. Torta de Almendra "+precioalmendra+" pesos");
				}
				break;
			case 3:
				System.out.println("Venta Total del dia");
				System.out.println(total_dia+" pesos");
				break;
			default:
				System.out.println("La opcion elegida NO existe");
			}
			System.out.println();
			System.out.println("Deseas terminar el dia? (S/N)");
			terminar = bufEntrada.readLine();
			if (terminar.equals("s") || terminar.equals("S")) {
				finalizar = true;
				System.out.println();
				System.out.println("Total ventas del dia");
				System.out.println(total_dia+" pesos");
				System.out.println("Gracias! Por utilizar este programa!");
			} else {
				System.out.println(); // no hay forma directa de borrar la consola en Java
				System.out.println("Elige la operacion que deseas realizar:");
			}
		} while (!(finalizar));
	}


}

