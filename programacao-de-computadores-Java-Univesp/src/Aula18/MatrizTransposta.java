package Aula18;

public class MatrizTransposta {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = i;

				System.out.print("[ " + matriz[i][j] + " ]");

			}
			System.out.println(" ");
		}

		System.out.println("-----------------------");

		int[][] matrizTransposta = new int[3][3];

		for (int i = 0; i < matrizTransposta.length; i++) {

			for (int j = 0; j < matrizTransposta.length; j++) {

				matrizTransposta[i][j] = matriz[j][i];

				System.out.print("[ " + matrizTransposta[i][j] + " ]");

			}
			System.out.println(" ");
		}

	}

}
