
import java.io.*;

public class Punto_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int contador;
		int solicitud;
		do {
			System.out.print("Ingrese el numero para la tabla que desea: ");
			solicitud = Integer.parseInt(bufEntrada.readLine());
		} while (solicitud<=0);
		System.out.println();
		System.out.println("La tabla del "+solicitud+" es la siguiente:");
		for (contador=1;contador<=10;contador++) {
			System.out.println(contador+" x "+solicitud+" = "+contador*solicitud);
		}
	}
}
