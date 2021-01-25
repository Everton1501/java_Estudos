package Controle;

public class WhileDeterminado {
	
	
	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.printf("i = %d%n", contador);
			contador++;
		}
		int cont = 0;
		
		while(cont <= 10) {
			System.out.printf("cont = %d%n", cont);
			cont += 2;
		}
		int c = 10;
		
		while(c >= 0) {
			System.out.printf("c = %d%n", c);
			c--;
		}
		
	}
	

}
