package Fundamentos.Operadores;

import java.util.Scanner;

public class AoCuboAoQuadrado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		int num1 = entrada.nextInt();
		
		int valor1 = (int) Math.pow(num1, 2);
		int valor2 = (int) Math.pow(num1, 3);
		
		System.out.printf("%n%d elevado ao quadrado � %d "
				, num1, valor1 );
		
		System.out.printf("%n%d elevado ao cubo � %d "
				, num1, valor2 );
		
		entrada.close();
	}
	
	
	
}

