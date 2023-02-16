package Aula22;

public class ArranjoDeObjetos {

	public static void main(String[] args) {

		ArranjoT[] arranjo01 = new ArranjoT[3]; // cria arranjo c/ 3 posições

		ArranjoT objeto01 = new ArranjoT(); // instancia um obj
		ArranjoT objeto02 = new ArranjoT(); // instancia um obj
		ArranjoT objeto03 = new ArranjoT(); // instancia um obj

		arranjo01[0] = objeto01; // insere o obj na posicao 0 do arranjo
		arranjo01[1] = objeto02; // insere o obj na posicao 0 do arranjo
		arranjo01[2] = objeto03; // insere o obj na posicao 0 do arranjo

		

		System.out.println(objeto01.numero);
		System.out.println();

		for (int i = 0; i < arranjo01.length; i++) {

			System.out.println("Imprime o for : " + arranjo01[i]);

		}
		
		System.out.println();
		System.out.println(arranjo01[0]);
	}

}
