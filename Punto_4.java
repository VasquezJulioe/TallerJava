public class Punto_4 {

	public static void main(String[] args) {
		int contadorcolumna;
		int contadorfila;
		String[][] matrizcreada;
		String[][] matrizquemada;
		matrizquemada = new String[4][5];
		matrizcreada = new String[4][5];
		matrizquemada[0][0] = "01";
		matrizquemada[0][1] = "02";
		matrizquemada[0][2] = "03";
		matrizquemada[0][3] = "04";
		matrizquemada[0][4] = "05";
		matrizquemada[1][0] = "06";
		matrizquemada[1][1] = "07";
		matrizquemada[1][2] = "08";
		matrizquemada[1][3] = "09";
		matrizquemada[1][4] = "10";
		matrizquemada[2][0] = "11";
		matrizquemada[2][1] = "12";
		matrizquemada[2][2] = "13";
		matrizquemada[2][3] = "14";
		matrizquemada[2][4] = "15";
		matrizquemada[3][0] = "16";
		matrizquemada[3][1] = "17";
		matrizquemada[3][2] = "18";
		matrizquemada[3][3] = "19";
		matrizquemada[3][4] = "20";
		System.out.print(matrizquemada[0][0]+" "+matrizquemada[0][1]+" "+matrizquemada[0][2]+" "+matrizquemada[0][3]+" "+matrizquemada[0][4]);
		System.out.println();
		System.out.print(matrizquemada[1][0]+" "+matrizquemada[1][1]+" "+matrizquemada[1][2]+" "+matrizquemada[1][3]+" "+matrizquemada[1][4]);
		System.out.println();
		System.out.print(matrizquemada[2][0]+" "+matrizquemada[2][1]+" "+matrizquemada[2][2]+" "+matrizquemada[2][3]+" "+matrizquemada[2][4]);
		System.out.println();
		System.out.print(matrizquemada[3][0]+" "+matrizquemada[3][1]+" "+matrizquemada[3][2]+" "+matrizquemada[3][3]+" "+matrizquemada[3][4]);
		System.out.println();
		System.out.println();

		System.out.println("Utilizando el conocimiento adquirido");
		for (contadorfila=0;contadorfila<=3;contadorfila++) {
			for (contadorcolumna=0;contadorcolumna<=4;contadorcolumna++) {
				if (contadorfila==0) {
					matrizcreada[contadorfila][contadorcolumna] = Double.toString(contadorcolumna + 1);
					System.out.print("0"+matrizcreada[contadorfila][contadorcolumna]+" ");
				}
				if (contadorfila==2) {
					matrizcreada[contadorfila][contadorcolumna] = Double.toString(contadorfila*5+contadorcolumna+1);
					System.out.print(matrizcreada[contadorfila][contadorcolumna]+" ");
				}
				if (contadorfila==1) {
					matrizcreada[contadorfila][contadorcolumna] = Double.toString(contadorfila*10-contadorcolumna);
					if (contadorfila*10-contadorcolumna==10) {
						System.out.print(matrizcreada[contadorfila][contadorcolumna]+" ");
					} else {
						System.out.print("0"+matrizcreada[contadorfila][contadorcolumna]+" ");
					}
				}
				if (contadorfila==3) {
					matrizcreada[contadorfila][contadorcolumna] = Double.toString(contadorfila*10-contadorcolumna-10);
					System.out.print(matrizcreada[contadorfila][contadorcolumna]+" ");
				}
			}
			System.out.println();
		}
	}


}

