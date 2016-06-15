package ModificadorAcesso;

public class DonoCachorro {
	private Cachorro cachorro;
	
	public Cachorro getCachorro() {
		return cachorro;
	}
	
	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}
	
	void ensinarDogSentar(){
		System.out.println("Eu, " + cachorro.getNome() + " vou sentar malaca!" );
	}
}
