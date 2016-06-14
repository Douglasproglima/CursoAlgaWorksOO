package EncapsulamentoModificadorAcesso;

public class ProgramaArCondicionado {
	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		ar.validarTemp(10);
		System.out.println("01 - Temperatura: " + ar.getTemperatura() +"º");
		
		ar.validarTemp(-21);
		System.out.println("02 - Temperatura: " + ar.getTemperatura() +"º");
	}
}
