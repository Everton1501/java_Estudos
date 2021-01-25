package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o salário do mês de Setembro: ");
		String sal1 = entrada.nextLine().replace(",", ".");
		
		
		System.out.print("Digite o salário do mês de Outubro: ");
		String sal2 = entrada.nextLine().replace(",", ".");
		
		
		System.out.print("Digite o salário do mês de Novembro: ");
		String sal3 = entrada.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(sal1);
		double s2 = Double.parseDouble(sal2);
		double s3 = Double.parseDouble(sal3);
		
		double media = (s1 + s2 + s3)/ 3;
		
        System.out.printf("A média dos 3 meses foi de %.2f " , media);	
		
		
		
		
		entrada.close();
	}
}
