package Fundamentos.Operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite um outro n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("digite o operador :");
		String operador = entrada.next();
		
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f"
				, num1, operador, num2, resultado);
		
		entrada.close();
		
	}
}
