package While;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio52 {

	/*52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
		a) Qual � a m�dia de idade do grupo
	b) Quantas pessoas tem mais de 18 anos
	c) Quantas pessoas tem menos de 5 anos
	d) Qual foi a maior idade lida
	 */	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] idade = new int [10];
 		int maior18 = 0;
 		int menor5 = 0;
 		int maiorIdade = 0;
 		double total = 0;
 		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite sua idade: ");
			idade[i] = entrada.nextInt();
			total += idade[i];
			
			
			if(idade[i] >= 18) {
				maior18 ++;
			}else if(idade[i] < 5){
				menor5 ++;	
			}
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
			}
		}
			
		double media = total/idade.length;
		
		System.out.println(Arrays.toString(idade));
		System.out.println(maior18);
		System.out.println(menor5);
		System.out.println(maiorIdade);
		System.out.println(total);
		System.out.println(media);
		
		
		
		
		
		
		
		
		

		entrada.close();
		 
		
		
		
		
		
		
		
		
		
		
	}
}
