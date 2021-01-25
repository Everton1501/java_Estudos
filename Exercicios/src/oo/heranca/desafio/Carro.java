package oo.heranca.desafio;

public class Carro {
	
	
	final int VELOCIDADEMAXIMA;
	public int velocidadeAtual;
	private int delta = 5;
	
	
	Carro (int velocidademaxima) {
		VELOCIDADEMAXIMA = velocidademaxima;
	}
	
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
			
	}
	
	public void frear() {
		if(velocidadeAtual >= delta) {
			velocidadeAtual -=delta;
		}else {
			velocidadeAtual = 0;
		}
	}


	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}
}
