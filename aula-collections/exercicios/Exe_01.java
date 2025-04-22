package Exercicios;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		ArrayList<String> colors = new ArrayList<String>();
		
		for(int index = 0; index < 5; index++) {
			System.out.println("Digite uma cor: ");
			String color = scan.next();
			colors.add(color);
		}
		
		System.out.println("\nListar todas as cores: \n");
		colors.forEach(System.out::println);
		
		colors.sort(null);
		
		
		System.out.println("\nOrdenar as cores: \n");
		colors.forEach(System.out::println);
	}
}
