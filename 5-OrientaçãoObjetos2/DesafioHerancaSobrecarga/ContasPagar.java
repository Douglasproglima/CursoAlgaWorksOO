package DesafioHerancaSobrecarga;

import DesafioEnum.SituacaoConta;

public class ContasPagar extends Conta{

	private FornecedorBean fornecedor;
	
	public ContasPagar(){
		
	}
	
	//Sobrecarga do construtor passando todos os atributos;
	public ContasPagar(FornecedorBean fornecedor, String descricao, String dataVencimento, Double valor){
		this();
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setDataVencimento(dataVencimento);
		this.setValor(valor);
	}
	
	public FornecedorBean getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(FornecedorBean fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void pagar(){
		if (this.getSituacaoConta().equals(SituacaoConta.PAGA)) {
			System.out.println("Não pode pagar uma conta que já foi paga: " + 
							   this.getDescricao() + ".");
		}else if(this.getSituacaoConta().equals(SituacaoConta.CANCELADA)){
			System.out.println("Não pode pagar uma conta que já foi cancelada: " +
							   this.getDescricao() + ".");
		}else{
			this.situacaoConta = SituacaoConta.PAGA;
			System.out.println("Fornecedor: " + fornecedor.getNome() + "\n"+
							   "Status....: " + this.getSituacaoConta() + "\n"+
							   "Conta.....: " + getDescricao() +  "\n"+
							   "Data Venc.: " + getDataVencimento() + "\n"+
							   "Valor.....: " + getValor() + "\n");
		}		
	}	
}