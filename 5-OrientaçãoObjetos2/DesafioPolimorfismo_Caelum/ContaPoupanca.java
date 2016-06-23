package DesafioPolimorfismo_Caelum;

public class ContaPoupanca extends Conta{
	
	public void atualizaSaldo(double taxa){
		Conta cc = new Conta();
		double saldo = cc.getSaldo();
		saldo = saldo * taxa * 3;
	}	
}
