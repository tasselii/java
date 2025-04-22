package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		String choice = null;
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		Collections.addAll(numbers,2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		
		do {
			System.out.println("\nDigite o número que você deseja encontrar: ");
			Integer num = scan.nextInt();
		
			if (numbers.contains(num)) {
				System.out.printf("\nO número %d está localizado na %d° posição\n", num, numbers.indexOf(num));
			} else { 
				System.out.printf("\nO número %d não foi encontrado!\n", num);
				System.out.println("---------------------------------------------");
			}
			
			System.out.println("\nDeseja saber outro numero S/N: ");
			choice = scan.next().toUpperCase();
		
		} while(choice.equals("S"));
		
		System.out.println("\n--- Programa encerrado ---");
	}
}
