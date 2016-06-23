package Enumeradores;

public class Carta {
	private int numCarta;
	private NaipesDoBaralho naipe;

	//Construtores
	public Carta(){
		
	}
	
	public Carta(int numCarta, NaipesDoBaralho naipe){
		this.numCarta = numCarta;
		this.naipe = naipe;
	}
	
	public void imprimirCarta(){
		System.out.println("Sou o " + numCarta + " de " + naipe + "\n" +
						   "E tenho a cor " + naipe.getCor());
	}
}
