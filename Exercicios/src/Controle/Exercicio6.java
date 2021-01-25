package Controle;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
	int numMagico = 75;
	
	Scanner entrada = new Scanner(System.in);
		
		int i = 10;
		
		
		while (i >= 1){
			i--;
			System.out.println("-------------------------------------------");
			System.out.print("Digite um número de 0 a 100: ");
			int num = entrada.nextInt();
			
			System.out.printf("Restam %d tentativas", i);
			
			if(num < numMagico) {
				System.out.println("\nO número digitado é menor");
			}else if(num > numMagico) {
				System.out.println("\nO número digitado é maior");
			}else if(num == numMagico) {
				System.out.println("\nVocê acertou!");
				System.out.println("PARABÉNS!");
				break;
			}
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	entrada.close();
	
	}

}
