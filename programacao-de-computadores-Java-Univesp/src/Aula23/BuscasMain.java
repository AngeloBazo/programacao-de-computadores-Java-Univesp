package Aula23;

import java.util.Arrays;
import java.util.Scanner;

public class BuscasMain {

	public static void main(String[] args) {

		int[] vetor = { 1, 5, 23, 55, 99 };

		for (int count = 0; count < vetor.length; count++) {

			System.out.println("Posição " + count + " tem o nº int : " + vetor[count]);

		}
		System.out.println("");
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um nº desses para saber sua posição no vetor: 1, 5, 23, 55, 99 ");

		int nDigitado = teclado.nextInt();

		int posicaoNumero;

		for (int count = 0; count < vetor.length; count++) {

			if (nDigitado == vetor[count]) {

				System.out.println("O nº digitado está na posição " + count + " do vetor");

			} else {
				System.out.println("O nº digitado não consta do vetor"); break;
			}

		}

		System.out.println("");
		System.out.println("Ordenando o vetor em ordem crescente:");
		Arrays.sort(vetor);
		for (int valor : vetor) {
			System.out.print(valor + ", ");
		}

	}

}
