package EstruturasDeRepeticaoeArrays;

import java.util.Scanner;

public class Ex_Nota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = scan.nextInt();

		while(nota < 0 || nota > 10) {
			System.out.println("Nota Inválida, digite novamente");
			nota = scan.nextInt();
		}
		
	}

}
