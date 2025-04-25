package aula8;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String opcao;

	while (true) {

		System.out.println("\n************************************************");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("0 - Sair");
		System.out.println("Qual operação matemática você deseja executar?");
		System.out.println("************************************************");

		opcao = scan.nextLine();

		if (!opcao.matches("[0-4]")) {
			System.out.println("\n⚠️ Opção inválida.");
			continue;
		}

		int escolha = Integer.parseInt(opcao);

		if (escolha == 0) {
			sobre();
			System.exit(0);
		}

		System.out.print("\nDigite o primeiro número: ");
		double num1 = scan.nextDouble();

		System.out.print("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		scan.nextLine(); // limpar o buffer

		switch (escolha) {
		case 1 -> System.out.printf("\n%.2f + %.2f = %.2f\n", num1, num2, somar(num1, num2));
		case 2 -> System.out.printf("\n%.2f - %.2f = %.2f\n", num1, num2, subtrair(num1, num2));
		case 3 -> System.out.printf("\n%.2f * %.2f = %.2f\n", num1, num2, multiplicar(num1, num2));
		case 4 -> {
			var divisao = dividir(num1, num2);
			if (divisao <= 0)	System.out.println("\nNão existe divisão por zero!");
			else System.out.printf("\n%.2f /%.2f =%.2f", num1, num2, divisao);
		}
		
		case 0 -> System.exit(0);
		default -> System.out.println("⚠️ Opção Inválida");
		}
	}
}
	
	 static double somar(double num1 ,double num2) {
		return num1 + num2; 
	}
	 
	 static double subtrair(double num1 ,double num2) {
		 return num1 - num2; 
	 }
	 
	 static double multiplicar(double num1 ,double num2) {
		 return num1 * num2; 
	 }
	 
	 static double dividir(double num1 ,double num2) {
		 if (num2 == 0);
		 return -1; 
	 }
	 
	 static void sobre() {
		 System.out.println("\nCalculadora com Métodos");
		 System.out.println("Feito por: Thiago Tasseli");
	 }
}
