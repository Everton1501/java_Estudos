package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 10, 100);
		compra1.adicionarItem(new Produto("Caderno", 18.5), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("borracha", 1.5, 2);
		compra2.adicionarItem("Notebook", 2000, 1);
		
		Cliente cliente1 = new Cliente("Ana Luzia");
		cliente1.adcionarCompra(compra1);
		cliente1.adcionarCompra(compra2);
		
		
		System.out.println(cliente1.nome + " fez compras no valor de "
				+ cliente1.obterValorTotalDaCompra());
		
	}

}
