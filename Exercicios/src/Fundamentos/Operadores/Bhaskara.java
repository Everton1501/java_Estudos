package Fundamentos.Operadores;

public class Bhaskara {

	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 12;
		int c = -13;
		int b2 = (int) Math.pow(b, 2);
		
		int delta = b2 - (4 * a * c);
		
		System.out.println("O valor de delta � igual a " + delta);
	}
}
