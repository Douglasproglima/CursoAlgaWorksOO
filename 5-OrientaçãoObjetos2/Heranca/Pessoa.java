package Heranca;

public class Pessoa{
	//Modificado protected: estará disponivel para quem está no mesmo pacote da class
	//ou herdando desta class, se herda a class poderá estar em outro pacote;
	
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimir(){
		System.out.println("Nome: " + this.getNome() + " - Idade: " + this.getIdade());
	}
}
