package Fundamentos.Operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.0 ;
		String mediaParcial = media >= 5 ? "em recuperação." : "reprovado.";
		String mediaFinal = media >= 7 ? "aprovado." : mediaParcial;
		
		boolean temBomComportamento = true;
		boolean passouPorMedia = media >= 7;
		boolean temDesconto = temBomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Não";
		
		
		System.out.println("O aluno está " + mediaFinal);
		System.out.println("Tem desconto ? "+ resultado);
		
		
	}
}
