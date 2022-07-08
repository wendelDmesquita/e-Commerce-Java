package br.com.ecommerce.service;

import br.com.ecommerce.model.Produto;

public class ProdutoService {

	public Produto criarProduto(String nomeProduto, Double preco, String descricao, Long qtdEstoque) {
		Produto p = new Produto();
		p.setNomeProduto(nomeProduto);
		p.setPreco(preco);
		p.setDescricao(descricao);
		p.setQtdEstoque(qtdEstoque);

		return p;
	}
	
	public void venderProduto(Produto p, Long quantidade) {
		p.setQtdEstoque(quantidade);
	}
	
	public Long exibirEstoque(Produto p) {
		return p.getQtdEstoque();
	}
	
}
