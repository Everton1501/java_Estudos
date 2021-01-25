package oo.heranca.sistema;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Sistema {
	
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		Civic civic = new Civic();
		
		ferrari.velocidadeAtual = 0;
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeAtual);
		ferrari.desligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeAtual);
		
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.frear();		
		civic.frear();		
		civic.frear();		
		civic.frear();		
		civic.frear();		
		civic.acelerar();
		civic.acelerar();
	

		System.out.println(civic.velocidadeAtual);
	}
}