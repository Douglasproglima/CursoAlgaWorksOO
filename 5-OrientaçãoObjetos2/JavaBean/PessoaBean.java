package JavaBean;

public class PessoaBean {
	/*Regras para criar uma class JavaBean
	 * 1 - Os atributos devem ter o modificador de acesso Private;
	 * 2 - Criar os métodos setters (void Pegar) e getters (definir o tipo Retornar) 
	 * 	   para todos os atributos;
	 * 3 - É necessário ter um construtor() sem argumentos;
	 * */
	
	private String nome;
	private int idade;
	
	public PessoaBean(){
	
	}
	
	public String getNome(){
		return upperCaseLetra(nome);
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public String upperCaseLetra(String input){
		String[] nomes = input.split(" ");
		String resultado = "";
				
		for(String nome : nomes){
			if(nome.length() > 2){
				resultado += nome.substring(0, 1).toUpperCase() + nome.substring(1, nome.length());
				//System.out.println("01 resultado: " + resultado);
			}else{
				resultado += nome;
				//System.out.println("01 resultado: " + resultado);
			}
			resultado += " ";
		}
		
		return resultado;
	}
	
}
