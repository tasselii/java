package aula_05;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		
		int matrizIrregular[][] = {{10, 15}, {70, 120}, {50, 100}};
		
		Float matrizReal[][] = new Float[3][3];
		
		// imprimindo o valor de as linhas e colunas de uma matriz declarada
		/*for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiros.length; coluna++) {
				System.out.printf("\nmatrizInteiros[%d][%d] = %d", linha, coluna, matrizInteiros[linha][coluna]);
			}
		}
		
		// entrada de dados para uma matriz
		for(int linha = 0; linha < matrizReal.length; linha++) {
			for(int coluna = 0; coluna < matrizReal.length; coluna++) {
				System.out.println("\nDigite um número real: ");
				matrizReal[linha][coluna] = leia.nextFloat();
			}
		}
		
		// imprimindo o valor de uma matriz
		for(Float[] vetor : matrizReal) {
			for(var valor : vetor) {
				System.out.println("Exibir a posição atual: " + valor);
			}
		}*/
		
		// imprimindo o valor de uma matriz irregular
		for(int linha = 0; linha < matrizIrregular.length; linha++) {
			for(int coluna = 0; coluna < matrizIrregular[0].length; coluna++) {
				System.out.printf("\nmatrizIrregular[%d][%d] = %d", linha, coluna, matrizIrregular[linha][coluna]);
			}
		}

	}
}
