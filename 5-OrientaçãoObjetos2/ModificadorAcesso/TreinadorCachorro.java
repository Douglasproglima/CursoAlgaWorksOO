package ModificadorAcesso;

public class TreinadorCachorro {
	public static void main(String[] args) {
		Cachorro dog1 = new Cachorro();
		dog1.setNome("Nina");
		
		DonoCachorro donoCachorro = new DonoCachorro();
		donoCachorro.setCachorro(dog1);
		donoCachorro.ensinarDogSentar();
	}
}
