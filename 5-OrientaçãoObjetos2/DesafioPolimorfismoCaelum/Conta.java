package DesafioPolimorfismoCaelum;

public class Conta {
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public double deposita(double valorDepositado){
		return this.saldo += valorDepositado;
	}
	
	public double saca(double valorSacado){
		return this.saldo -= valorSacado;
	}
	
	public void atualizadaSaldo(double taxa){
		this.saldo += this.saldo * taxa;
	}
}
