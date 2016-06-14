package com.algoworksOO.curso.coletaLixo;

public class Principal2 {

	public static void main(String[] args) {
		//Garbage Collection
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Corsa";
		meuCarro.anoFabricacao = 1999;
		System.out.println("01 - Garbage Collection: " + meuCarro.modelo);
		
		meuCarro = null;
		
		System.out.println("01 - Garbage Collection: " + meuCarro.modelo);
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";	
		
		meuCarro.ligarCarro();
		seuCarro.ligarCarro();
		
	}

}
