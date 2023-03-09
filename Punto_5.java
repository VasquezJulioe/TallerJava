
import java.io.*;

public class Punto_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int consultacolumna;
		int consultafila;
		int contadorcolumna;
		int contadorfila;
		String salir;
		int[][] tablamultiplicar;
		tablamultiplicar = new int[10][10];
		do {
			System.out.println("                                            Tabla de Multiplicar");
			for (contadorfila=0;contadorfila<=9;contadorfila++) {
				System.out.print("| ");
				for (contadorcolumna=0;contadorcolumna<=9;contadorcolumna++) {
					tablamultiplicar[contadorfila][contadorcolumna] = (contadorcolumna+1)*(contadorfila+1);
					if (contadorfila != 9) {
						System.out.print((contadorcolumna+1)+" x "+(contadorfila+1)+"  |  ");
					} else {
						System.out.print((contadorcolumna+1)+" x "+(contadorfila+1)+" |  ");
					}
				}
				System.out.println();
			}
			System.out.print("Inserte la columna la cual desea ver el resultado:");
			consultacolumna = Integer.parseInt(bufEntrada.readLine());
			System.out.print("Inserte la fila la cual desea ver el resultado:");
			consultafila = Integer.parseInt(bufEntrada.readLine());
			System.out.println("El resultado es: "+tablamultiplicar[consultacolumna-1][consultafila-1]);
			System.out.println();

			System.out.print("Desea salir del programa? (S/N): ");
			salir = bufEntrada.readLine();
			System.out.println(); // no hay forma directa de borrar la consola en Java
		} while (!(salir.equals("s") || salir.equals("S")));
	}

}
