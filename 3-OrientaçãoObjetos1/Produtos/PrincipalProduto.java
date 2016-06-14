package Produtos;

public class PrincipalProduto {

	public static void main(String[] args) {
		Preco preco = new Preco();
		preco.valorCusto = 140;
		
		Produto prod = new Produto();
		prod.definirPreco2(preco, 20, 15);
		
		System.out.println("Valor Custo..: " + preco.valorCusto);
		System.out.println("Valor Imposto: " + preco.valorImposto);
		System.out.println("Valor Lucro..: " + preco.valorLucro);
		System.out.println("Valor Venda..: " + preco.precoVenda);
	}

}
