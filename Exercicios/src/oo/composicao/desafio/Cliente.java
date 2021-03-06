package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	List<Compra> compras = new ArrayList<>();
	
	void adcionarCompra (Compra compra) {
		this.compras.add(compra);
	}
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	double obterValorTotalDaCompra() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.valorTotal();
		}
		
		return total;
	}
	
	
}
