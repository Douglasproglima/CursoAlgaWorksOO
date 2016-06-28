package DesafioInterfaceAlgaWorks;

public class Imovel implements Seguravel{

	private double valorMercado;
	private int areaConstruida;
	
	public Imovel() {
	
	}
	
	public Imovel(double valorMercado, int areaConstruida){
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}
	
	@Override
	public String obterDescricao() {
		return "Imóvel com área construída de " + this.areaConstruida + 
			   " m2 e valor atual de mercado R$ " + this.valorMercado;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.05);
		return valorApolice;
	}
}
