package aula_05;
 
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class teste2 {
 
	public static void main(String[] args) {
 
		Scanner leia = new Scanner(System.in);
		
		String vetorNome[]= new String[3];
		
		for(int indice = 0; indice < vetorNome.length; indice++) {
			System.out.print("Digite o nome " + (indice+1) + ": ");
			vetorNome[indice] = leia.nextLine();
		}
		
		for (var nome : vetorNome) {
		}
		
		Arrays.sort(vetorNome);
		
	
		for (var nome : vetorNome) {
			System.out.println("Nome: " + nome);
		}
	}
}
 
 