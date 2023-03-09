public class Punto_2 {

	public static void main(String[] args) {
		int asterisco;
		int fila = 0;
		int espacios;
		while (fila<10) {
			espacios = fila;
			while (espacios<9) {
				espacios = espacios+1;
				System.out.print(" ");
			}
			asterisco = fila+1;
			while (asterisco>0) {
				asterisco = asterisco-1;
				System.out.print("*");
			}
			fila = fila+1;
			System.out.println();
		}
	}
}

