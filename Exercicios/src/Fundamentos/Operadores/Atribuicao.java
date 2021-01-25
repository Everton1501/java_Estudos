package Fundamentos.Operadores;

public class Atribuicao {
  
	public static void main(String[] args) {
		
		int a = 3; 
		int b = a;
		int c = a + b;
		
		System.out.println("Vari�vel a = " + a);
		System.out.println("Vari�vel b = " + b);
		System.out.println("Vari�vel c = " + c);
		
		c += b; // c = c + b; ATRIBUI��O ADITIVA  
		System.out.println(c);
		
		c -= b; // c = c - b; ATRIBUI��O NEGATIVA
		System.out.println(c);
		
		c *= b; // c = c * b; ATRIBUI��O MULTIPLICATIVA
		System.out.println(c);
		
		c /= a; // c = c / a; ATRIBUI��O DIVISIVA
		System.out.println(c);
		
		c %= 2; // c = c % 2; resultado resto 0 � PAR e resto 1 � IMPAR, ATRIBUI��O MODULAR
		System.out.println(c);
	}
}
