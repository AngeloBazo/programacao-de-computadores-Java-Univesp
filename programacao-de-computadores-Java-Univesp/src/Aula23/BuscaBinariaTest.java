package Aula23;

public class BuscaBinariaTest {

	public static void main(String[] args) {

		int[] vetor = { 01, 02, 50, 99, 105, 900 };

		for (int i = 0; i < vetor.length; i++) {

			System.out.print(vetor[i] + " - ");
		}

		System.out.println("");
		System.out.println("Tamanho do vetor : " + vetor.length);
		System.out.println("");
		System.out.println("Numero a ser buscado : 50");

		int nBuscado = 50;

		do {

			if (nBuscado > vetor[vetor.length / 2]) {

				System.out.println("N buscado é maior que o nº da metade do vetor");
			} else
				System.out.println("N buscado é menor que o nº da metade do vetor");

		} 	while (nBuscado == vetor[4]);
	
	}

}
