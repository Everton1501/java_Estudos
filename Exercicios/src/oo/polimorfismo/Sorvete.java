package oo.polimorfismo;

public class Sorvete extends Comida {
	
	private double peso;

	Sorvete (double peso) {
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
}
