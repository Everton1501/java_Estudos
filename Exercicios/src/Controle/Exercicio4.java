package Controle;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o n�mero: ");
		int numero = entrada.nextInt();
		
		
		for(int i =2; i < numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if(contadorDeDivisores == 0) {
			System.out.println("O n�mero "+ numero+ " � primo"); 
		}else {
			System.out.println("O n�mero "+ numero+ " n�o � primo"); 
			
		}
		
		
		
		
		
				
		
		
		
		entrada.close();
		
		
		
	}
}