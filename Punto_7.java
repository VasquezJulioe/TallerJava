/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "INDICEMASACORPORAL.java."

import java.io.*;

public class Punto_7 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double estatura;
		double imc;
		double peso;
		String terminar;
		do {
			System.out.println("Calculo de IMC");
			System.out.print("Digite su estarura (mt):");
			estatura = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Digite su peso (Kg):");
			peso = Double.parseDouble(bufEntrada.readLine());
			// El IMC es el peso de una persona en kilogramos dividido por el cuadrado de la estatura en metros
			imc = peso/(estatura*estatura);
			System.out.println("Su indice de masa corporal es: "+imc);
			if (imc<18.5) {
				System.out.println("Su indice de masa corporal es: Bajo peso");
			}
			if (imc>=18.5 && 24.9>=imc) {
				System.out.println("Su indice de masa corporal es: Normal");
			}
			if (imc>=25.0 && 29.9>=imc) {
				System.out.println("Su indice de masa corporal es: Sobrepeso");
			}
			if (imc>=30) {
				System.out.println("Su indice de masa corporal es: Obeso");
			}
			System.out.println();
			System.out.print("Deseas salir del programa (S/N) ");
			terminar = bufEntrada.readLine();
			if (terminar.equals("s") || terminar.equals("S")) {
				System.out.println();
				System.out.println("Gracias!");
			} else {
				System.out.println();
			}
		} while (!(terminar.equals("s") || terminar.equals("S")));
	}


}

