package Interfaces;

public interface Imprimir {

		/*1 - A class interface todos os métodos não tem implementação apenas sua assinatura;
		 *2 - Todos os métodos por default são public abstract
		 *3 - Para que outra class possa relacionar coma interface ao invés de utilizar o extend usasse a palavra
		 *implements;
		 *4 - Não é possível utilizar o new para criar um objeto interface;
		 *5 - Uma class filha (NotaFiscal) pode implementar várias interfaces (Imprimir, NfEnviadaPorEmail etc...) 
		 * */
	
	public void imprimirAlgo();
	//ou public abstract void imprimirAlgo();
}
