package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exe_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final String RED = "#00000";
		final String RESET = "\u001B[0m";
		
		int choice = 0;

		Stack<String> line = new Stack<String>();

		while (true) {

			System.out.println("\n");
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                 MENU                ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║   1    │ Adicionar Livro na pilha   ║");
			System.out.println("║   2    │ Listar todos os Livros     ║");
			System.out.println("║   3    │ Retirar livro da pilha     ║");
			System.out.println("║        │                            ║");
			System.out.println("║   0    │ Sair                       ║");
			System.out.println("╠═════════════════════════════════════╣");;
			System.out.println("║      Entre com a opção desejada     ║");
			System.out.println("╚═════════════════════════════════════╝\n");
			
			String input = scan.next();
			
			if (!input.matches("[0-3]")) {
		        System.out.println("\n⚠️ Opção inválida. Por favor, escolha uma opção do menu.");
		        continue;
		    }
			
			choice = Integer.parseInt(input); 

			scan.nextLine(); 

			switch (choice) {
			case 1:
				while (true) {
					System.out.print("\nDigite o nome: ");
					String name = scan.nextLine();

					if (!name.isEmpty()) {
						line.add(name);

						System.out.println("\n----------------");
						System.out.println("\nPilha: \n");

						for (var client : line) {
							System.out.println(client);
						}
						System.out.println("\nLivro Adicionado!");
						break;

					} else {
						System.out.println("\nNome inválido. Tente novamente.");
					}
				}
				break;
			case 2:
				System.out.println("\nLista de Livros na Pilha: \n");

				for (var client : line) {
					System.out.println(client);
				}
				break;
			case 3:
				if (!line.isEmpty()) {
				System.out.println("\nFila: \n");
					
					String chosenBook = line.peek();
					
					for (var client : line) {
						System.out.println(client);
					}

					System.out.printf("\nO Livro %s%s%s foi retirado da pilha! ", RED, chosenBook.toUpperCase(), RESET);

				} else {
					System.out.println("\nA Pilha está vazia!");
				}
				break;
			case 0:
				System.out.println("\n═══════════════════════════════════════");
				System.out.println("          Programa finalizado!          ");
				System.out.println("========================================\n");

				return;
			default:
				System.out.println("\n⚠️ Opção inválida. Por favor, escolha uma opção do menu.");
				break;
			}
			
		}
	}
}
