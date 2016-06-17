package Heranca;

public class ProgramaHeranca {
	public static void main(String[] args){
		Jogador j1 = new Jogador();
		j1.setNome("Douglas");
		j1.setIdade(28);
		j1.ativoNaArea();
		
		j1.imprimir();
		
		Pessoa p1 =  new Pessoa();
		p1.setNome("Lucas");
		p1.setIdade(18);
		p1.imprimir();
	}
}
