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
		/* deu verdadeiro por causa da ordem de preced�ncia b-- s� vai ser decrementado ap�s a compara��o das
		 * vari�veis a++ = 2 e b = 2
		*/
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}
}
