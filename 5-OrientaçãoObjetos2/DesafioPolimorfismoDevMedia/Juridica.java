package DesafioPolimorfismoDevMedia;

public class Juridica extends Pessoa{
	private String cnpj;
	
	public Juridica(){
		
	}
	
	public Juridica(String nome){
		super(nome);
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome(){
		return super.getNome();
	}
}
