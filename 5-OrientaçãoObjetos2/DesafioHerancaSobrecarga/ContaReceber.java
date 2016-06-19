package DesafioHerancaSobrecarga;

import DesafioEnum.SituacaoConta;

public class ContaReceber extends Conta{
	private Cliente cliente;
	
	//Construtor default ->Necessário sua declaração para utilizar a herança de métodos e construtores (Super());
	public ContaReceber(){
		
	}
	
	public ContaReceber(Cliente cliente, String descricao, String dataVencimento, Double valor){
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setDataVencimento(dataVencimento);
		this.setValor(valor);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void cancelar(){
		if (this.getValor() > 50000d ) {
			System.out.println("Não pode cancelar uma recebimento que já foi cancelada: " +
							   this.getDescricao() + " ou o valor ultrapasse R$50.000,00.");
		} else {
			super.cancelar();
		}
	}
	
	public void receber(){
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que já está paga: " 
				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que está cancelada: " 
				+ this.getDescricao() + ".");
		} else {
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do cliente " + this.getCliente().getNome() + ".");
				
			//Altera situação da conta de PENDENTE para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}	
	}
}
