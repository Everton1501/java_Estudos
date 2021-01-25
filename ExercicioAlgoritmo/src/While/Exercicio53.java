package While;

import java.util.Scanner;

public class Exercicio53 {

	/*
	 * 53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no
	 * final: a) Quantos homens foram cadastrados b) Quantas mulheres foram
	 * cadastradas c) A média de idade do grupo d) A média de idade dos homens e)
	 * Quantas mulheres tem mais de 20 anos
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int qtdeHomens = 0;
		int qtdeMulheres = 0;
		double total = 0;
		double totalHomens = 0;
		int totalMulheres20 = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Informe o sexo: [M/F] ");
			String sexo = entrada.next();

			System.out.print("Informe a idade: ");
			int idade = entrada.nextInt();
			total += idade;

			if (sexo.equalsIgnoreCase("M")) {
				qtdeHomens++;
				totalHomens += idade;
			} else if (sexo.equalsIgnoreCase("F")) {
				qtdeMulheres++;
			}
			if (sexo.equalsIgnoreCase("F") && idade > 20) {
				totalMulheres20++;
			}

		}

		double mediaHomens = totalHomens / qtdeHomens;
		double media = total / (qtdeHomens + qtdeMulheres);

		System.out.println("A quantidade de homens que foram cadastrados " + qtdeHomens);
		System.out.println("A quantidade de mulheres que foram cadastradas " + qtdeMulheres);
		System.out.println("A média de idade do grupo foi de " + media);
		System.out.println("A média de idade dos homenes foi de " + mediaHomens);
		System.out.println("A quantidade de mulheres com mais de 20 anos " + totalMulheres20);
		System.out.println();

		entrada.close();

	}

}
