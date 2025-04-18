package aula_02_SomaVariaveis;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Definição das variaveis
		
		System.out.println("Digite o primeiro número inteiro: ");
		int numero_01 = leia.nextInt();
		
		System.out.println("Digite o Segundo número inteiro: ");
		int numero_02 = leia.nextInt();
		
		char opcao = 'v';
		boolean menorIdade = false;
		
		System.out.println("Escreva seu nome: ");
		String nome = leia.next();
		
		
		// Definição da constante PI
		final double PI = 3.1415; 	

		// Atribuição de valor
		numero_02 = 75;
		
		System.out.printf("Variavel numero 1: %d ,numero 2: %d \n", numero_01,numero_02);
		System.out.println("Variável nome em letras maiúsculas: \n" + nome.toUpperCase());
		
		// Impressão formatada
		System.out.printf("Variavel numero 1 é igual a: %d\n", numero_01);
		System.out.printf("Constante PI é igual a: %.2f", PI);
	
	}

}
