package DesafioInterfaceAlgaWorks;

public class ProgramaInterface {
	public static void main(String[] args){
		
//***************************Exemplo 01*******************************//
		System.out.println("***********Exemplo 01*************");
		Seguravel casaPequena = new Imovel(2800.0, 400);
		//casa.calcularValorApolice();
		
		CorretoraSeguros corretora1 = new CorretoraSeguros();
		corretora1.propostaSeguro(casaPequena);
		
		Seguravel corsa00 = new Automovel(8500.00, 2000);
		corretora1.propostaSeguro(corsa00);
		
//***************************Exemplo 02*******************************//
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		System.out.println("***********Exemplo 02*************");
		Imovel casaGrande = new Imovel(2800.0, 400);
		Automovel corsa98 = new Automovel(8500.0, 1998);
		
		corretora.propostaSeguro(casaGrande);
		corretora.propostaSeguro(corsa98);

//***************************Objetos Notebook e Barco*******************************//	
		Barco barco1 = new Barco(155654.0, 2009);
		Notebook notebook = new Notebook(1500, 2015, "Acer Aspire E15");
		
		System.out.println("***********Barco*************");
		corretora.propostaSeguro(barco1);
		
		System.out.println("***********Notebook*************");
		corretora.propostaSeguro(notebook);
		
	}
}
