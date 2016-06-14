package com.algoworksOO.curso.excessoes;

public class ContaCorrente {
	private double saldo;
	
	public ContaCorrente(double saldo){
		this.saldo = saldo;
	}
	
	public void depositar(double deposito){
		if (deposito <= 0) {
			throw new IllegalArgumentException("O valor para deposito tem que ser maior do que 0!");
		}
		this.saldo += deposito;
	}
	
	//Quando utilizar o método utilizar uma exceção checada
	//deve se passar o throws na assinatura do método.
	public void sacar(double qtde) throws SaldoInsuficienteException { 
		double saldoTemp = saldo - qtde;
		if (saldoTemp < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente - Saldo: " + saldo);
		}
		this.saldo -= qtde;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
