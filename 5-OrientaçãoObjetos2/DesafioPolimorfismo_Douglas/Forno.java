package DesafioPolimorfismo_Douglas;

public class Forno{
	public void fabricar(Pizza pizza){
		pizza.preparar();
		pizza.assar();
		pizza.cobrar();
	}
}
