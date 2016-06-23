package Polimorfismo;

public class ProgramaTesteGerente {
	public static void main(String[] args){
		//Herança e sobrescrita de métodos
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Douglas Lima");
		gerente1.setCpf("000.000.000-00");
		gerente1.setSalario(3500);
		gerente1.setSenha(123456);
		gerente1.setQtdeFuncionariosGerenciados(10);
		
		gerente1.autenticar(12345);
		
		
		System.out.println("1 - Gerente Salário: "+gerente1.getSalario());
		System.out.println("1 - Gerente Salário + bonificação: "+gerente1.getBonificacao());

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Lucas");
		funcionario1.cpf = "000.000.000-00"; //Atributos definidos como protected
		funcionario1.setSalario(5500);
		
		System.out.println("1 - Func. Salário: "+funcionario1.getSalario());
		System.out.println("1 - Func. Salário + bonificação: "+funcionario1.getBonificacao());
		
		//Polimorfismo
		Gerente gerente2 = new Gerente();
		Funcionario funcionario2 = gerente2;
		funcionario2.setSalario(10.0);
		System.out.println("2 - Func. Salário: "+funcionario2.getSalario());
		System.out.println("2 - Func. Salário + bonificação: "+funcionario2.getBonificacao());
		
		//Exemplo utilizando a class ControleDeBonificacoes();
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente gerente3 =  new Gerente();
		gerente3.setSalario(2000);
		
		controle.registra(gerente3);
		
		System.out.println("3 - Gerente Salário: " + gerente3.getSalario());
		System.out.println("3 - Gerente Bonificação: " + controle.getTotalDeBonificacoes());
		
		//---------------//
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setSalario(2000);
		
		controle.registra(funcionario3);
		
		System.out.println("3 - Funcionário Salário: " + funcionario3.getSalario());
		System.out.println("3 - Funcionário Bonificação: " + controle.getTotalDeBonificacoes());
	}
}
