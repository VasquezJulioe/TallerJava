
import java.io.*;

public class Punto_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int interaciones;
		int valoringresado;
		int[] vectores = new int[5];
		for (interaciones=0;interaciones<=4;interaciones++) {
			System.out.print("Digite el valor a ingresar en la posicion "+interaciones+": ");
			valoringresado = Integer.parseInt(bufEntrada.readLine());
			vectores[interaciones] = valoringresado;
		}
		for (interaciones=0;interaciones<=4;interaciones++) {
			System.out.println("["+interaciones+"] = "+vectores[interaciones]);
		}
	}

}
