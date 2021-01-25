package Controle;

import java.util.Scanner;

public class DoWhile {

	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		String texto = "";
	
		do {
			System.out.println("Você precisa dizer as palavaras mágicas...");
			System.out.print("Você quer sair? ");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado!");
	

	entrada.close();	
	}
}
