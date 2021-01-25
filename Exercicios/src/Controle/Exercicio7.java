package Controle;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;
		int soma = 0;

		while (num >= 0) {
			System.out.print("Digite um número ou digite um número negativo para sair: ");
			num = entrada.nextInt();
		
			if(num >= 0) {
				soma += num;	
				
			}
		}
		
		System.out.printf("a soma dos número positivos foi de %d ", soma);
		
		
		entrada.close();

	}
}
