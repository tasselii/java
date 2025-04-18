package aula_03_SE;

import java.util.Scanner;

public class Exe_08 {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double saldo = 1000, saque, deposito;
        int opcao;

        while (true) {
        	System.out.println();
        	System.out.println("╔═══════════════════════════════════════════╗");
        	System.out.println("║         MENU DE OPERAÇÕES BANCÁRIAS       ║");
        	System.out.println("╠═══════════════════════════════════════════╣");
        	System.out.println("║ Código │ Operação                         ║");
        	System.out.println("╟────────┼──────────────────────────────────╢");
        	System.out.println("║   1    │ Saldo                            ║");
        	System.out.println("║   2    │ Saque                            ║");
        	System.out.println("║   3    │ Depósito                         ║");
        	System.out.println("║   0    │ Sair                             ║");
        	System.out.println("╚═══════════════════════════════════════════╝");

            System.out.print("Operação: ");
            opcao = leia.nextInt();

            if (opcao == 0) {
                System.out.println("\nSaindo... Até mais!");
                leia.close();
                break;
            }

            if (opcao < 1 || opcao > 3) {
                System.out.println();
                System.out.println("##################################");
                System.out.println("#         OPÇÃO INVÁLIDA!        #");
                System.out.println("#   Por favor, tente novamente   #");
                System.out.println("##################################");
                continue;
            }

            switch (opcao) {
                case 1:                	
                	System.out.printf("\nOperação - Saldo\n");
                    System.out.printf("\nSaldo: %.2f\n", saldo);
                	break;
                case 2:     	
                	System.out.println("\nOperação - Saque");
                    System.out.print("\nValor: ");
                    saque = leia.nextDouble();
                    
                    if (saque < saldo ) {
                    saldo -= saque;
                    System.out.printf("\nNovo saldo: %.2f\n", saldo);
                    } else if (saque > saldo) {
                    	System.out.println("\nSaldo Insuficiente\n");
                    }
                    break;
                case 3:
                	System.out.println("\nOperação - Depósito\n");
                	System.out.print("Valor: ");
                    deposito = leia.nextDouble();
                    saldo += deposito;
                    System.out.printf("\nNovo saldo: %.2f\n", saldo);
                    break;
                default:
                    break;
            }
        }
    }
}


