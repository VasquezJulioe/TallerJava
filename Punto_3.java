public class Punto_3 {

	public static void main(String[] args) {
		int contador;
		int[] primos;
		primos = new int[500];
		for (contador=0;contador<=499;contador++) {
			primos[contador] = 2*contador+1;
			System.out.println(primos[contador]+" ");
		}
		System.out.println();
	}

}
