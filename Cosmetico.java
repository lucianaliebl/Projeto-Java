package br.com.luciana.produtos;

public class Cosmetico extends Produtos {
	
//Atributos: características genéricas que todas as subclasse possuem e são registradas por meio das variáveis
	private int tamanho_embalagem;
	private String finalidade;
	private boolean fragrancia;
	
//Construtor: serve para inicializar as variáveis com os valores de variáveis inseridos na main
	public Cosmetico(String nomeProduto, double precoProduto, String descricaoProduto, int tamanho_embalagem,
			String finalidade, boolean fragrancia) {
		super(nomeProduto, precoProduto, descricaoProduto);
		this.tamanho_embalagem = tamanho_embalagem;
		this.finalidade = finalidade;
		this.fragrancia = fragrancia;
	}
	
//Getters and Setters: quando as variáveis estão privadas em uma classe e quer acessá-la por outra classe, deve-se criar os getters and setters para conseguir acessá-los. 
	public int getTamanho_embalagem() {
		return tamanho_embalagem;
	}

	public void setTamanho_embalagem(int tamanho_embalagem) {
		this.tamanho_embalagem = tamanho_embalagem;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public boolean getFragrancia() {
		return fragrancia;
	}

	public void setFragrancia(boolean fragrancia) {
		this.fragrancia = fragrancia;
	}
	
//Métodos: são as ações que o objeto realiza 
	public void hidratar() {
		System.out.println("Hidratando...");
	}
	
	public void perfumar() {
		System.out.println("Perfumando...");
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
		System.out.println("Esse produto possui: " + tamanho_embalagem);
		System.out.println(finalidade);
	}

	@Override
	public void desconto() {
		super.desconto();
	}
}
