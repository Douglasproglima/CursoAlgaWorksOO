package DesafioPolimorfismo_Douglas;

public class Programa {
	public static void main(String[] args){
		Forno forno = new Forno();
		
		Pizza pizzaCalabresa = new Calabresa();
		forno.fabricar(pizzaCalabresa);
		
		/*------------------------------------------------*/
		System.out.println();
		
		Pizza pizzaNapolitana = new Napolitana();
		forno.fabricar(pizzaNapolitana);
		
		/*Neste exemplo foi utilizado um interfase Pizza contendo assinatura dos:
		 * preparar();
		 * assar();
		 * cobrar();
		 * 
		 * Em seguida foi criado duas class (Calabresa e Napolitana) que implementam essa 
		 * interface e por sinal sobrescrevem os métodos preparar(), assar() e cobrar().
		 * 
		 * Uma outra class foi criada (Forno) que possui o método Fabricar() que recebe
		 * o argumento Pizza, por sinal este método referencia estes métodos em seu corpo.
		 * 
		 * No programa principal é instância/criado o objeto forno, em seguida criase dois
		 * objetos do tipo Pizza que são as class Calabresa e Napolitana;
		 * */
		// 
	}
}
