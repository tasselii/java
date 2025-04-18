package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe_04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in).useLocale(Locale.US);
/*
        double[][] matrizReal = {
            {4.0, 5.0, 7.0, 3.0},
            {2.5, 6.5, 4.7, 8.0},
            {10.0, 8.5, 9.5, 8.0},
            {9.0, 6.5, 7.6, 8.2},
            {5.0, 5.0, 5.0, 6.3},
            {7.0, 8.0, 9.0, 8.5},
            {5.5, 3.5, 2.5, 1.0},
            {8.0, 9.0, 10.0, 9.5},
            {5.6, 5.8, 6.5, 7.0},
            {7.5, 8.5, 9.5, 10.0}
        };
*/
        double[] media = new double[10];
        double matrizReal[][] = new double[10][4];
        
        for(int linha = 0; linha < matrizReal.length; linha++) {
			for(int coluna = 0; coluna < matrizReal[0].length; coluna++) {
				System.out.println("\nDigite uma nota: ");
				matrizReal[linha][coluna] = leia.nextDouble();
			}
		}

        for (int linha = 0; linha < matrizReal.length; linha++) {
            double soma = 0;
            for (int coluna = 0; coluna < matrizReal[linha].length; coluna++) {
                soma += matrizReal[linha][coluna];
            }
            media[linha] = soma / 4;
        }

        System.out.print("Médias: ");
        for (int linha = 0; linha < media.length; linha++) {
            System.out.printf("| %.1f ", media[linha]);
        }
        System.out.println("|");

        leia.close();
    }
}
