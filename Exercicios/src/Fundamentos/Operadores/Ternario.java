package Fundamentos.Operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.0 ;
		String mediaParcial = media >= 5 ? "em recupera��o." : "reprovado.";
		String mediaFinal = media >= 7 ? "aprovado." : mediaParcial;
		
		boolean temBomComportamento = true;
		boolean passouPorMedia = media >= 7;
		boolean temDesconto = temBomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "N�o";
		
		
		System.out.println("O aluno est� " + mediaFinal);
		System.out.println("Tem desconto ? "+ resultado);
		
		
	}
}
