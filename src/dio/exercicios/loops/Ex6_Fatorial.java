package dio.exercicios.loops;
import java.util.Scanner;

public class Ex6_Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int fatorial;
		
		System.out.print("Digite um número para saber o seu fatorial:");
		num = scan.nextInt();
		fatorial = num;
		if(num == 0 || num == 1) {
			fatorial = 1;
			System.out.println(num + "! = " + fatorial);
		} else if (num < 0) {
			System.out.println("Não existe!");
			return;
		} else {
			System.out.print(num + "! = " + num);
			for(int i = (num - 1); i > 0; i--) {
				fatorial *= i;
				System.out.print(" x " + i);
			}
			System.out.println(" = " + fatorial);
		}
	}

}
