package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		//System.out.println(segredo); --> N�O RECEBE PQ � PRIVADO DA CLASSE ANA
		//System.out.println(facoDentroDeCasa); --> N�O RECEBE PQ N�O PERTENCE AO MESMO PACOTE DE
		//ANA
		//System.out.println(formaDeFalar); --> N�O RECE PQ N�O TEM HERAN�A
		System.out.println(sogra.todosSabem);
	}
	
	/*OBS: TEM QUE SER IMPORTADO PORQUE � DE UM PACOTE DIFERENTE.
	 *  TEM QUE CRIAR UMA INST�NCIA PQ COMO PAULO, N�O FOI PASSADO UM HERAN�A. 
	 *  E POR N�O TER SIDO PASSADO POR HERAN�A N�O CONSEGUE ACESSAR O QUE EST� PROTECTED
	 */
}
