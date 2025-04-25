package aula7;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Cria a estrutura de dados Pilha
		Stack<String> pilha = new Stack<String>();
		
		// Adiciona elementos na Pilha
		pilha.add("Comunicação não violenta");
		pilha.add("IT: A coisa");
		pilha.add("A coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diário de um banana");
		pilha.add("Senhor dos Anéis");
		pilha.add("O Código da Vinci");
		
		// Adicionar um elemento na pilha, via teclado
		System.out.println("Digite o Título de um livro: ");
		pilha.push(scan.nextLine());
		
		
		System.out.println(pilha);
		
		System.out.println();
		
		// Retira um elemento da Pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		// Adiciona um Elemento na Pilha
		pilha.push("Roube como um Artista");

		System.out.println();
		
		System.out.println(pilha);
		
		// Exibe um Elemento que está no topo da pilha
		System.out.println(pilha.peek());
		
		// Verifica se o livro existe na Pilha
		System.out.println("\nO Livro Diário de um banana, existe na Pilha? " + pilha.contains("Diário de um banana"));
		
		for (var nomesLivros : pilha) {
			System.out.println(nomesLivros);
		}
		
		scan.close();
		}
}
