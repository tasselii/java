package aula_03_SE;

public class Operadores {

	public static void main(String[] args) {
		
		int x = 10, y = 5, z = 5, w = 20;
		
		// Operadores Relacionais
		
		System.out.printf("\n %d > %d = %b", x, y, (x > y));
		System.out.printf("\n %d < %d = %b", x, y, (x < y));
		System.out.printf("\n %d >= %d = %b", z, y, (z >= y));
		System.out.printf("\n %d <= %d = %b", z, y, (z <= y));
		
		// Operadores Lógicos
		
		System.out.printf("\n (%d > %d) E (%d < %d) = %b", x, y, z, w, (x > y ) && ( z < w));
		System.out.printf("\n (%d > %d) OU (%d < %d) = %b", x, y, z, w, (x > y ) || ( z < w));
		System.out.printf("\n (%d > %d) OU (%d < %d) = %b", x, y, z, w, (!(x > y ) || ( z < w)));
		System.out.printf("\n (%d > %d) OU (%d < %d) = %b", x, y, z, w, (!(x > y ) || (!( z < w))));
	}
}
