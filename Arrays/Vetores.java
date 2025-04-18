package aula_05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Vetor de números inteiros inicializado com valores
		int vetorInteiros[] = {10, 15, 35, 70, 140, 280, 320, 480};
		
		// Vetor de Objetos Float, com tamanho 5
		Float vetorReal[] = new Float[5];   // Float com F maiusculo, para trabalhar float como objeto
		
		// Vetor de Objetos String
		String vetorStrings[] = {"Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi"};
		
		// Variável float para armazenar a soma dos elementos vetorReal
		float soma = 0;
		
		// Laço for tradicional para exibir os dados do vetorInteiros
		for(int indice = 0; indice < vetorInteiros.length; indice++) 
		{
		System.out.printf("vetorInteiros[%d]: %d\n", indice, vetorInteiros[indice]);
		}
		
		// Laço for tradicional para inserir dados no vetorReal
		for(int indice = 0; indice < vetorReal.length; indice++) 
		{
			System.out.println("\nDigite um número Real: ");
			vetorReal[indice] = leia.nextFloat();
		}
		
		// for each para somar os dados do vetorReal
		for(var valor : vetorReal) {  	// var coloca a variavel conforme o vetor
			//System.out.println("Elemento atual: " + valor);
			soma += valor;
		}
		
		// Exibindo o resultado da soma
		System.out.println("\nResultado da soma\n" + soma);
		
		// Ordenando o vetorReal em ordem crescente
		Arrays.sort(vetorReal);
		
		// Exibindo o vetorReal com os dados em ordem crescente
		for(var valor : vetorReal) {  	//var coloca a variavel conforme o vetor
			System.out.println("Elemento atual: " + valor);
		}
		
		// Ordenando o vetorReal em ordem decrescente
		// Previamente ele deve estar ordenado em ordem crescente
		Arrays.sort(vetorReal, Collections.reverseOrder());
		
		// Exibindo o vetorReal com os dados em ordem decrescente
		for(var valor : vetorReal) {
			System.out.println("Elemento atual: "+ valor);
		}
		
		// Ordenando o vetorReal em ordem crescente
		Arrays.sort(vetorStrings);
				
		// Exibindo o vetorReal com os dados em ordem crescente
		for(var valor : vetorStrings) {  	//var coloca a variavel conforme o vetor
			System.out.println("Elemento atual: " + valor);
		}
		
		leia.close();
	}
}
