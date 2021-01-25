package Fundamentos.Operadores;

public class Unarios {

	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1 INCREMENTA 1
		a--; // a = a - 1 DECREMENTA 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); 
		/* deu verdadeiro por causa da ordem de precedência b-- só vai ser decrementado após a comparação das
		 * variáveis a++ = 2 e b = 2
		*/
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}
}
