package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana; // TEVE QUE SER IMPORTADO POR N�O ESTAR NO MESMO PACOTE

public class Pedro extends Ana{

	
	void testeAcessos() {
		//System.out.println(segredo); --> N�O RECEBE PQ � PRIVADO DA CLASSE ANA
		//System.out.println(facoDentroDeCasa); --> N�O RECEBE PQ N�O PERTENCE AO MESMO PACOTE DE
		//ANA
		System.out.println(formaDeFalar); 
		System.out.println(todosSabem);
	}
	/* OBSERVA-SE QUE MESMO ESTANDO EM OUTRO PACOTE PEDRO N�O PRECISOU CRIAR UM:
	 * ~~~~Ana mae = new Ana();~~~~ E NEM ~~~~~~system.out.println(mae.formaDeFalar);~~~~
	 * PQ RECEBEU DE HERAN�A. N�O PRECISOU ENTRAR NA CLASSE PARA PARA ACESSAR AS INFORMA��ES.
	 */

}
