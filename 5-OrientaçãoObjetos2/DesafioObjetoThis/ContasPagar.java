package DesafioObjetoThis;

import DesafioEnum.*;

public class ContasPagar {
	private String descricao;
	private String data;
	private Double valor;
	
	private SituacaoConta situacaoConta;
	private FornecedorBean fornecedor;
	
	//Construtor default;
	public ContasPagar(){
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	//Sobrecarga do construtor passando todos os atributos;
	public ContasPagar(FornecedorBean fornecedor, String descricao, String data, Double valor){
		this();
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}
	
	//Métodos gettes e setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public FornecedorBean getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(FornecedorBean fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public SituacaoConta getSituacaoConta(){
		return this.situacaoConta;
	}
	
	public void pagar(){
		if (this.getSituacaoConta().equals(SituacaoConta.PAGA)) {
			System.out.println("Não pode pagar uma conta que já foi paga: " + 
							   this.getDescricao() + ".");
		}else if(this.getSituacaoConta().equals(SituacaoConta.CANCELADA)){
			System.out.println("Não pode pagar uma conta que já foi cancelada: " +
							   this.getDescricao() + ".");
		}else{
			System.out.println("Fornecedor: " + fornecedor.getNome() + "\n"+
							   "Status....: " + this.getSituacaoConta() + "\n"+
							   "Conta.....: " + getDescricao() +  "\n"+
							   "Data Venc.: " + getData() + "\n"+
							   "Valor.....: " + getValor() + "\n");
			this.situacaoConta = SituacaoConta.PAGA;
		}		
	}
	
	public void cancelar(){
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi paga: " +
							   this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi cancelada: " +
							   this.getDescricao() + ".");
		} else {
			System.out.println("Cancelando conta " + this.getDescricao() + ".");
			
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}
}