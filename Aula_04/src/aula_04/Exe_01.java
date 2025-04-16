package aula_04;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		
		int firstNum, lastNum = 1, contador;
		
		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║     MÚLTIPLOS DE 3 E 5 NO INTERVALO       ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║  Objetivo:                                ║");
		System.out.println("║                                           ║");
		System.out.println("║  - Informe dois números inteiros.         ║");
		System.out.println("║                                           ║");
		System.out.println("║  - O primeiro número deve ser menor       ║");
		System.out.println("║    que o segundo.                         ║");
		System.out.println("║                                           ║");
		System.out.println("║  - O programa mostrará os números do      ║");
		System.out.println("║    intervalo que são múltiplos de 3 e 5.  ║");
		System.out.println("╚═══════════════════════════════════════════╝\n");
				
		
		System.out.println("Digite o primeiro número do intervalo: ");
		firstNum = read.nextInt();
		
	
		System.out.println("Digite o último número do intervalo: ");
		lastNum = read.nextInt();
		
		if(firstNum >= lastNum) {			
			System.out.println("Intervalo inválido!\n");	
		}
				
		System.out.println("\nNo Intervalo entre 10 e 100: \n");
			
		for (contador = firstNum; contador <= lastNum; contador++) {
		    if (contador % 3 == 0 && contador % 5 == 0 && contador != 0) {
		        System.out.printf("%d é múltiplo de 3 e 5\n", contador);
		    }
		}

		read.close();
	}
}
