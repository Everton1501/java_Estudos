package oo.heranca;

public class Jogador {
	
	public int life = 100;
	public int x;
	public int y;
	
	public boolean atacarJogador(Jogador oponente){
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.life -= 10;
			return true;
		}else if(deltaY == 0 && deltaX ==1) {
			oponente.life -= 10;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean andar(Direcao direcao) {
		if(direcao == Direcao.Norte && y >= 0) {
			y--;
			return true;
		}else if ( direcao == Direcao.Leste && x >= 0) {
			x++;
			return true;
		}else if(direcao == Direcao.Sul && y >= 0) {
			y++;
			return true;
		}else if(direcao == Direcao.Oeste && x >=0) {
			x--;
			return true;
		} else {
			return false;
		}
		
	}
}