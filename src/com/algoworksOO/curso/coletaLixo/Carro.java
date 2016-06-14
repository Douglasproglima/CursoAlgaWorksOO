package com.algoworksOO.curso.coletaLixo;

public class Carro {
	String fabricante;
	String modelo;
	String cor;
	boolean biCombustivel;
	int anoFabricacao;
	double valor;
	
	Pessoas donoCarro;
	
	void ligarCarro(){
		System.out.println("Ligar carro - Modelo: " + modelo);
	}
}
