package lambdas;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static int calcular(OperacaoMatematica om, int num1, int num2) {
		return om.executar(num1, num2);
	}
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		int n1, n2 = 0, opcao = 0;
		
		mostraMenuInicial();
		n1 = scan.nextInt();
		
		mostrarMenuOpcoes();	
		opcao = scan.nextInt();
		
		System.out.print("\nDigite o segundo numero: ");
		n2 = scan.nextInt();
		
		switch (opcao) {
		case 1-> System.out.println("\nSoma: " + calcular((a, b) -> a + b, n1, n2));
		case 2-> System.out.println("\nSubtração: "+ calcular((a, b) -> a - b, n1, n2));
		case 3-> System.out.println("\nMultiplicação: "+ calcular((a, b) -> a * b, n1, n2));
		case 4-> {
				try {
					System.out.println("\nDivisão: "+ calcular((a, b) -> a / b, n1, n2));
				} catch (ArithmeticException e) {
					System.out.println("\nErro: divisão por zero!");
				}
			}
		default -> System.out.println("\nOpção Inválida!");
		}
		scan.close();
	}
	
	public static void mostrarMenuOpcoes() {
	    System.out.println("\nDigite o número da operação que deseja: ");
	    System.out.println("1 - Soma ");
	    System.out.println("2 - Subtração ");
	    System.out.println("3 - Multiplicação ");
	    System.out.println("4 - Divisão ");
	}
		public static void mostraMenuInicial() {
		System.out.println("****************************************************");
		System.out.println("              Calculadora com Lambda                ");
		System.out.println("****************************************************");
		System.out.print("\nDigite o primeiro numero: ");
	}
	
}

