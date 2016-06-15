package Enumeradores;

public enum NaipesDoBaralho {
	/*Os Enuns são utilizados para declarar valores absolutos ou um grupo de constantes;
	*/
	
	OURO("Vermelho"), 
	PAUS("Preto"), 
	ESPADA("Preto"), 
	COPAS("Vermelho");
	
	private String cor;
	
	NaipesDoBaralho(String cor){
		this.cor = cor;
	}
	
	public String getCor(){
		return this.cor;
	}
	
}
