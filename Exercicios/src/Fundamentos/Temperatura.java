package Fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (F° - 32) * 5/9 = C°
		final double ajuste = 32;
		final double multiplicador = 5.0 / 9.0;

		double F = 86;

		double C = (F - ajuste) * multiplicador;

		System.out.println("São " + C + "° Celsius");

		F = 150;
		C = (F - ajuste) * multiplicador;

		System.out.println("São " + C + "° Celsius");
	}

}
