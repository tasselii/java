package aula_04_LacosComLoop;

import java.util.Scanner;

public class Exe_05 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num, soma = 0;
		
		System.out.println("╔═════════════════════════════════════════════╗");
		System.out.println("║ CALCULE A MÉDIA DE NÚMEROS MÚLTIPLOS DE 3   ║");
		System.out.println("╠═════════════════════════════════════════════╣");
		System.out.println("║  Objetivo:                                  ║");
		System.out.println("║                                             ║");
		System.out.println("║  - Digite números inteiros positivos ou     ║");
		System.out.println("║    negativos. O programa calculará a        ║");
		System.out.println("║    média apenas dos múltiplos de 3.         ║");
		System.out.println("║                                             ║");
		System.out.println("║  - Digite 0 para encerrar e ver o resultado.║");
		System.out.println("║                                             ║");
		System.out.println("╚═════════════════════════════════════════════╝\n");
		
		do {
			System.out.print("Digite um número: ");
			num = read.nextInt();
			
			if (num > 0) {
				soma += num;
			}
			
		} while (num != 0); 
		
		System.out.printf("\nA soma dos números positivos é: %d", soma);
		read.close(); 
	}
}
