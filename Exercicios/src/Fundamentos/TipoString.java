package Fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equals("boa tade"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		var nome = "Everton";
		var sobrenome = "de Brito Rodrigues";
		var idade = 32;
		var salario = 12345.987;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$.2f.", nome, sobrenome, idade, salario);
		
	
		
		
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		String maisUmaFrase = "\nNome: "+ nome+ "\nSobrenome: "+ sobrenome 
				 + "\nIdade: " + idade + "\nSal�rio: " + salario;
		System.out.println(maisUmaFrase);
		
				
	}

}