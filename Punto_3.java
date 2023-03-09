
public class Punto_3 {

	public static void main(String[] args) {
		String c;
		int f;
		int i;
		int m;
		int n;
		int v;
		n = 11;
		m = 0;
		v = 0;
		f = 0;
		i = 1;
		c = "*";
		// piramide inicial
		System.out.print("_");
		do {
			f = f+1;
			// Espacios a la izquierda
			do {
				System.out.print(" ");
				i = i+1;
			} while (i<=n-f);
			i = 0;
			// Piramide central
			do {
				System.out.print(c);
				i = i+1;
			} while (i<2*f-1);
			i = 0;
			System.out.println(" ");
		} while (f<n);
		// Tronco del arbol
		do {
			m = m+1;
			do {
				v = v+1;
				System.out.print(" ");
			} while (v<=9);
			v = 0;
			System.out.print("***");
			System.out.println();
		} while (m<=1);
		System.out.println("         *****");
		System.out.println("        *******");
	}


}

