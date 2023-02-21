package dio.exercicios.loops;
import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, nPares = 0, nImpares = 0, n = 0, count = 0;
		
		
		System.out.println("Digite a quantidade de números deseja inserir:");
		n = scan.nextInt();
		do {
			System.out.println("Número:");
			num = scan.nextInt();
			if(num % 2 == 0) nPares++;
			else nImpares++;
			count++;
		} while (count < n);
		
		System.out.println("Pares: " + nPares);
		System.out.println("Ípares: " + nImpares);

	}

}
