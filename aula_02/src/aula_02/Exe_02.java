package aula_02;

import java.util.Scanner;

public class Exe_02 {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Digite seu nome: ");
			String nome = leia.nextLine();
	
    		System.out.print("Digite a nota 1: ");
    		float nota_01 = leia.nextFloat();
    		
    		System.out.print("Digite a nota 2: ");
    		float nota_02 = leia.nextFloat();
    		
    		System.out.print("Digite a nota 3: ");
    		float nota_03 = leia.nextFloat();
    	
    		System.out.print("Digite a nota 4: ");
    		float nota_04 = leia.nextFloat();


    		float media = (nota_01 + nota_02 + nota_03 + nota_04) / 4;
		
			if (media >= 6) {
				System.out.printf("\nAprovado com média: %.0f\n", media);

			} else if (media < 5)
				System.out.printf("\nReprovado com média: %.0f\n", media);
			else {
				System.out.printf("\nRecuperação com média: %.0f\n - Verificar com a professora\n", media);
			}
    		
					System.out.println("\nAluno: " + nome);
					System.out.printf("\nMédia final: %.1f", media);
					
	}
}
