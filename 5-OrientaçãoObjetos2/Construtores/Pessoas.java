package Construtores;

public class Pessoas {
	String nome;
	int idade;
	
	Pessoas(){
		
	}
	
	Pessoas(String nome){
		this.nome = nome;
	}
	
	Pessoas(int idade){
		this.idade = idade;
	}
	
	Pessoas(String nome, int idade){
		this(nome);
		this.idade = idade;
	}
}
