package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			
			String texto = "";
			
			while(!texto.equalsIgnoreCase("sair")) {
				System.out.print("Digite algo: ");
				texto = entrada.nextLine();
			
				System.out.println(texto);
			}
			entrada.close();
			
			
		}
}
