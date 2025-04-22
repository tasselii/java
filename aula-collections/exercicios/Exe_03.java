package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Exe_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		Set<Integer> numbers = new HashSet<Integer>();
		
		for(int index = 0; index < 10; index++) {
			System.out.println("Digite um número: ");
			Integer num = scan.nextInt();
			numbers.add(num);
		}
		
		System.out.println("\nListar dados do Set: \n");
		
		Iterator<Integer> inum = numbers.iterator();
		
		while(inum.hasNext()) {
			System.out.println(inum.next());
		}
	}
}
