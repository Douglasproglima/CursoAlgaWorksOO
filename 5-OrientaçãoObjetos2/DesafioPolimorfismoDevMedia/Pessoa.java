package DesafioPolimorfismoDevMedia;

public class Pessoa {
	protected String nome;
	
	protected Pessoa(){
		
	}
	
	protected Pessoa(String nome){
		if(this.nome != null){
			this.nome = nome;
		}else{
			this.nome = "Não Informado";
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
