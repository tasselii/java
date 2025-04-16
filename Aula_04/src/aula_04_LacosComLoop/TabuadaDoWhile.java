package aula_04_LacosComLoop;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int contador = 11;
		
		System.out.println("Digite um numero inteiro:");
		int numero = leia.nextInt();
		
		do {
			System.out.printf("\n %d x %d = %d", numero, contador,(numero * contador));
			contador++;
		}  while(contador <= 10);
		
		leia.close();
	}
}
