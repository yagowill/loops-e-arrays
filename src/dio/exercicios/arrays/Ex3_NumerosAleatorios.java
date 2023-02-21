package dio.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = random.nextInt(100);
		}
		
		System.out.print("Números Aleatórios:");
		for(int numero : numerosAleatorios) {
			System.out.print(" " + numero);
		}

	}

}
