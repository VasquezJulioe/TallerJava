public class Punto_2 {

	public static void main(String[] args) {
		int contador;
		int[] vector;
		int[] vectortemporal;
		vector = new int[20];
		vectortemporal = new int[20];
		for (contador=0;contador<=19;contador++) {
			vector[contador] = (int) Math.floor(Math.random()*101);
			System.out.print(vector[contador]+" ");
			vectortemporal[contador] = (vector[contador])%2;
			System.out.println(vectortemporal[contador]);
		}
		System.out.print("Numero pares: ");
		for (contador=0;contador<=19;contador++) {
			if (vectortemporal[contador]==0) {
				System.out.print(vector[contador]+", ");
			}
		}
		System.out.println();
		System.out.print("Numero impares: ");
		for (contador=0;contador<=19;contador++) {
			if (vectortemporal[contador]==1) {
				System.out.print(vector[contador]+", ");
			}
		}
		System.out.println();
	}


}

