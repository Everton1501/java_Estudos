package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Maria Luiza";
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Caderno", 2, 22.5));
		compra1.itens.add(new Item("Borracha", 5, 2.55));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}

}
 