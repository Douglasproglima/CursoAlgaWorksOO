package DesafioPolimorfismo_Douglas;

public class Calabresa implements Pizza{
	
	@Override
	public void preparar(){
		System.out.println("Molho, Queijo, Calabreza, Cebola e Tomate");
	}
	
	@Override
	public void assar(){
		System.out.println("15 minutos");
	}
	
	@Override
	public void cobrar(){
		System.out.println("R$12,00");
	}
}
