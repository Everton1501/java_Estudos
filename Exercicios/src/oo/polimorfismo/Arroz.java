package oo.polimorfismo;

public class Arroz extends Comida{
	
	private double peso;
	
	Arroz(double peso) {
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
