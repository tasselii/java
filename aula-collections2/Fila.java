package aula7;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		// Cria a estrutura de dados Fila
		Queue<String> fila = new LinkedList<String>();

		// Adicionamos elementos na fila
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabricio");
		fila.add("Victor");

		fila.remove(); // Retiramos um elemento na fila

		System.out.println();

		fila.add("Thiago"); // Adiociona na fila

		// Exibimos a fila na tela
		for (var pessoa : fila) {
			System.out.println(pessoa);
		}

		System.out.println();

		System.out.println(fila.peek()); // Exibimos o primeiro da fila (HEAD)

		System.out.println(fila.poll() + "\n"); // Exibimos e removemos o primeiro elemento da fila

		System.out.println("A Maria está na fila? " + fila.contains("Maria"));

		System.out.println("A Carlos está na fila? " + fila.contains("Carlos"));

		System.out.println("\n" + fila);

		System.out.println("Qual é o tamanho da fila ? " + fila.size() + " pessoas\n");

		int contador = 0;

		for (var pessoa : fila) {
			contador++;
			if (pessoa.equalsIgnoreCase("maria")) {
				System.out.printf("A maria está em %d° lugar na fila", contador);
			}
		}

		scan.close();
	}
}
