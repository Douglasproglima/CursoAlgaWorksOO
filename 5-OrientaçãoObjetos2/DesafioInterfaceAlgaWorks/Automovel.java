package DesafioInterfaceAlgaWorks;

public class Automovel implements Seguravel{

	private double valorMercado;
	private int anoFabricacao;
	
	public Automovel(){
		
	}
	
	public Automovel(double valorMercado, int anoFabricacao){
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public String obterDescricao() {
		return "Automovel ano " + this.anoFabricacao + " com o valor de mercado R$ " + this.valorMercado;
	}
	
	@Override
	public double calcularValorApolice() {
		//Uso do operador ternário
		double valorApolice = this.anoFabricacao < 2000 ? this.valorMercado * 0.09 : this.valorMercado * 0.04;
		return valorApolice;
	}
}
