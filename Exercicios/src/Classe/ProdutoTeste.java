package Classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Notebook", 4550.99);
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.50;
		
		
		double precoFinal1 = p1.precoComDesconto();// primeiro 
		double precoFinal2 = p2.precoComDesconto(0.2);//nesse caso vai ser o segundo metodo
		//como o descontoDoGerente n�o tem determina��o de valor, o valor � descrito entre ()
		
		System.out.println("Produto: "+ p1.nome);
		System.out.println("Valor: "+ p1.preco);
		System.out.println("Desconto: "+ Produto.desconto);
		System.out.println("Total: "+ precoFinal1);
		System.out.println();
		System.out.println("Produto: "+ p2.nome);
		System.out.println("Valor: "+ p2.preco);
		System.out.println("Desconto: "+ Produto.desconto);
		System.out.println("Total: "+ precoFinal2);
		
		Produto p3 = new Produto();
		p3.nome ="Notebook";
		p3.preco = 4550.99;
		Produto.desconto = 0.3; //s� n alterou nos demais pq est�o impressos antes da 
		//altera��o
		double precoFinal3 = p3.precoComDesconto();// primeiro 
		
		System.out.println("\nPromo��o dos dias das M�es");
		System.out.println("Produto: "+ p1.nome);
		System.out.println("Valor: "+ p1.preco);
		System.out.println("Desconto: "+ Produto.desconto);
		System.out.println("Total: "+ precoFinal3);
		
		
		
			
		
		
	}

}
