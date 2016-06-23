package DesafioPolimorfismoCaelum;

public class ContaCorrente extends Conta{

	public void atualizaSaldo(double taxa){
		
	}
	
	public double deposita(double valorDepositado){
		double saldo = this.getSaldo();
		return saldo = saldo - 0.10;
		//return this.saldo += valorDepositado;
	}
}
