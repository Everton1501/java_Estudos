package arrays;

public class ForEach {
	
	public static void main(String[] args) {
		
		
		double[] notas = {9.9, 8.8 , 7.6, 7.7};
		
		// LAÇO FOR
		for(int i = 0; i < notas.length; i++) {
			System.out.print(" [" + notas[i] + "] ");	
		}
		System.out.println();
		// LAÇO FOR EACH
		for(double nota: notas) {
			System.out.print(" [" + nota + "] ");
		}
		
		
		
		
		
		
	}

}
