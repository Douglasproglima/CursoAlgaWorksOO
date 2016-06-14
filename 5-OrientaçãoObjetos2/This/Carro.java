package This;

public class Carro {
	String fabricante;
	String modelo;
	String cor;
	boolean biCombustivel;
	int anoFabricacao;
	double valor;
	
	Pessoas donoCarro;
	
	void alterarModelo(String modelo){
		if(modelo != null){
			this.modelo = modelo;
		}
	}
	
	void ligarCarro(){
		System.out.println("Ligar carro - Modelo: " + modelo);
	}
	//criar um metodo e chamar ele para os dois objetos criados na class principal2
}
