package DesafioPolimorfismoAlgaWorks;

public class RelatorioContas {

	public void exibirListagemContas(Conta[] contas){
		System.out.println("Relatório de Contas a Pagar é/ou Receber");
		System.out.println("___________________________________________________\n");
		
		double valor = 0;
		for(int i = 0; i < contas.length; i++){
			contas[i].exibirListagem();
			valor += contas[i].getValor();
		}
		
		System.out.println("Total Geral....: R$"+valor);
	}
}
