package LancandoExcecoes;

import Exercicio3Alura.Conta;

public class TesteExcecoesChecadas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);
		
		System.out.println("Saldo: "+cc.getSaldo());
		
		try {
			cc.sacar(60);
			System.out.println("Saldo após 1º saque: "+cc.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente!");
		}
		
		try {
			cc.sacar(30);
			System.out.println("Saldo após 2º saque: "+cc.getSaldo());
			
			//Se for informado no catch a exceção Exception irá capturar qualquer tipo de
			//exceção, pois a Exception é a super class das exceções.
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente!");
		}finally {
			System.out.println("Executa de toda forma!");
		}
		
		System.out.println("Saldo Atual: " + cc.getSaldo());
	}
}
