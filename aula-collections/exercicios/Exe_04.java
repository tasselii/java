package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Exe_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		String choice = null;
		
		Set<Integer> numbers = new HashSet<Integer>();
		
		Collections.addAll(numbers,2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		
		do {
			
			System.out.println("\nDigite o número que você deseja encontrar: ");
			int num = scan.nextInt();
			
			ArrayList<Integer> numbers1 = new ArrayList<>();
			
			numbers1.addAll(numbers);
			
			int position = numbers1.indexOf(num);
			
			if (numbers.contains(num)) {
				System.out.printf("\nO número %d está localizado na %d° posição\n", num, numbers1.indexOf(num));
				System.out.println("---------------------------------------------");
			} else {
				System.out.printf("\nO número %d não foi encontrado!\n", num);
				System.out.println("---------------------------------------------");
			}
			
			System.out.println("\nDeseja saber outro numero S/N: ");
			choice = scan.next().toUpperCase();
		
		} while (choice.equals("S"));
		
		System.out.println("\n--- Programa encerrado ---");
	}
}
