package dio.exercicios.loops;
import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Tabuada");
		System.out.println("Digite um número:");
		numero = scan.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.println(numero + " x " + (i+1) + " = " + (numero * (i+1)));
		}

	}

}
