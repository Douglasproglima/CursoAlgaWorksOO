package DesafioPolimorfismoAlgaWorks;

public class ProgramaPolimorfismo {
	public static void main(String[] args) {
		//Instanciando fornecedores
		FornecedorBean imobiliaria = new FornecedorBean();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		FornecedorBean mercado = new FornecedorBean();
		mercado.setNome("Supermercado Casa Rena");
		
		//Instanciando clientes
		Cliente cliente1 =  new Cliente();
		cliente1.setNome("João da Silva");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Aline da Costa");
		
		//Instanciando contas a pagar
		ContasPagar contasPagar1 = new ContasPagar();
		contasPagar1.setFornecedor(imobiliaria);
		contasPagar1.setDescricao("Aluguel do comércio");
		contasPagar1.setDataVencimento("23/06/2016");
		contasPagar1.setValor(1500.0);
			//contasPagar1.pagar();
		
			//Instanciando conta através da sobrecarga do construtor
		ContasPagar contasPagar2 = new ContasPagar(mercado, "Compras do mês", "14/06/2016", 650.15);
			//contasPagar2.pagar();
		
		//Instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setCliente(cliente1);
		contaReceber1.setDescricao("Recimento desenvolvimento sistema JSF");
		contaReceber1.setDataVencimento("23/06/2016");
		contaReceber1.setValor(2500.0);
		ContaReceber contaReceber2 = new ContaReceber(cliente2, "Recebimento desenvolvimento site", "18/06/2016", 500.59);
			//cr2.receber();
		
		//Exibe listagem de todas as contas com detalhamento
		RelatorioContas relatorio = new RelatorioContas();
		Conta[] contas = new Conta[]{contasPagar1,contasPagar2, contaReceber1,contaReceber2};
		
		relatorio.exibirListagemContas(contas);
	}
}