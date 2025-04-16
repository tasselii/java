package aula_04_LacosComLoop;

import java.util.Scanner;

public class Exe_06 {
	
    public static void main(String[] args) {
		
        Scanner read = new Scanner(System.in);
		
        int num, soma = 0, contador = 0;
        double media = 0;
        
        System.out.println("╔═══════════════════════════════════════════╗");
        System.out.println("║ CALCULE A MÉDIA DE NÚMEROS MÚLTIPLOS DE 3 ║");
        System.out.println("╠═══════════════════════════════════════════╣");
        System.out.println("║  Objetivo:                                ║");
        System.out.println("║                                           ║");
        System.out.println("║  - Digite números inteiros para calcular  ║");
        System.out.println("║    a média dos múltiplos de 3.            ║");
        System.out.println("║                                           ║");
        System.out.println("║  - Digite 0 para mostrar o resultado.     ║");
        System.out.println("║                                           ║");
		System.out.println("╚═══════════════════════════════════════════╝\n");
		
        do {
            System.out.print("Digite um número: ");
            num = read.nextInt();
			
            if (num != 0 && num % 3 == 0) {
                soma += num;
                contador++;
            }
			
        } while (num != 0); 
		
        	if (contador > 0) {
            	media = (double) soma / contador;
            	System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f", media);
        	} else {
            	System.out.println("\nNenhum número múltiplo de 3 foi digitado.");
        	}

        read.close(); 
    }
}
