package Arrays;

public class ProgramaArrayCarro {
	public static void main(String[] args) {
		Carro[] carros =  new Carro[4];
		carros[0] = new Carro();
		String modelo = carros[0].modelo = "Corsa";
		
		System.out.println("Modelo Carro: " + modelo);
		
		
		
	}
}