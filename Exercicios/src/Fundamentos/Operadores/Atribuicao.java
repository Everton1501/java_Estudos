package Fundamentos.Operadores;

public class Atribuicao {
  
	public static void main(String[] args) {
		
		int a = 3; 
		int b = a;
		int c = a + b;
		
		System.out.println("Variável a = " + a);
		System.out.println("Variável b = " + b);
		System.out.println("Variável c = " + c);
		
		c += b; // c = c + b; ATRIBUIÇÃO ADITIVA  
		System.out.println(c);
		
		c -= b; // c = c - b; ATRIBUIÇÃO NEGATIVA
		System.out.println(c);
		
		c *= b; // c = c * b; ATRIBUIÇÃO MULTIPLICATIVA
		System.out.println(c);
		
		c /= a; // c = c / a; ATRIBUIÇÃO DIVISIVA
		System.out.println(c);
		
		c %= 2; // c = c % 2; resultado resto 0 é PAR e resto 1 é IMPAR, ATRIBUIÇÃO MODULAR
		System.out.println(c);
	}
}
