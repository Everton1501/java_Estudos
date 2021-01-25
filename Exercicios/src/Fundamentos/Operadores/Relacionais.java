package Fundamentos.Operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		
		//Operadores Relacionais, todos eles darão resultados verdadeiros ou falsos
		System.out.println(3 > 5); // 3 é MAIOR que 5 = falso
		System.out.println(5 >= 5);// 5 é MAIOR OU IGUAL a 5 = verdadeiro
		System.out.println(7 < 7);// 7 é MENOR que 7 = falso
		System.out.println(5 <= 8);// 5 é MENOR OU IGUAL a 8 = verdadeiro
		System.out.println(1 != 3);// 1 é DIFERENTE de 3 = verdadeiro
		
		double nota = 7.3;
		boolean temBomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = temBomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto ? "+ temDesconto);
		
	}

}
