package Controle;

import java.util.Scanner;

public class DesafioWhile {
	
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			double nota = 0;
			int notaInvalida = 0;
			double total = 0;
			int notaValida = 0;
			
			
			while (nota != -1) {
				System.out.print("Digite uma nota (ou -1 para sair): ");
				nota = entrada.nextDouble();
				
				
				
				if(nota <= 10 && nota >= 0) {
					System.out.println("Nota v�lida");	
					total = total + nota;
					notaValida++;
				}else  if(nota != -1){
					System.out.println("Nota inv�lida! ");
					System.out.println("Digite uma nota valida! ");
					notaInvalida++; 
					
				}
				
			}
			
			double media = total/notaValida;
			System.out.println("\n\nA m�dia de notas v�lidas foi de "+ media);
			System.out.println("A quantidade de notas inv�lidas "+notaInvalida);
			
			
			entrada.close();
			
			
		
		}

}
