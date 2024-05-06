package br.com.rafaela.produto;

import br.com.luciana.produtos.Produtos;

public class Cosmetico extends Produtos {
	private int tamanho_embalagem;
	private String finalidade;
	private boolean fragrancia;
//constructor
	public Cosmetico(String nomeProduto, double precoProduto, String descricaoProduto, int tamanho_embalagem,
			String finalidade, boolean fragrancia) {
		super(nomeProduto, precoProduto, descricaoProduto);
		this.tamanho_embalagem = tamanho_embalagem;
		this.finalidade = finalidade;
		this.fragrancia = fragrancia;
	}
//methods
	public void hidratar() {
		System.out.println("Hidratando "+finalidade);
	}
	
	public void perfumar() {
		System.out.println("Perfumando "+finalidade);
	}
	public void possuirFrangrancia() {
		if (fragrancia == true) {
			System.out.println("Este produto possui fragrância");
		} else {
			System.out.println("Este produto não possui fragrância");
		}
	}
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Esse produto possui: " +tamanho_embalagem);
		System.out.println("Ajuda na hidratação do seu: " + finalidade);
	}
	@Override
	public void desconto() {
		super.desconto();
	}
}
