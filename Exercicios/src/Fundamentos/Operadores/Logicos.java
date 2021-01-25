package Fundamentos.Operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		
		//"E", "OU" e "XOR" SÃO OPERADORES BINÁRIOS 
		
		System.out.println("\nTabela verdade E (AND) ");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);  RESPOSTA FALSE
		//System.out.println(false && false); RESPOSTA FALSE
		
		
		System.out.println("\nTabela verdade OU (OR) ");
		//System.out.println(true || true); RESPOSTA VERDADEIRO
		//System.out.println(true || false); RESPOSTA VERDADEIRO
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		System.out.println("\nTabela verdade OU EXCLUSIVO (XOR) ");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// NEGAÇÃO É UM OPERADOR UNÁRIO
		System.out.println("\nTabela verdade negação (NOT)");
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
