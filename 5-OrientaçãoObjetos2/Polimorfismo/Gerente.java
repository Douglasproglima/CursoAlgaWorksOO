package Polimorfismo;

public class Gerente extends Funcionario{
	protected int senha;
	private int qtdeFuncionariosGerenciados;
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getQtdeFuncionariosGerenciados() {
		return qtdeFuncionariosGerenciados;
	}
	public void setQtdeFuncionariosGerenciados(int qtdeFuncionariosGerenciados) {
		this.qtdeFuncionariosGerenciados = qtdeFuncionariosGerenciados;
	}
	
	public boolean autenticar(int senha){
		if(this.getSenha() == senha){
			System.out.println("Acesso permitido!");
			return true;
		}else{
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
	//Anotação @Override deixa explicito que este método é 
	//reescrita de um método da sua superClasse ou classe pai (Funcionario);
	@Override
	public double getBonificacao(){
		//return super.getBonificacao() * 1.5;
		return super.getBonificacao() + 1000;
	}
}
