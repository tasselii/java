package aula_04_LacosComLoop;

import java.util.Scanner;

public class Exe_02 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int contador, totalImpares = 0, totalPar = 0;
		
		System.out.println("╔═════════════════════════════════════════════╗");
		System.out.println("║     CONTADOR DE NÚMEROS PARES E ÍMPARES     ║");
		System.out.println("╠═════════════════════════════════════════════╣");
		System.out.println("║  Objetivo:                                  ║");
		System.out.println("║                                             ║");
		System.out.println("║  - Digite uma sequência de números inteiros ║");
		System.out.println("║    para descobrir quantos são pares e       ║");
		System.out.println("║    quantos são ímpares.                     ║");
		System.out.println("║                                             ║");
		System.out.println("║  - O programa exibirá os totais ao final.   ║");
		System.out.println("║                                             ║");
		System.out.println("╚═════════════════════════════════════════════╝\n");


		for (contador = 1; contador <= 10; contador++) {
			System.out.printf("Digite o %d° número: ", contador);
			int num = read.nextInt();

			if (num % 2 == 0) {
				totalPar++;
			} else {
				totalImpares++;
			}
		}
		
		System.out.printf("\nTotal de números pares: %d\n", totalPar);
		System.out.printf("\nTotal de números ímpares: %d\n", totalImpares);

		read.close();
	}
}
