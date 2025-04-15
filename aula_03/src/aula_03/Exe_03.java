package aula_03;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Nome do doador: ");
		String nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		int idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? (true/false): ");
		boolean primeiraDoacao = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 59) {
		    System.out.printf("%s está apto para doar sangue.", nome);
		} else if (idade >= 60 && idade <= 69 && !primeiraDoacao) {
		    System.out.printf("%s está apto para doar sangue.", nome);
		} else {
		    System.out.printf("%s não está apto para doar sangue.", nome);
		}
	}
}
