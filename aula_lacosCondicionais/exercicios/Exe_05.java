package aula_03_SE;

import java.util.Scanner;

public class Exe_05 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valorTotal;
        int opcao;

        while (true) {
        	System.out.println();
            System.out.println("╔═══════════════════════════════════════════════════════╗");
            System.out.println("║                 CARDÁPIO DE LANCHES                   ║");
            System.out.println("╠═══════════════════════════════════════════════════════╣");
            System.out.println("║ Código │ Produto             │ Preço Unitário         ║");
            System.out.println("╟────────┼─────────────────────┼────────────────────────╢");
            System.out.println("║   1    │ Cachorro Quente     │ R$ 10.00               ║");
            System.out.println("║   2    │ X-Salada            │ R$ 15.00               ║");
            System.out.println("║   3    │ X-Bacon             │ R$ 18.00               ║");
            System.out.println("║   4    │ Bauru               │ R$ 12.00               ║");
            System.out.println("║   5    │ Refrigerante        │ R$ 8.00                ║");
            System.out.println("║   6    │ Suco de laranja     │ R$ 13.00               ║");
            System.out.println("║   7    │ Sair                │                        ║");
            System.out.println("╚═══════════════════════════════════════════════════════╝");

            System.out.print("Código do produto: ");
            opcao = leia.nextInt();

            if (opcao == 7) {
                System.out.println("\nSaindo... Até mais!");
                leia.close();
                break;
            }

            if (opcao < 1 || opcao > 6) {
                System.out.println();
                System.out.println("##################################");
                System.out.println("#         OPÇÃO INVÁLIDA!        #");
                System.out.println("#   Por favor, tente novamente   #");
                System.out.println("##################################");
                continue;
            }

            System.out.print("Quantidade: ");
            int quant = leia.nextInt();

            switch (opcao) {
                case 1:
                    valorTotal = quant * 10;
                    System.out.println("\nProduto: Cachorro Quente");
                    System.out.printf("Valor total: R$ %.2f\n", valorTotal);
                    break;
                case 2:
                    valorTotal = quant * 15;
                    System.out.println("\nProduto: X-Salada");
                    System.out.printf("Valor total: R$ %.2f\n", valorTotal);
                    break;
                case 3:
                    valorTotal = quant * 18;
                    System.out.println("\nProduto: X-Bacon");
                    System.out.printf("Valor total: R$ %.2f\n", valorTotal);
                    break;
                case 4:
                    valorTotal = quant * 12;
                    System.out.println("\nProduto: Bauru");
                    System.out.printf("Valor total: R$ %.2f\n", valorTotal);
                    break;
                case 5:
                    valorTotal = quant * 8;
                    System.out.println("\nProduto: Refrigerante");
                    System.out.printf("Valor total: R$ %.2f\n", valorTotal);
                    break;
                case 6:
                    valorTotal = quant * 13;
                    System.out.println("\nProduto: Suco de laranja");
                    System.out.printf("Valor total: R$ %.2f\n", valorTotal);
                    break;
                default:
                    break;
            }
        }
    }
}
