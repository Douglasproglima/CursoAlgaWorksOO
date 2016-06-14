package TesteDouglasEstoque;

public class Estoque {
	int codEst;
	Material codMat;
	Unidade codUni;
	double saldo;
	double qtdeMax;
	double qtdeMin;
	double valorTotal;
	
	double saida (Material material, double qtde){
		System.out.println("Saída de material de " + qtde +"\n");
		return this.saldo -= qtde;
	}
	
	double entrada (Material material, double qtde){
		System.out.println("Saída de material de " + qtde +"\n");
		return this.saldo += qtde;
	}
	
	double atualizaValorTotal(Material material, double qtde, double valor){
		return this.valorTotal = qtde * valor;
	}
	
	void listar(){
		String matEstoque = codMat.tag +" - "+ codMat.descricao.toUpperCase();
		String unidMatEst = codUni.tag.toUpperCase();
		
		System.out.println("Código.....: " + codEst + "\n"+
						   "Material...: " + matEstoque + "\n"+
						   "Unidade....: " + unidMatEst + "\n"+
						   "Saldo......: " + saldo + "\n"+
						   "Valor Total: " + valorTotal + "\n");
	}
}
