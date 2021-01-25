package Controle;

public class BreakRotulado {
	
	public static void main(String[] args) {
		//Por ter sido ROTULADO o laço EXTERNO é interrompido
		System.out.println("Laço externo é interrompido, por causa do rotulo");
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
		
		
		//Aqui o laço externo o for do i, não será afetado
		System.out.println("\n\nNão interrompe o laço externo");
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
