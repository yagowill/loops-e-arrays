package dio.exercicios.arrays;

public class Ex1_OrdemIversa {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		
		System.out.print("Vetor:");
		for (int i = 0; i <= (array.length - 1); i++) {
			System.out.print(" " + array[i]);
		}
		
		System.out.print("\nVetor invertido:");
		for (int i = (array.length - 1); i >= 0 ; i--) {
			System.out.print(" " + array[i]);
		}

	}

}
