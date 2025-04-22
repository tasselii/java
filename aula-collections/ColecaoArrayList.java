package aula6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class ColecaoArrayList {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		// Criamos a Coleção ArrayList
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		// Adicionando numeros a Coleção ArrayList
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
		//System.out.println("Digite um número real: ");
		//double input = scan.nextDouble();
		
		//numeros.add(input);
		
		// Listando os valores da Coleção ArrayList
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		// Verifica a Posição do número no Indice
		System.out.println("\nIndice do numero 9.0: " + numeros.indexOf(9.0));
		
		// Verifica se o numero existe na Coleção
		System.out.println("\nIndice do numero 9.0: " + numeros.contains(9.0));

		// Verifica o valor que está localizado em tal posição
		System.out.println("\nQual valor está armazenado no indice 2? " + numeros.get(2));
		
		// Alterar o valor de um elemento 
		numeros.set(2, 10.0);
		
		// Exibe os dados atualizados, através do método forEach
		System.out.println("\nExibe os dados após a Atualização");
		numeros.forEach(System.out::println);
		
		// Remove um elemento da lista
		numeros.remove(10.0);
		
		// Remove um elemento da lista baseado no seu valor
		numeros.remove(numeros.indexOf(2.0));
		
		// Exibe os dados atualizados, através do método forEach
		System.out.println("\nExibe os dados após a Remoção");
		numeros.forEach(System.out::println);
		
		// Retorna o tamanho da coleção
		System.out.println("\nQual o tamanho da Coleção? " + numeros.size());
		
		// limpar a coleção
		// numeros.clear();
		
		// Verifica se a coleção está vazia
		System.out.println("\nA coleção está vazia? " + numeros.isEmpty());
		
		// Ordena a Coleção em ordem crescente
		numeros.sort(null);		
		
		System.out.println("\nExibe os dados em ordem crescente");
		numeros.forEach(System.out::println);
		
		// Ordena a Coleção em ordem decrescente
		numeros.sort(Comparator.reverseOrder());

		
		scan.close();
	}
}
