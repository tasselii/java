package aula_03_SE;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		int valorA = leia.nextInt();
		
		System.out.print("Digite o número B: ");
		int valorB = leia.nextInt();
		
		System.out.print("Digite o número C: ");
		int valorC = leia.nextInt();
		
		if ((valorA + valorB) > valorC) {
			System.out.println("A soma de A + B é Maior do que C");
		} else if ((valorA + valorB) < valorC) {
			System.out.println("A soma de A + B é Menor do que C");
		} else if((valorA + valorB) == valorC){
			System.out.println("A soma de A + B é igual a C");
		}
	}
}
