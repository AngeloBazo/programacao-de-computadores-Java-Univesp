package Aula23;

public class BuscaSeq {

	static int buscaSeq(int[] arr, int el) {

		for (int i = 0; i < arr.length; i++) 

			if (arr[i] == el) 
				return (i);
			
				return (-1);

		}

	}

