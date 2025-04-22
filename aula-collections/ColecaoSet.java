package aula6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("maçã");
		
		System.out.println(frutas);
		
		frutas.forEach(System.out::println);
		
		/*for(var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}*/
		
		System.out.println("\nMorango existe na coleção " + frutas.contains("Morango"));
		
		// Excluir elemento da coleção
		frutas.remove("Morango");
		
		// Criar um Iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		// Liste os dados após a exclusão de um elemento
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		// Criamos a Coleção ArrayList
		ArrayList<String> frutasList = new ArrayList<String>() ;
		
		// Adiocionamos todos os elementos da Coleção Set (frutas)
		// Na Coleção ArrayList (frutaList)
		frutasList.addAll(frutas);	
		
		// Ordenamos frutasList em ordem crescente
		frutasList.sort(null);
	
		// Exibimos frutaList em ordem crescente
		System.out.println("Exibir os dados do Array List");
		frutasList.forEach(System.out::println);
		
		scan.close();	}
}
