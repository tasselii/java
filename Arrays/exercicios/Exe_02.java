package exercicios;

import java.util.Scanner;

public class Exe_02 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = new int[10], indice;
		int soma = 0,numPar = 0, numImpar = 0;
		double media;
		
		for(indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println("\nDigite um número inteiro: ");
			vetorInteiros[indice] = leia.nextInt();		
			soma += vetorInteiros[indice];
		}
		
	        
	        System.out.println("\n\nElementos nos índices ímpares:");
	        for (indice = 0; indice < vetorInteiros.length; indice++) {
	            if (indice % 2 != 0) {
	                System.out.print(vetorInteiros[indice] + " ");
	            }
	        }
		
	        System.out.print("\n\nElementos pares:\n");
	        for (indice = 0; indice < vetorInteiros.length; indice++) {
	        	if (vetorInteiros[indice] % 2 == 0) {
	        		System.out.print(vetorInteiros[indice] + " ");
	        	}
	        }
	
	        media = (double) soma/vetorInteiros.length;
		
		
		System.out.print("\n\nSoma: " + soma);
		System.out.printf("\n\nMédia: %.2f", media);
		
		
		leia.close();
	}
}
