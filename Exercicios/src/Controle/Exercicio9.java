package Controle;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int maiorNum = 0;
	
		
		for(int i = 0; i < 10; i++ ) {
			System.out.print("Digite um número: ");
			int num = entrada.nextInt();
			
			if (num > maiorNum) {
				maiorNum = num;
			}	
			System.out.println("Maior número foi "+ maiorNum);
		}
		
		entrada.close();
	}
}

