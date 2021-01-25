package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		
		double[] notasAlunoA = new double[5];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.6;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		notasAlunoA[4] = 6.3;
		
		System.out.println(Arrays.toString(notasAlunoA));
		//Arrays.toString -> usado para coseguir imprimir os valores no console.
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		//System.out.println(notasAlunoA[5]); ERRO!!!, UMA VEZ QUE O ARRAY VAI ATÉ O 5, A 
		//CONTAGEM COMEÇA DO 0 ATÉ O 4 E O 5 TA ALÉM E POR ISSO DA ERRO
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
				totalAlunoA += notasAlunoA[i];
		}
		// notasAlunos.lenght é usado para preencher a quantidade certa da variável para
		//não ter que a todo momento mudar o tamanho. e já ter a quantidade correta 
		System.out.println(totalAlunoA/ notasAlunoA.length);
		
		double[] notasAlunoB = {9.7, 8.3, 7.2, 6.6, 6};
		double TotalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			TotalAlunoB += notasAlunoB[i];	
		}
		System.out.println(Arrays.toString(notasAlunoB));
		System.out.println(TotalAlunoB / notasAlunoB.length);
		
		
		
		
		
		
	}

}
