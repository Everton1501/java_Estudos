package Controle;

import java.util.Scanner;

public class Exercicio5 {
		
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = entrada.nextInt();
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch(contadorDeDivisores) {
		case 0:
			System.out.println("N�mero � primo");
			break;
		default:
			System.out.println("n�mero n�o � primo");
		}
		
		
		
		
		
		
		
		
		
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
