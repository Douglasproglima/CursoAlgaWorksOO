package LancandoExcecoes;

public class SaldoInsuficienteException extends Exception{
	
	//Contrutor da class SaldoInsuficienteException
	public SaldoInsuficienteException(String mensagem){
		super(mensagem); //Faz a chamada da super class Exception
	}
}
