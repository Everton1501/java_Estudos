package Controle;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nome = entrada.next();
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Digite a primeira nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1+nota2) / 2;
		
		if(media >= 7 && media <=10) {
			System.out.printf("O %s tem %.2f pontos e est� Aprovado", nome, media);
		}else if(media > 4 && media < 7) {
			System.out.printf("O %s tem %.2f pontos e est� em Recupera��o", nome, media);
		}else {
			System.out.printf("O %s tem %.2f pontos e est� Reprovado", nome, media);
		}
		
		
		
		entrada.close();
		
		
		
		
		
	}
}
