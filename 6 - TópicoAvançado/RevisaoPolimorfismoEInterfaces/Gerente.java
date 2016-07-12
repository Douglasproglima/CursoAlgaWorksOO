package RevisaoPolimorfismoEInterfaces;

public class Gerente extends Funcionario implements Autenticavel{
	public double getBonus(){
		return this.salario * 0.25;
	}
	
	public void cobraEntrega(){
		System.out.println("Está pronto?");
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
