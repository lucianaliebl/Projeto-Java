package Main;

import br.com.luciana.produtos.Bebidas;
import br.com.luciana.produtos.Cosmetico;
import br.com.luciana.produtos.Frutas;

public class Main {

	public static void main(String[] args) {
		
		Bebidas CocaCola = new Bebidas("Coca-Cola",2.49,"zero açúcar",250,"normal",false,"ml");
		Cosmetico HidratanteDove = new Cosmetico("Hidratante Dove",14.99,"Hidratante facial 100% natural",400,"deixar sua face mais leve e limpa",false);
		Frutas Banana = new Frutas("Banana",4.99,"Banana nanica",4,true);
		
		
		CocaCola.acalmar();
		CocaCola.exibirInformacoes();
		CocaCola.desconto();
		
		HidratanteDove.possuirFrangrancia();
		HidratanteDove.exibirInformacoes();
		HidratanteDove.hidratar();
		
		Banana.exibirInformacoes();
		Banana.FazerSuco();
		Banana.FrutaCortada();
		
	}

}
