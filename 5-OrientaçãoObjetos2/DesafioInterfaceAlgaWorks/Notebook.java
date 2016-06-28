package DesafioInterfaceAlgaWorks;

public class Notebook implements Seguravel{
	private double valorMercado;
	private int ano;
	private String modelo;
	
	public Notebook(double valorMercado, int ano, String modelo){
		this.valorMercado = valorMercado;
		this.ano = ano;
		this.modelo = modelo;
	}

	@Override
	public String obterDescricao() {
		
		return "Notebook modelo " + this.modelo + "/" + this.ano + " valor de mercado R$" + this.valorMercado;
	}	
	
	@Override
	public double calcularValorApolice() {
		double valorApolice = 0;
		
		if(this.ano == 2016){
			valorApolice = this.valorMercado * 0.16;
		}else if(this.ano == 2015){
			valorApolice = this.valorMercado * 0.15;
		}else if(this.ano == 2014){
			valorApolice = this.valorMercado * 0.14;
		}else if(this.ano == 2013){
			valorApolice = this.valorMercado * 0.13;
		}else if(this.ano == 2012){
			valorApolice = this.valorMercado * 0.12;
		}else{
			valorApolice = this.valorMercado * 0.08;
		}
		
		return valorApolice;
	}

}
