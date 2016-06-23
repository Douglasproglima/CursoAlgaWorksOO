package DesafioObjetoThis;

import DesafioEnum.SituacaoConta;

public class ProgramaDesafio07 {
	public static void main(String[] args) {
		FornecedorBean forn1 = new FornecedorBean();
		forn1.setNome("Casa Pronta");
		
		ContasPagar cp1 = new ContasPagar(forn1, "Pagamento Casa Pronta", "14/06/2016", 1500.15);
		cp1.pagar();
		cp1.pagar();
		
		FornecedorBean forn2 = new FornecedorBean();
		forn2.setNome("Viação São Judas");
		
		ContasPagar cp2 =  new ContasPagar();
		cp2.setFornecedor(forn2);
		cp2.setDescricao("Pagamento Viação");
		cp2.setData("14/06/2016");
		cp2.setValor(989.665);
		
		//cp2.cancelar();
		cp2.pagar();
		cp2.pagar();
	}
}
