package Produtos;

public class Produto {
	void definirPreco(double precoCusto){
		precoCusto = precoCusto * 1.20; //Add 20% ao preço de custo
	}
	
	void definirPreco2(Preco preco, double percentualDesc, double margemLucro){
		preco.valorImposto = preco.valorCusto * (percentualDesc / 100);
		
		preco.valorLucro = preco.valorCusto * (margemLucro / 100);
		
		preco.precoVenda = preco.valorCusto + preco.valorImposto + preco.valorLucro;
	}
}
