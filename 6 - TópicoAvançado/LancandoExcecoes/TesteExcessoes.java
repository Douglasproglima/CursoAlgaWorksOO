package LancandoExcecoes;

public class TesteExcessoes {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100); //Passando o parametro por causa do contrutor
		
		try {
			cc.depositar(-10);
		} catch (Exception e) {
			System.out.println("Erro ao efetuar deposito - Erro: " + e.getMessage());
		}
		
	}

}
