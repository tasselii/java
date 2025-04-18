package aula_02_SomaVariaveis;

import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
			System.out.print("Digite o numero 1: ");
			float numero_01 = leia.nextFloat();
			
			System.out.print("Digite o numero 2: ");
			float numero_02 = leia.nextFloat();
			
			System.out.print("Digite o numero 3: ");
			float numero_03 = leia.nextFloat();
			
			System.out.print("Digite o numero 4: ");
			float numero_04 = leia.nextFloat();
			
			float calculo = (numero_01 * numero_02) - (numero_03 * numero_04);
			
			System.out.printf("Diferença: %.1f", calculo);
			
	}
}
