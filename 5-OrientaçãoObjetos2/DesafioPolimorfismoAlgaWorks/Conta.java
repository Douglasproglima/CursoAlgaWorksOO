package DesafioPolimorfismoAlgaWorks;

import DesafioEnum.SituacaoConta;

public abstract class Conta {
	private String descricao;
	private String dataVencimento;
	private Double valor;
	
	protected SituacaoConta situacaoConta;

	//Construtor default;
	public Conta(){
		this.situacaoConta = SituacaoConta.PENDENTE;
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
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public SituacaoConta getSituacaoConta(){
		return this.situacaoConta;
	}
	
	//Método abstrato, mesmo método da class RelatorioContas() mas sem implementação;
	//Criando esse método, será obrigatório implementar o mesmo nas classFilhas.
	public abstract void exibirListagem();
	
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