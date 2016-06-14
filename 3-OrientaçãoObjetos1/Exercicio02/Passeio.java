package Exercicio02;

public class Passeio {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Douglas Lima";
		
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Nina";
		cachorro.raca = "Virada Lata";
		cachorro.idade = 2;
		cachorro.sexo = 'F';
		
		pessoa.cachorro = cachorro;
		
		Caminhada caminhada = new Caminhada();
		caminhada.andar(pessoa);
		
	}

}
