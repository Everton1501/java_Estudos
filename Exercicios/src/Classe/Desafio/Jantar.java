package Classe.Desafio;

public class Jantar {

	 public static void main(String[] args) {
		
		 Comida c1 = new Comida ("Feij�o ", 0.2);
		 Comida c2 = new Comida ("Arroz ", 0.35);
		 Comida c3 = new Comida ("bife ", 0.3);
		 Comida c4 = new Comida ("tomate ", 0.06);
		 Comida c5 = new Comida ("Alface ", 0.035);
		 
		 Pessoa p = new Pessoa ("Jo�o ", 98.8);
		 
		 System.out.println(p.apresentar());
		 
		 p.comer(c1);
		 System.out.println(p.apresentar());
		 p.comer(c2);
		 System.out.println(p.apresentar());
		 p.comer(c3);
		 System.out.println(p.apresentar());
		 p.comer(c4);
		 System.out.println(p.apresentar());
		 p.comer(c5);
		 System.out.println(p.apresentar());
		 
		 
		 
		 
	}
}
