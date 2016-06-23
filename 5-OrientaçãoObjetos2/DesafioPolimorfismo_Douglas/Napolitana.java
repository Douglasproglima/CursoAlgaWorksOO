package DesafioPolimorfismo_Douglas;

public class Napolitana implements Pizza{
	
	@Override
	public void preparar(){
		System.out.println("Molho, Presunto, Queijo, Cebola e Oregano");
	}
	
	@Override
	public void assar(){
		System.out.println("19 minutos");
	}
	
	@Override
	public void cobrar(){
		System.out.println("R$18,00");
	}
}
