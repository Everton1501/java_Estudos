package Fundamentos.Operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		
		//Operadores Relacionais, todos eles dar�o resultados verdadeiros ou falsos
		System.out.println(3 > 5); // 3 � MAIOR que 5 = falso
		System.out.println(5 >= 5);// 5 � MAIOR OU IGUAL a 5 = verdadeiro
		System.out.println(7 < 7);// 7 � MENOR que 7 = falso
		System.out.println(5 <= 8);// 5 � MENOR OU IGUAL a 8 = verdadeiro
		System.out.println(1 != 3);// 1 � DIFERENTE de 3 = verdadeiro
		
		double nota = 7.3;
		boolean temBomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = temBomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto ? "+ temDesconto);
		
	}

}
