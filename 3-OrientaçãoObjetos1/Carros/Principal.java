package Carros;
public class Principal {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "GM";
		meuCarro.modelo = "Corsa 1.0 Wind";
		meuCarro.cor = "Prata";
		meuCarro.anoFabricacao = 1999;
		meuCarro.biCombustivel = true;
		meuCarro.valor = 8500.59;
		
		
		System.out.println("Meu carro\n");
		System.out.println("Fabricante: " + meuCarro.fabricante + "\n" +
						   "Modelo....: " + meuCarro.modelo + "\n" +
						   "Cor.......: " + meuCarro.cor + "\n" +
						   "Ano.......: " + meuCarro.anoFabricacao + "\n" +
						   "Flex......: " + meuCarro.biCombustivel + "\n" +
						   "Valor.....: " + meuCarro.valor + "\n"						   
						   );
		
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Fiat";
		seuCarro.modelo = "Palio 1.0";
		seuCarro.cor = "Branco";
		seuCarro.anoFabricacao = 1998;
		seuCarro.biCombustivel = false;
		seuCarro.valor = 7500.31;

		System.out.println("Seu carro\n");
		System.out.println("Fabricante: " + seuCarro.fabricante + "\n" +
						   "Modelo....: " + seuCarro.modelo + "\n" +
						   "Cor.......: " + seuCarro.cor + "\n" +
						   "Ano.......: " + seuCarro.anoFabricacao + "\n" +
						   "Flex......: " + seuCarro.biCombustivel + "\n" +
						   "Valor.....: " + seuCarro.valor + "\n"						   
						   );		
	}

}
