package DesafioInterfaceAlgaWorks;

public class Barco implements Seguravel{

	private double valorMercado;
	private int anoFabricao;
	
	public Barco(){
		
	}
	
	public Barco(double valorMercado, int anoFabricacao){
		this.valorMercado = valorMercado;
		this.anoFabricao = anoFabricacao;
	}

	@Override
	public String obterDescricao() {
		return "O barco de ano " + this.anoFabricao  + " tem o valor atual de mercado R$" + this.valorMercado;
	}	
	
	@Override
	public double calcularValorApolice() {
		double valorApolice = this.anoFabricao > 2012 ? this.valorMercado * 0.15 : this.valorMercado * 0.06;
		return valorApolice;
	}
}
