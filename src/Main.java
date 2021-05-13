
public class Main {

	public static void main(String[] args) {
		MergeSort op = new MergeSort();
		
		int [] lista = {11, 15, 32, 43, 28, 17, 79, 18, 
				33, 99, 88, 75, 45, 82};
		
		op.mergesort(lista, 0, (lista.length-1));
		
		for(int i = 0; i< lista.length; i++) {
			System.out.println(lista[i]);
		}

	}

}
