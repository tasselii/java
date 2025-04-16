package aula_03_SE;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		float nota = leia.nextFloat();
		
		// if
		
		if (nota >= 7) {
			System.out.println("Aluno Aprovado!");
		}
		
		// if else
		
		if (nota >= 7) {
			System.out.println("Aluno Aprovado!");
		} System.out.println("Aluno Reprovado");
		
		// Else if
		
		if (nota >= 7) {
			System.out.println("Aluno Aprovado!");
		} else if(nota >=5 || nota < 7) { System.out.println("Aluno Exame!"); }
		else { System.out.println(" Aluno Reprovado"); }
		
		// if else
		
		String media = nota >= 7 ? "Aluno Aprovado" : "Aluno Reprovado";
		
		System.out.println(media);
	}
}
