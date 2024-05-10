package br.com.luciana.produtos;

public class Frutas extends Produtos{
	
	//Atributos: características da classe Frutas
	
	private double Quantidade;
	private boolean Cortada;
	
	//Construtor: serve para inicializar as variáveis com os valores de variáveis inseridos na main
	
	public Frutas(String nomeProduto, double precoProduto, String descricaoProduto, double quantidade, boolean cortada) {
		super(nomeProduto, precoProduto, descricaoProduto);
		this.Quantidade = quantidade;
		this.Cortada = cortada;
	}

	//Getters and Setters: quando as variáveis estão privadas em uma classe e quer acessá-la por outra classe, deve-se criar os getters and setters para conseguir acessá-los. 
	
	public double getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.Quantidade = quantidade;
	}

	public boolean getCortada() {
		return Cortada;
	}

	public void setCortada(boolean cortada) {
		this.Cortada = cortada;
	}
	
	//Métodos: são as ações que o objeto realiza 
	
	public void FazerSuco() {
		System.out.println("Fazendo suco de " + getNomeProduto());
	}
	
	public void FrutaCortada() {
		if (Cortada) {
		    System.out.println("A fruta será cortada");
	    } else {
	    	System.out.println("Fruta inteira");
	    }
	}

	public void FrutaDescascada() {
		System.out.println("Descascando fruta...");
	}

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Fruta em promoção!");	
	}
}
