package br.com.luciana.produtos;

public class Produtos {
	
	//Atributos: características genéricas que todas as subclasse possuem e são registradas por meio das variáveis
	private String nomeProduto;
	private double precoProduto;
	private String descricaoProduto;
	private boolean descontoProduto;
	
	//Construtor: serve para inicializar as variáveis com os valores de variáveis inseridos na main
	public Produtos(String nomeProduto, double precoProduto, String descricaoProduto) {
		this.nomeProduto = nomeProduto;           //this: faz referência às variáveis desta classe
		this.precoProduto = precoProduto;
		this.descricaoProduto = descricaoProduto;
	}

	//Getters and Setters: quando as variáveis estão privadas em uma classe e quer acessá-la por outra classe, deve-se criar os getters and setters para conseguir acessá-los. 
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	
	//Métodos: são as ações que o objeto realiza 
	public void exibirInformacoes() {
		System.out.println("Produto: " + nomeProduto);
		System.out.println("Preço: " + precoProduto + " R$");
		System.out.println("Descrição: " + descricaoProduto);
	}
	
	public void desconto() {
		if (descontoProduto) {
		    System.out.println("O produto está com desconto de 10%");
	    } else {
	    	System.out.println("O produto não está em promoção");
	    }
    }
	
}
