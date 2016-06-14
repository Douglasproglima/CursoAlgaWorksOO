package This;

public class ProgramaThis {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Corsa";
		System.out.println("Mod. Antes: " + carro.modelo);
		
		carro.alterarModelo("Supra");
		System.out.println("Mod. Depois: " + carro.modelo);
	}
}
