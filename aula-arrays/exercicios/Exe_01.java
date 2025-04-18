package exercicios;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiro[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, indice, num;
		boolean encontrado;
		
				
		do {
			System.out.println("\nDigite o número que você deseja encontrar: ");
			num = leia.nextInt();
			
			encontrado = false;
			
			
			for (indice = 0; indice < vetorInteiro.length; indice++) {
                if (vetorInteiro[indice] == num) {
                    encontrado = true;
                    break; 
                }
            }
			
			if (!encontrado) {
				System.out.printf("\nO número %d não foi encontrado!\n", num);
			}
			
		} while(!encontrado);
		
		for (indice = 0; indice < vetorInteiro.length; indice++) {
		    if (vetorInteiro[indice] == num) {
		        System.out.printf("\nO número %d está localizado na posição: %d\n", num, indice);
		        break;
		    }
		}		
		
		
		leia.close();
	}
}
