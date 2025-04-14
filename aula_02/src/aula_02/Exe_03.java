package aula_02;

import java.util.Scanner;

public class Exe_03 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Digite o salário bruto: ");
			double salario = leia.nextDouble();
		
			System.out.print("Digite o adicional noturno: ");
			double adicionalNoturno = leia.nextDouble();
		
			System.out.print("Digite as horas extras: ");
			double horasExtras = leia.nextDouble();
		
			System.out.print("Digite os Descontos: ");
			double descontos = leia.nextDouble();
		
			double salarioLiquido = salario + adicionalNoturno +  (horasExtras * 5) - descontos;
		
		System.out.printf("\nSalário Líquido: %.2f", salarioLiquido);
				
	}
}
