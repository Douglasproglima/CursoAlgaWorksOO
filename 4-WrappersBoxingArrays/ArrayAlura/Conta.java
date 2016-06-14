package ArrayAlura;

public class Conta {
	int numero;
	String cpf;
	double saldo;
	double limite;
	Cliente cliente;
	
	void sacaCash(double qtde){
		double novoSaldo = this.saldo - qtde;
		this.saldo = novoSaldo;
	}
	
	boolean saca(double valor){
		if (this.saldo < valor) {
			return false;
		} else {
			return true;
		}
	}
	
	void depositarCash(double qtde){
		this.saldo += qtde;
	}
	
	void transferePara(Conta contaDest, double valor){
		this.saldo -= valor;
		contaDest.saldo += valor;
	}
	
	boolean verificaSaldo(Conta contaDest, double valor){
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			return true;
		}
	}
	
	//Reescrevendo o método equals() para comparar atributos de objetos !=
	public boolean equals(Object object){
		Conta outraConta = (Conta) object;
		if (this.saldo == outraConta.saldo) {
			return true;
		} else {
			return false;
		}
	}
}
