package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	
	public static void main(String[] args) {
		
		System.out.println("2" == "2"); // vai dar verdadeiro
		
		String s1 = "2";
		System.out.println("2" == s1); // vai dar verdadeiro
		
		String s2 = new String ("2");
		System.out.println("2" == s2); // vai dar falso
		
		System.out.println("2".equals(s2)); //nesse caso soluciona o problema acima e da verdadeiro
		
		Scanner entrada = new Scanner (System.in);
		
		String s3 = entrada.next();
		System.out.println(s3);
		System.out.println("2" == s3.trim()); //vai dar falso
		System.out.println("2".equals(s3.trim())); // verdadeiro
		
		entrada.close();
       		
		
		
	}
}
