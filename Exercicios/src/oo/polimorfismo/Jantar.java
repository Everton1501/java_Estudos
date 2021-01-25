package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado1 = new Pessoa(89.4);
		
		Arroz arroz = new Arroz(0.2);
		Feijao feijao = new Feijao(0.18);
		Carne carne = new Carne(0.08);
		Sorvete sorvete = new Sorvete(0.5);
		
		convidado1.comer(arroz);
		convidado1.comer(feijao);
		convidado1.comer(carne);
		convidado1.comer(sorvete);
	
		System.out.printf("%.2f",convidado1.getPeso());
	}
}
