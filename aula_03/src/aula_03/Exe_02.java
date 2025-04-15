package aula_03;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = leia.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O Número %d é par e positivo!", num);
		} else if (num < 0) {
			System.out.printf("O Número %d é ímpar e negativo!", num);
		} else if(num % 2 == 0 && num < 0) {
			System.out.printf("O Número %d é par e negativo!", num);
		} else if (num % 2 != 0 && num > 0) {
			System.out.printf("O Número %d é ímpar e positivo!", num);
		}
	}
}
