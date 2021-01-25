package Fundamentos.Operadores;

public class DesafioAritimetico {
	
	public static void main(String[] args) {
		
		int a = 6 * (3 + 2);
		int a1 = (int) Math.pow(a, 2);
		int at = a1 / (3 * 2);
		
		int b = (1-5)*(2-7)/2;
		int bt = (int) Math.pow(b, 2);
		
		int c = at - bt;
		int ct = (int) Math.pow(c, 3);
		int d = (int) Math.pow(10, 3);
		
		int resp = ct/d;
		
		System.out.println("A resposta da equação foi de " + resp);
		
		
	}

}
