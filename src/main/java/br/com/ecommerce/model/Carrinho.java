package br.com.ecommerce.model;

import java.util.List;

public class Carrinho {
	private List<Produto> carrinho;

	public List<Produto> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(List<Produto> carrinho) {
		this.carrinho = carrinho;
	}

}
