package Fundamentos.Operadores;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite quantos graus celsius: ");
		double c = entrada.nextDouble();
		
		double f= (c * 9/5) + 32;
		
		System.out.printf("%.2f graus Celsius são %.2f graus Fahrenheit. "
				, c, f);
		
		
		entrada.close();
	}

}
