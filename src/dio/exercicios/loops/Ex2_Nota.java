package dio.exercicios.loops;
import java.util.Scanner;

public class Ex2_Nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nota;
		
		while(true) {
			System.out.println("Digite uma nota entre 0 a 10");
			nota = scan.nextInt();
			if(nota > 10 || nota < 0) {
				System.out.println("Valor inválido!");
				continue;
			}
			break;
		}
		
		System.out.println("Sua nota foi " + nota);

	}

}
