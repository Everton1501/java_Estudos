package Controle;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o ano: ");
		int anoAtual = entrada.nextInt();
	
		
		if(anoAtual % 400 == 0) {
			System.out.println("O ano � bissexto");
		}else if(anoAtual % 4 ==0 && anoAtual % 100 != 0){
			System.out.println("Ano � bissexto");
		}else {
			System.out.println("Ano n�o � bissexto ");
			
		}
		entrada.close();
		
	}

}
