package SobrecargaMetodos;

public class ProgramaSobrecarga {
	public static void main(String[] args){
		Pessoa p1 = new Pessoa("Douglas Lima", 28);
		
		CadastroPessoa cadPessoa1 =  new CadastroPessoa();
		cadPessoa1.cadastrar(p1);
		
		cadPessoa1.cadastrar("Lucas",  25);
	}
}
