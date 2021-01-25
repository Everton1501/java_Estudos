package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos: ");
		int alunos = entrada.nextInt();
		
		System.out.print("quantas notas: ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double [alunos][qtdeNotas];
		
		double total = 0;
		for(int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Digite a nota %d do aluno %d: ", j+1, i+1);
				notasDaTurma[i][j] = entrada.nextDouble();		
				total += notasDaTurma[i][j];
			}
		}
		
		for(double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
			
		}
		
		double media = total/(alunos * qtdeNotas);
		System.out.println("A média da turma foi de " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
