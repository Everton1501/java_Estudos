package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	List<Compras> compras = new ArrayList<Compras>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compras compras) {
		this.compras.add(compras);
	}
	
	void adicionarCompraComDesconto(Compras compras) {
		this.compras.add(compras);
	}
	
	double ObterValorTotal() {
		double total = 0;
		
		for(Compras compra: compras) {
			total += compra.valorTotal();
		}
		
		return total;
	}
	
	double ObterValorTotalComDesconto() {
		double total = 0;
		
		for(Compras compra: compras)
			total += compra.valorTotalComDesconto();
		
		return total;
	}
}
