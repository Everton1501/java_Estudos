package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Compras {
	
	
	List<Item> item = new ArrayList<Item>();
	
	void adcionarItem(Produto p, int qtde) {
		this.item.add(new Item(p, qtde));
	}
	
	void adcionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.item.add(new Item(produto, qtde));
	}
	
	void adcionarItemComDesconto(Produto p, int qtde, int desconto) {
		this.item.add(new Item(p, qtde, desconto));
	}
	
	void adcionarItemComDesconto(String nome, double preco, int qtde, int desconto) {
		var produto = new Produto(nome, preco);
		this.item.add(new Item(produto, qtde, desconto));
	}
	
	double valorTotal() {
		double total = 0;
		
		for(Item itens: item) {
			total += itens.quantidade * itens.produto.preco;
		}
		
		return total;
	}
	
	double valorTotalComDesconto() {
		double total = 0;
		
		for(Item itens: item) {
			total += itens.quantidade * (itens.produto.preco - itens.desconto);
		}
		
		return total;
	}

	
}
