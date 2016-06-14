package TesteDouglasEstoque;

public class Material {
	int codMat;
	Unidade unidadeMat;
	String tag;
	String descricao;
	boolean ativo;
	double valorCompra;
	double valorVenda;
	
	boolean verificarVlrCompraXVlrVenda(){
		if(this.valorCompra > this.valorVenda){
			System.out.println("O valor de venda não pode ser menor que o valor de compra!");
			return false;
		}else{
			return true;
		}
	}
	
	void listar(){
		if (verificarVlrCompraXVlrVenda()) {
			String ativoString = this.ativo == true ? "Sim" : "Não";
			System.out.println("Código....: " + codMat + "\n" +
							   "Tag.......: " + tag.toUpperCase() + "\n" +
							   "Material..: " + descricao.toUpperCase() + "\n" +
							   "Unidade...: " + unidadeMat.tag.toUpperCase() + "\n" +
							   "Ativo.....: " + ativoString + "\n" +
							   "Vlr Compra: " + valorCompra + "\n" +
							   "Vlr Venda.: " + valorVenda);
		}
	}
}
