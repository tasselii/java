package aula_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestaStream {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		List<Integer> numerosAoCubo = numeros.stream()
				.map(n -> n*n*n)
				.collect(Collectors.toList());
		
		System.out.println("\nNumeros elevados ao cubo: " + numerosAoCubo);
		
		System.out.println("\nColeção Numeros: " + numeros);
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		
		System.out.println("\nNumeros Pares: " + numerosPares);
		
		estados.stream()
        .filter(x-> x.toString().startsWith("S"))
        .forEach(System.out::println);
		
		List<String> estadosIniciandoR = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.collect(Collectors.toList());

		System.out.println();
		
		System.out.println("Estados que iniciam com a letra R: " + estadosIniciandoR);
		
		System.out.println();
		
		estados.forEach(e -> System.out.println(e));
		
		long contagemEstadosIniciandoR = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.count();
		
		System.out.println("\nEstados que iniciam com a letra R: " + contagemEstadosIniciandoR);
		
		long contagemEstadosUnicosIniciandoR = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.distinct()
				.count();
		
		System.out.println("\nEstados que iniciam com a letra R unicos: " + contagemEstadosUnicosIniciandoR);
		
		List<Integer> numerosOrdenados = numerosDesordenados.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("\nNumeros ordenados: " + numerosOrdenados);
	}

}
