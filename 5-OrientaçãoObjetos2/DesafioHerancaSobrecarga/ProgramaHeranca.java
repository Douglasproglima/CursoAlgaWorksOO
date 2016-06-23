package DesafioHerancaSobrecarga;

public class ProgramaHeranca {
	public static void main(String[] args) {
		FornecedorBean forn1 = new FornecedorBean();
		forn1.setNome("Casa Pronta");
		
		ContasPagar cp1 = new ContasPagar(forn1, "Pagamento Casa Pronta", "14/06/2016", 1500.15);
		cp1.pagar();
		
		Cliente cli1 =  new Cliente();
		cli1.setNome("Casa Rena");
		
		ContaReceber cr1 = new ContaReceber(cli1, "Recebimento", "18/06/2016", 500.59);
		cr1.receber();
	}
}