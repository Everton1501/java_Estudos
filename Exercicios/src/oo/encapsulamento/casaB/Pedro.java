package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana; // TEVE QUE SER IMPORTADO POR NÃO ESTAR NO MESMO PACOTE

public class Pedro extends Ana{

	
	void testeAcessos() {
		//System.out.println(segredo); --> NÃO RECEBE PQ É PRIVADO DA CLASSE ANA
		//System.out.println(facoDentroDeCasa); --> NÃO RECEBE PQ NÃO PERTENCE AO MESMO PACOTE DE
		//ANA
		System.out.println(formaDeFalar); 
		System.out.println(todosSabem);
	}
	/* OBSERVA-SE QUE MESMO ESTANDO EM OUTRO PACOTE PEDRO NÃO PRECISOU CRIAR UM:
	 * ~~~~Ana mae = new Ana();~~~~ E NEM ~~~~~~system.out.println(mae.formaDeFalar);~~~~
	 * PQ RECEBEU DE HERANÇA. NÃO PRECISOU ENTRAR NA CLASSE PARA PARA ACESSAR AS INFORMAÇÕES.
	 */

}
