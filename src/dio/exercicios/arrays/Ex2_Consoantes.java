package dio.exercicios.arrays;
import java.util.Scanner;

public class Ex2_Consoantes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] consoantes = new String[6];
		int nConsoantes = 0;
		
		System.out.println("Digite 6 letras:");
		for(int i = 0; i < 6; i++) {
			String letra = scan.next();
			if(!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u"))) {
				consoantes[i] = letra;
				nConsoantes++;
			}
		}
		
		System.out.print("Consoantes:");
		for(String consoante : consoantes) {
			if(consoante != null) {
				System.out.print(" " + consoante);
			}
		}
		System.out.println("\nQuantidade: " + nConsoantes);

	}

}
