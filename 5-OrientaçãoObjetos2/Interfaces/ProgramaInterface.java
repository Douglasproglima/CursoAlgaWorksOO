package Interfaces;

public class ProgramaInterface {
	public static void main(String[] args){
		Imprimir i1 = new NotaFiscal(2612);
		i1.imprimirAlgo();
		
		//Cast para acessar o método adicionarNFE()
		NotaFiscal nfe1 = (NotaFiscal) i1;
		nfe1.adicionarNFE("Material 001");
		nfe1.imprimirAlgo();
		
		NfEnviadaPorEmail nfeEmail1 = (NfEnviadaPorEmail) i1;
		nfeEmail1.sendEmail("dflima@gmail.com");
		
		//Os métodos da class filha NotaFiscal não são acessível quado o tipo do objeto é uma Interface.
		//Para acessar os métodos da class filha é necessário passa o tipo do objeto sendo uma NotaFiscal e
		//em seguida fazer o cast da interface
		
		NotaFiscal nfe2 = (NotaFiscal) nfeEmail1;
		nfe2.adicionarNFE("Material 002");
	}
}
