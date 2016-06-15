package JavaBean;

public class ProgramaPessoaBean {
	public static void main(String[] args){
		PessoaBean p1 = new PessoaBean();
		String nome = "douglas lima de faria lima da silva carvalho";
		p1.setNome(nome);
		p1.setIdade(28);
		
		System.out.println(p1.getNome() + " - "+ p1.getIdade() +"\n");
		
	}
}
