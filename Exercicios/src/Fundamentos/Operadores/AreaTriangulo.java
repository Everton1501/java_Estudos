package Fundamentos.Operadores;

import java.util.Scanner;

public class AreaTriangulo {
  
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a base do tri�ngulo: ");
		double b = entrada.nextDouble();
		
		System.out.print("Digite a Altura do tri�ngulo: ");
		double h = entrada.nextDouble();
		
		double a = (b * h) / 2;
		
		System.out.println("A �rea do tri�ngulo � " + a);
	
		
		
		entrada.close();
	}
}
