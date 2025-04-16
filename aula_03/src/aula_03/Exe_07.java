package aula_03;

import java.util.Scanner;

public class Exe_07 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double resultado;
        int opcao;
        
        
        while (true) {
        	
        	 System.out.println("Digite o 1º número: ");
             double num1 = leia.nextInt();
             
             System.out.println("Digite o 2º número: ");
             double num2 = leia.nextInt();
            
        	System.out.println("\n");
            System.out.println("╔═══════════════════════════════╗");
            System.out.println("║CALCULADORA - OPERAÇÕES BÁSICAS║");
            System.out.println("╠═══════════════════════════════╣");
            System.out.println("║ Código │ Operação             ║");
            System.out.println("╟────────┼──────────────────────╢");
            System.out.println("║   1    │ Soma                 ║");
            System.out.println("║   2    │ Subtração            ║");
            System.out.println("║   3    │ Multiplicação        ║");
            System.out.println("║   4    │ Divisão              ║");
            System.out.println("║   5    │ Sair                 ║");
            System.out.println("╚═══════════════════════════════╝");

            opcao = leia.nextInt();
            
            if (opcao == 5) {
                System.out.println("\nSaindo... Até mais!");
                leia.close();
                break;
            }
            
            System.out.println("");
            
            if (opcao < 1 || opcao > 4) {
                System.out.println();
                System.out.println("##################################");
                System.out.println("#         OPÇÃO INVÁLIDA!        #");
                System.out.println("#   Por favor, tente novamente   #");
                System.out.println("##################################\n");
                continue;
            }
           
            
            switch(opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.printf("\n%.1f + %.1f = %.1f \n", num1, num2, resultado);
                    System.out.println();
                    break;
                case 2:
                	resultado = num1 - num2;
                    System.out.printf("\n%.1f - %.1f = %.1f \n", num1, num2, resultado);
                    System.out.println();
                    break;
                case 3:
                	resultado = num1 * num2;
                    System.out.printf("\n%.1f * %.1f = %.1f \n", num1, num2, resultado);
                    System.out.println();
                    break;
                case 4:
                	if (num2 == 0) {
                        System.out.println("\nErro: divisão por zero não é permitida!\n");
                        System.out.println();
                    } else {
                	resultado = num1 / num2;
                    System.out.printf("\n%.1f / %.1f = %.1f \n", num1, num2, resultado);
                    System.out.println();
                    break;
                    }
            	} 	
          }
    }
}
