package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		//System.out.println(segredo); --> NÃO RECEBE PQ É PRIVADO DA CLASSE ANA
		//System.out.println(facoDentroDeCasa); --> NÃO RECEBE PQ NÃO PERTENCE AO MESMO PACOTE DE
		//ANA
		//System.out.println(formaDeFalar); --> NÃO RECE PQ NÃO TEM HERANÇA
		System.out.println(sogra.todosSabem);
	}
	
	/*OBS: TEM QUE SER IMPORTADO PORQUE É DE UM PACOTE DIFERENTE.
	 *  TEM QUE CRIAR UMA INSTÂNCIA PQ COMO PAULO, NÃO FOI PASSADO UM HERANÇA. 
	 *  E POR NÃO TER SIDO PASSADO POR HERANÇA NÃO CONSEGUE ACESSAR O QUE ESTÁ PROTECTED
	 */
}
