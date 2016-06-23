package Heranca;

public class Jogador extends Pessoa{
	protected boolean aindaJoga;
	
	public void ativoNaArea(){
		System.out.println("Ainda joga? " + aindaJoga);
	}
}
