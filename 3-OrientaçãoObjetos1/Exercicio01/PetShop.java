package Exercicio01;

public class PetShop {
	public static void main(String[] args){
		Cachorro varCachorro = new Cachorro();
		varCachorro.nome = "Nina";
		varCachorro.raca = "Vira Lata";
		varCachorro.sexo = 'M';
		varCachorro.idade = 8;
		
		System.out.println("Nome.: " + varCachorro.nome  + "\n" +
						   "Raça.: " + varCachorro.raca  + "\n" +
						   "Sexo.: " + varCachorro.sexo  + "\n" +
						   "Idade: " + varCachorro.idade + "\n");		
	}
}
