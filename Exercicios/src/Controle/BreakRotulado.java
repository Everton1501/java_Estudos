package Controle;

public class BreakRotulado {
	
	public static void main(String[] args) {
		//Por ter sido ROTULADO o la�o EXTERNO � interrompido
		System.out.println("La�o externo � interrompido, por causa do rotulo");
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1) {
					break externo;
				}
				System.out.printf(" [%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
		
		
		//Aqui o la�o externo o for do i, n�o ser� afetado
		System.out.println("\n\nN�o interrompe o la�o externo");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1) {
					break ;
				}
				System.out.printf(" [%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
		
		
		
		
	}
}
