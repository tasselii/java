package aula_02_SomaVariaveis;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Digite o seu Salário: ");
			double salario = leia.nextDouble();
		
			System.out.print("Digite o seu abono: ");
			double abono = leia.nextDouble();
		
			double novoSalario = salario + abono;
			
		System.out.printf("Novo Salário: %.2f", novoSalario);

	}

}
