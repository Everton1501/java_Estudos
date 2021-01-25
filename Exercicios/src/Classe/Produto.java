package Classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	
	
	
	
	//CONSTRUTOR IMPLICITO, N�O NECESSITA DE PAR�METRO
	Produto (){
		
	}

	//CONSTRUTOR EXPLICITO, TEM QUE ESCREVER NO PAR�METRO A INFORMA��O
	Produto (String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	/*OBS 1: O NOME DO METODO � O MESMO, O QUE ALTERA � A QUANTIDADE DE PARAMETROS
	 * O DE CIMA TEM 2 PARAMETROS, JA CONTIDOS NO PROGRAMA. O DE BAIXO O ULTIMO ESTA 
	 * DESCRITO NO PARAMETRO DO METODO
	 * OBS 2: PARA DETERMINAR UM FLOAT PRECISA CRIAR UM CAST (float)
	 */
	
	double precoComDesconto(double descontoDoGerente) {
		return  preco * (1 - desconto + descontoDoGerente);
	}
	//float precoComDesconto(double descontoDoGerente) {
	//	return (float) (preco * (1 - desconto + descontoDoGerente));
	



}

