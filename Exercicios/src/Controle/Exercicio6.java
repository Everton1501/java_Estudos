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
			System.out.print("Digite um n�mero de 0 a 100: ");
			int num = entrada.nextInt();
			
			System.out.printf("Restam %d tentativas", i);
			
			if(num < numMagico) {
				System.out.println("\nO n�mero digitado � menor");
			}else if(num > numMagico) {
				System.out.println("\nO n�mero digitado � maior");
			}else if(num == numMagico) {
				System.out.println("\nVoc� acertou!");
				System.out.println("PARAB�NS!");
				break;
			}
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	entrada.close();
	
	}

}
