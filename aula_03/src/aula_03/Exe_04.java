package aula_03;

import java.util.Scanner;

public class Exe_04 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("----------------------------------------------------");
        System.out.println("             Classificação de Animais               ");
        System.out.println("----------------------------------------------------");
        System.out.println("                                                    ");
        System.out.println("1 - Verificar classificação de um vertebrado        ");
        System.out.println("2 - Verificar classificação de um invertebrado      ");
        System.out.println("                                                    ");
        System.out.println("----------------------------------------------------");
        System.out.println("            Digite a palavra sem ACENTOS:           ");
        System.out.println("----------------------------------------------------");
        
		System.out.print("Digite o tipo (vertebrado ou invertebrado): ");
		String tipo = leia.nextLine(), grupo = "";
		
		if (tipo.equals("vertebrado")) {
		    System.out.print("Digite o grupo (ave, mamifero): ");
		    grupo = leia.nextLine();
		} else if (tipo.equals("invertebrado")) {
		    System.out.print("Digite o grupo (inseto ou anelideo): ");
		    grupo = leia.nextLine();
		}
		
		System.out.print("Digite a alimentação (carnivoro, onivoro, herbivoro ou hematofago): ");
		String alimentacao = leia.nextLine();
	
		if (tipo.equals("vertebrado")) {
		    if (grupo.equals("ave")) {
		        if (alimentacao.equals("carnivoro")) {
		            System.out.println("----------------------------------------------------");
		            System.out.println("                      Águia                         ");
		            System.out.println("----------------------------------------------------");
		        } else if (alimentacao.equals("onivoro")) {
		            System.out.println("----------------------------------------------------");
		            System.out.println("                      Pomba                         ");
		            System.out.println("----------------------------------------------------");
		        }
		    } else if (grupo.equals("mamifero")) {
		        if (alimentacao.equals("onivoro")) {
		            System.out.println("----------------------------------------------------");
		            System.out.println("                      Homem                         ");
		            System.out.println("----------------------------------------------------");
		        } else if (alimentacao.equals("herbivoro")) {
		            System.out.println("----------------------------------------------------");
		            System.out.println("                      Vaca                          ");
		            System.out.println("----------------------------------------------------");
		        }
		    }
		} else if (tipo.equals("invertebrado")) {
		    if (grupo.equals("inseto")) {
		        if (alimentacao.equals("hematofago")) {
		            System.out.println("----------------------------------------------------");
		            System.out.println("                      Pulga                         ");
		            System.out.println("----------------------------------------------------");
		        } else if (alimentacao.equals("herbivoro")) {
		            System.out.println("----------------------------------------------------");
		            System.out.println("                      Lagarta                       ");
		            System.out.println("----------------------------------------------------");
		        }
		    } else if (grupo.equals("anelideo")) {
		        if (alimentacao.equals("hematofago")) {
		            System.out.println("----------------------------------------------------");
		            System.out.println("                      Sanguessuga                   ");
		            System.out.println("----------------------------------------------------");
		        } else if (alimentacao.equals("onivoro")) {
		            System.out.println("----------------------------------------------------");
		            System.out.println("                      Minhoca                       ");
		            System.out.println("----------------------------------------------------");
		        }
		    }
	     }
      }
   }

