package ClassWrapper;

public class PrincipalTelevisor {
	public static void main(String[] args) {
		Televisor tv = new Televisor();
		// Não deveria mudar o volume e canal
		tv.mudarCanal(130);
		tv.mudarVolume(20);
		
		// Deveria mudar o volume e canal
		tv.mudarCanal(10);
		tv.mudarVolume(300);
		
		Integer teste = 383;
		Integer teste2 = new Integer(teste.byteValue());
		
		System.out.println(teste2);
	}
}