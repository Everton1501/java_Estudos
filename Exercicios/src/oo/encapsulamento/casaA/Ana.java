package oo.encapsulamento.casaA;

public class Ana {
	
	@SuppressWarnings("unused")
	private String segredo = "..."; //PRIVADO PERTENCE APENAS A MESMA CLASSE
	String facoDentroDeCasa = "..."; // DEFAULT OU PACOTE, PERTENCE APENAS AO MESMO PACOTE
	protected String formaDeFalar = "..."; //PROTECTED RECEBE POR ESTAR NO MSM PACOTE
	//OU RECEBE POR HERANÇA
	public String todosSabem = "..."; // PUBLIC

}
