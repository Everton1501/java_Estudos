package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas: ");
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double[qtdeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota "+(i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		
		double media = total/notas.length;
		System.out.println("A média das notas é " + media);
		entrada.close();
		
		
		
		
	
	}
	/*Scanner entrada = new Scanner (System.in);
		
			System.out.print("Digite quantas notas você quer armazenar:");
			int notas = entrada.nextInt();
			
			
			double notaAluno = 0;
			for(int i = 0; i < notas; i++) {
				System.out.print("digite a " + i + "° nota:"  );
				double nota = entrada.nextDouble();
				notaAluno += nota; 
			}
			
			System.out.println(notaAluno/notas);
		entrada.close();
	*/

}
