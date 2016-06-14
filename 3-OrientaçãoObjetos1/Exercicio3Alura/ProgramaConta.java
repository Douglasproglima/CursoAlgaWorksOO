package Exercicio3Alura;

public class ProgramaConta {
	public static void main(String[] args){
		Conta minhaConta = new Conta();
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Douglas";
		cliente1.sobreNome = "Lima";
		cliente1.cpf = "123";
		minhaConta.saldo = 1000;
		
		boolean saqueRealizado = minhaConta.saca(500);
		
		if (saqueRealizado) {
			minhaConta.sacaCash(500);
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saque não autorizado!");
		}
		
		System.out.println("Cliente: "+ cliente1.nome +"  - Saldo: " + minhaConta.saldo);
		
		minhaConta.depositarCash(10);
		System.out.println("Depositou:  10");
		System.out.println("Cliente: "+ cliente1.nome +"  - Saldo: " + minhaConta.saldo);
		
		Conta minhaConta2 = new Conta();
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Cristina";
		minhaConta2.saldo = 2500;
		
		System.out.println("Cliente: "+ cliente2.nome +" - Saldo em conta: " + minhaConta2.saldo);
		System.out.println(cliente2.nome + " Transferiu: 500 para " +cliente1.nome);
		minhaConta2.transferePara(minhaConta, 500);
		minhaConta2.depositarCash(50);
		
		System.out.println("Cliente: "+ cliente1.nome +" - Saldo em conta: " + minhaConta.saldo);
		System.out.println("Cliente: "+ cliente1.nome +" - Saldo em conta: " + minhaConta2.saldo);
		
		//Validando o uso do equals() - Para comparar metódos iguals e objetos diferentes é necessário reescrever o meétodo equals()
		Conta minhaConta3 = new Conta();
		Cliente cliente3 = new Cliente();
		cliente3.nome = "Douglas";		
		cliente3.sobreNome = "Lima";
		cliente3.cpf = "123";
		
		if (minhaConta.equals(minhaConta2)) {
			System.out.println("Métodos iguais");
		}else{
			System.out.println("Métodos diferentes");
		}
	}
}
