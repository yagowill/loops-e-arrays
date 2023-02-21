package dio.exercicios.loops;
import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer max = null;
		int num, soma = 0, media, count = 0;
		
		System.out.println("Digite 5 números");
		
		
		do {
			System.out.println("Número " + (count + 1));
			num = scan.nextInt();
			if ( max == null || num > max ) max = num;
			soma += num;
			
			count++;
		} while(count < 5);
		
		media = soma / 5; 
		
		System.out.println("O maior número é " + max + " e a média é " + media);
	}

}
