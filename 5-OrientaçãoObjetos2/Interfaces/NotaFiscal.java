package Interfaces;

public class NotaFiscal implements Imprimir, NfEnviadaPorEmail{

	private int numeroNFE;
	
	
	//Construtor
	public NotaFiscal(int numeroNFE){
		this.numeroNFE =  numeroNFE;
	}
	
	//Implementação ou sobrescrita do método imprimirAlgo da class pai Imprimir() -> Interface
	@Override
	public void imprimirAlgo() {
		System.out.println("NFE de número " + this.numeroNFE + " sendo impressa.");
		
	}
	
	//Implementação ou sobrescrita do método imprimirAlgo das class pai NfEnviadaPorEmail() -> Interface
	@Override
	public void sendEmail(String email) {
		System.out.println("Enviando NFE "+ this.numeroNFE +" para o e-mail: " + email);
		
	}
	
	//Método da class NotaFiscal(String produto)
	public void adicionarNFE(String produto){
		
		//Se o tipo do objeto for a interface este método não será acessível.
		//Para acessar tem que fazer o cast.
		System.out.println("Teste para adicionar a nota fiscal! Prod: " + produto);
	}
}
