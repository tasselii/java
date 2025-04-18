package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		
	    Scanner leia = new Scanner(System.in).useLocale(Locale.US);
	    
	    float matrizReal[][] = new float[3][3];
	    boolean validacao;
	       
	    for(int linha = 0; linha < matrizReal.length; linha++) {
			for(int coluna = 0; coluna < matrizReal.length; coluna++) {            	
		
				do {		
		    	  System.out.println("\nDigite um número: ");
		    	 	
		          if (leia.hasNextFloat()) {		// .hasNextFloat() for true, ele lê como nextFloat, e sai do loop.  
		        		matrizReal[linha][coluna] = leia.nextFloat();
		        		validacao = true;
		            
		          } else {
		            	System.out.println("Entrada inválida! Digite um número.\n");
		            	leia.next();
		            	validacao = false;
		          	}
	        
		 		}while (!validacao);
			}
	    }
	    
		float somaPrincipal   = matrizReal[0][0] + matrizReal[1][1] + matrizReal[2][2];
		float somaSecundaria  = matrizReal[0][2] + matrizReal[1][1] + matrizReal[2][0];

	
		System.out.printf("\nElementos da Diagonal Secundária:\n%.0f %.0f %.0f \n", matrizReal[0][0], matrizReal[1][1], matrizReal[2][2]);
		
		System.out.printf("\nElementos da Diagonal Principal:\n%.0f %.0f %.0f \n", matrizReal[0][2], matrizReal[1][1], matrizReal[2][0]);
		
		System.out.printf("\nSoma dos Elementos da Diagonal Principal:\n%.0f \n", somaPrincipal);
		
		System.out.printf("\nSoma dos Elementos da Diagonal Secundária:\n%.0f", somaSecundaria);
				
		leia.close();
	}
}
