package aula_04;

import java.util.Scanner;

public class Exe_03 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade;
		int menor21 = 0, maior50 = 0;
		
		System.out.println("╔═════════════════════════════════════════════╗");
		System.out.println("║         RESULTADOS DE IDADES                ║");
		System.out.println("╠═════════════════════════════════════════════╣");
		System.out.println("║  Objetivo:                                  ║");
		System.out.println("║                                             ║");
		System.out.println("║  - Digite as idades de várias pessoas.      ║");
		System.out.println("║  - O programa mostrará quantas pessoas      ║");
		System.out.println("║    são menores de 21 anos e quantas são     ║");
		System.out.println("║    maiores de 50 anos.                      ║");
		System.out.println("║                                             ║");
		System.out.println("╚═════════════════════════════════════════════╝\n");
		
		while (true) {
			System.out.print("Digite uma idade: ");
			idade = read.nextInt();
			
			if (idade < 0) {
				break; 
			}
			
			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}
		}
		
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d\n", menor21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d\n", maior50);
		
		read.close();
	}
}
