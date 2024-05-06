package br.com.luciana.produtos;

public class Bebidas extends Produtos {
	
//Atributos: características genéricas que todas as subclasse possuem e são registradas por meio das variáveis
	private int tamanho;
	private String sabor;
	private boolean alcoolico;
	
//Construtor: serve para inicializar as variáveis com os valores de variáveis inseridos na main
	public Bebidas(String nomeProduto, double precoProduto, String descricaoProduto, int tamanho, String sabor,boolean alcoolico) {
	super(nomeProduto, precoProduto, descricaoProduto);
	this.tamanho = tamanho;
	this.sabor = sabor;
	this.alcoolico = alcoolico;
	}

//Getters and Setters: quando as variáveis estão privadas em uma classe e quer acessá-la por outra classe, deve-se criar os getters and setters para conseguir acessá-los. 
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isAlcoolico() {
		return alcoolico;
	}

	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}

//Métodos: são as ações que o objeto realiza 
	public void acalmar() {
		System.out.println("Essa bebida está me acalmando");
	}
	public void matarSede() {
		System.out.println("Essa bebida está matando minha sede");
	}
	public void energizar() {
		System.out.println("Essa bebida está me energizando");
	}
	public void alcoolizar() {
		if (alcoolico == true) {
		System.out.println("Este produto possui teor alcoólico");
	} else {
		System.out.println("Este produto não possui teor alcoólico");
		}
	}

	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println(tamanho);
		System.out.println(sabor);
		System.out.println("Produto " +alcoolico);
	}
	
	public void desconto() {
		super.desconto();
	}
}
