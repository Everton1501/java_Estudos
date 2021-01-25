package oo.heranca;

public class Heroi extends Jogador {

 /*O (extends) que � uma palavra reservarda � a determina��o da Heran�a de um determinada classe.
* que no caso � o (Jogador) devido isso pode ser usado no metodo main trocando o pr�prio construtor
* no caso de: 
* Jogador j1 = new Jogador();
* Heroi j1 = new Heroi();
* os dois servem e podem ser usados, que ir�o possuir as mesmas funcionalidades. 
*/
	
	
	// NESSE EXEMPLO COPIANDO DO M�TODO PAI, CONSEGUE ALTERAR O VALOR DE  CADA ATAQUE
		public boolean atacarJogador(Jogador oponente){
			
			int deltaX = Math.abs(x - oponente.x);
			int deltaY = Math.abs(y - oponente.y);
			
			if(deltaX == 0 && deltaY == 1) {
				oponente.life -= 20;
				return true;
			}else if(deltaY == 0 && deltaX ==1) {
				oponente.life -= 20;
				return true;
			}else {
				return false;
			}
		}
		
	// UMA OUTRA FORMA � CHAMANDO O METODO PAI, PELO SUPER.
		
		//boolean atacarJogador(Jogador oponente) {
		//	boolean ataque1 = super.atacarJogador(oponente);
		//	boolean ataque2 = super.atacarJogador(oponente);
		//	return ataque1 || ataque2;
		//}
		
}