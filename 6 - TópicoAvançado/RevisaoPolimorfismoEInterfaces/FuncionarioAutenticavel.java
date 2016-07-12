package RevisaoPolimorfismoEInterfaces;

public abstract class FuncionarioAutenticavel extends Funcionario{
	private int senha;
	
	public boolean autentica(int senha) {
		return this.senha == senha;
	} 	
	
	//Após a implementação do contrato do cliente (Interface Autentica) não é necessário mais essa class
}
