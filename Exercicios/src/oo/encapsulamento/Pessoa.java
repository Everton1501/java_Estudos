package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Pessoa (String nome, int idade) { 
		setNome(nome);						// foi passado como par�metro Setidade que � um metodo void
		setIdade(idade);        // pois possui par�metros para evitar q o usu�rio final digite  
	}							// dentro do construtor evitando uma idade inv�lida seja lida pelo
								// pelo programa.
	
	public int getIdade() { // o metodo get � o que ler o valor.
		return idade;
	}
	public void setIdade(int novaIdade) {  // o metodo set � o que altera o valor.
		novaIdade = Math.abs(novaIdade); //N�o deixa negativo entrar, e ignora o sinal e ler o n�.
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	@Override
	public String toString() {
		return "Ol� eu sou " + getNome() + " e tenho  " +  getIdade() + " anos.";
	}

}
