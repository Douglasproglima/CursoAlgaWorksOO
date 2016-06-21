package Polimorfismo;

public class ProgramaPolimorfismo {
	public static void main(String[] args){
		//Conta Tipo de Objeto = new Objeto
		Conta c1 = new Conta();
		c1.setSaldo(5900);
		
		//Métodos static que estão dentro do mesmo escopo, podem ser acessados diretamentes
		//ou passando o nome da class.nomeMetodo();
		//ProgramaPolimorfismo.imprimirSaldo(Conta conta);
		ProgramaPolimorfismo.imprimirSaldo(c1);

		System.out.println();
		
		//Conta Tipo de Objeto = new Objeto
		Conta cc1 = new ContaCorrente();
		cc1.setSaldo(3000);
		imprimirSaldo(cc1);
		
		System.out.println();
		
		//Conta Tipo de Objeto = new Objeto
		Conta cp1 = new ContaPoupanca();
		cp1.setSaldo(3500);
		imprimirSaldo(cp1);
	}
	
	public static void imprimirSaldo(Conta conta){
		System.out.println("Saldo em conta R$" + conta.getSaldo());
		
		if(conta  instanceof ContaCorrente){
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limite da conta corrente é R$" + cc.getLimite());
		}
		
		if(conta instanceof ContaPoupanca){
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O redimento da conta poupança é R$" + cp.getRendimentos());
		}
	}
}
