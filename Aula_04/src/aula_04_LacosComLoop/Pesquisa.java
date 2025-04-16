package aula_04_LacosComLoop;

import java.util.Scanner;

public class Pesquisa {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade, esporte, futebol = 0, voleibolM18 = 0, basqueteMN18 = 0;
        int totalRespostas = 0;
        String continua = "S";
        long somaIdades = 0;

        while (continua.equalsIgnoreCase("S")) {

            System.out.print("Digite a sua idade: ");
            idade = leia.nextInt();

            do {
                System.out.println("Digite o seu esporte favorito: (1-Fut / 2-Vol / 3-Basq / 4-Outros):");
                esporte = leia.nextInt();

                if (esporte < 1 || esporte > 4) {
                    System.out.println("Digite um valor entre 1 e 4");
                }

            } while (esporte < 1 || esporte > 4);

            if (esporte == 1) {
                futebol++;
            }

            if (esporte == 2 && idade > 18) {
                voleibolM18++;
            }

            if (esporte == 3 && idade < 18) {
                basqueteMN18++;
            }

            totalRespostas++;
            somaIdades += idade;

            System.out.print("Deseja continuar (S/N)? ");
            leia.skip("\\R"); // limpa o buffer antes de ler o próximo texto
            continua = leia.nextLine().toUpperCase();
        }

        double media = (double) somaIdades / totalRespostas;

        System.out.printf("\nTotal de pessoas que gostam de futebol: %d", futebol);
        System.out.printf("\nTotal de pessoas que gostam de voleibol e são maiores de idade: %d", voleibolM18);
        System.out.printf("\nTotal de pessoas que gostam de basquete e são menores de idade: %d", basqueteMN18);
        System.out.printf("\nMédia de idade: %.2f\n", media);

        leia.close();
    }
}
