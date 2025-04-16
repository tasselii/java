package aula_03_SE;

import java.util.Scanner;

public class Exe_06 {
	
public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double valorTotal;
        int opcao;
        double salario, novoSalario;
        
        System.out.print("Nome do colaborador: ");
    	String nomeTemp = leia.nextLine();
        
        while (true) {
        
        	System.out.println();
            System.out.println("║-----------------------------------------║");
            System.out.println("║ Códigos de Cargos:                      ║");
            System.out.println("║   1 - Gerente                           ║");
            System.out.println("║   2 - Vendedor                          ║");
            System.out.println("║   3 - Supervisor                        ║");
            System.out.println("║   4 - Motorista                         ║");
            System.out.println("║   5 - Estoquista                        ║");
            System.out.println("║   6 - Técnico de TI                     ║");
            System.out.println("║-----------------------------------------║");

        	System.out.print("\nCargo: ");
            opcao = leia.nextInt();
          
            
            if (opcao < 1 || opcao > 6) {
                System.out.println();
                System.out.println("##################################");
                System.out.println("#         OPÇÃO INVÁLIDA!        #");
                System.out.println("#   Por favor, tente novamente   #");
                System.out.println("##################################");
                continue;
            }
            
            String nome = nomeTemp;
            
            System.out.print("\nSalário: ");
            salario = leia.nextDouble();
            
      
            switch(opcao) {
                case 1:
                    novoSalario = salario + (0.10 * salario);
                    System.out.printf("\nNome do colaborador: %s", nome);
                    System.out.printf("\nCargo: Gerente");
                    System.out.printf("\nSalário: R$ %.2f\n", novoSalario);
                    break;
                case 2:
                	novoSalario = salario + (0.07 * salario);
                	System.out.printf("\nNome do colaborador: %s", nome);
                    System.out.printf("\nCargo: Vendedor");
                    System.out.printf("\nSalário: R$ %.2f\n", novoSalario);                   
                    break;
                case 3:
                	novoSalario = salario + (0.09 * salario);
                	System.out.printf("\nNome do colaborador: %s", nome);
                    System.out.printf("\nCargo: Supervisor");
                    System.out.printf("\nSalário: R$ %.2f\n", novoSalario);
                    break;
                case 4:
                	novoSalario = salario + (0.06 * salario);
                	System.out.printf("\nNome do colaborador: %s", nome);
                    System.out.printf("\nCargo: Motorista");
                    System.out.printf("\nSalário: R$ %.2f\n", novoSalario);                   
                    break;
                case 5:
                	novoSalario = salario + (0.05 * salario);
                	System.out.printf("\nNome do colaborador: %s", nome);
                    System.out.printf("\nCargo: Estoquista");
                    System.out.printf("\nSalário: R$ %.2f\n", novoSalario);
                    break;
                case 6:
                	novoSalario = salario + (0.08 * salario);
                	System.out.printf("\nNome do colaborador: %s", nome);
                    System.out.printf("\nCargo: Técnico de TI");
                    System.out.printf("\nSalário: R$ %.2f\n", novoSalario);
                    break;
            }
        }
    }
}