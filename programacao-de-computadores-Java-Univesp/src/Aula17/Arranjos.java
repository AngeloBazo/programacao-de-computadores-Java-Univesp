package Aula17;

public class Arranjos {

	public static void main(String[] args) {

		int[][] arranjo = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		for (int i = 0; i < arranjo.length; i++) {

			for (int j = 0; j < arranjo[i].length; j++) {

				 
				System.out.print("[" + arranjo[i][j] + "]");

			}

			System.out.println(" ");
		}

	}

}
