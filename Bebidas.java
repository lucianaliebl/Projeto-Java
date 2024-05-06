package br.com.luciana.produtos;

import br.com.luciana.produtos.Produtos;

public class Bebidas extends Produtos {
//atributos
	private int tamanho;
	private String sabor;
	private boolean alcoolico;
//constructor
	public Bebidas(String nome_produto, int preco, String descricao, int tamanho, String sabor, boolean alcoolico) {
		super(nome_produto, preco, descricao);
		this.tamanho = tamanho;
		this.sabor = sabor;
		this.alcoolico = alcoolico;
	}
	public void acalmar() {
		System.out.println("Essa bebida está me acalmando");
	}
	public void matarSede() {
		System.out.println("Essa bebida está matando minha sede");
	}
	public void energizar() {
		System.out.println("Essa bebida está me energizando");
	}
	public void alcoolizar() {//if else quando tiver boolean, além de adc como atrubuto, adc como method tb
		if (alcoolico == true) {
		System.out.println("Este produto possui teor alcoólico");
	} else {
		System.out.println("Este produto não possui teor alcoólico");
		}
	}
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println(tamanho);
		System.out.println(sabor);
		System.out.println("Produto " +alcoolico);
	}
	@Override
	public void desconto() {
		super.desconto();
	}
	
}
