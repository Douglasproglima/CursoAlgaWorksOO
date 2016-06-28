package DesafioInterfaceAlgaWorks;

public class CorretoraSeguros {

	public void propostaSeguro(Seguravel objetoInterfaceSeguravel){
		System.out.println("_____________________________________________________");
		System.out.println("Proposta Comercial - Seguradora Sem Garantia Nenhuma");
		System.out.println("_____________________________________________________");
		System.out.println("");
		System.out.println(objetoInterfaceSeguravel.obterDescricao());
		System.out.println("Valor da Apólice R$" + objetoInterfaceSeguravel.calcularValorApolice());
		System.out.println("");
		System.out.println("_____________________________________________________");
		
	}
}
