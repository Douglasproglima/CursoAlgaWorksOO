package DesafioPolimorfismoDevMedia;

public class Fisica extends Pessoa{
	private String cpf;
	
	public Fisica(){
		super();
	}
	
	public Fisica(String nome){
		super(nome);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome(){
		return super.getNome();
	}
}