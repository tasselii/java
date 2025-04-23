package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final String YELLOW = "\u001B[33m";
		final String RESET = "\u001B[0m";

		int choice = 0;

		Queue<String> line = new LinkedList<String>();

		while (true) {

			System.out.println("\n");
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                 MENU                ║");
			System.out.println("╠═════════════════════════════════════╣");			
			System.out.println("║   1    │ Adicionar Clientes na Fila ║");
			System.out.println("║   2    │ Listar todos os Clientes   ║");
			System.out.println("║   3    │ Retirar Clientes da Fila   ║");
			System.out.println("║        │                            ║");
			System.out.println("║   0    │ Sair                       ║");
			System.out.println("╠═════════════════════════════════════╣");			
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

					if (!name.isEmpty() && name.matches("[\\p{L} ]+")) {
						line.add(name);

						System.out.println("\n----------------");
						System.out.println("\nFila: \n");

						for (var client : line) {
							System.out.println(client);
						}
						System.out.println("\nCliente Adicionado!");
						break;
						
					} else {
						System.out.println("\nNome inválido. Tente novamente.");
					}
				}
				break;
			case 2:
				System.out.println("\nLista de Clientes na Fila: \n");

				for (var client : line) {
					System.out.println(client);
				}
				break;
			case 3:
				if (!line.isEmpty()) {
					System.out.println("\nFila: \n");

					String choseName = line.poll();

					for (var client : line) {
						System.out.println(client);
					}
					char lastLetter = choseName.charAt(choseName.length() - 1);

					if (lastLetter == 'o') {
						System.out.printf("\nO Cliente %s%s%s está sendo Chamado! ", YELLOW, choseName.toUpperCase(),
								RESET);
					} else if (lastLetter == 'a') {
						System.out.printf("\nA Cliente %s%s%s está sendo Chamada! ", YELLOW, choseName.toUpperCase(),
								RESET);
					}

				} else {
					System.out.println("\nA Fila está vazia!");
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
