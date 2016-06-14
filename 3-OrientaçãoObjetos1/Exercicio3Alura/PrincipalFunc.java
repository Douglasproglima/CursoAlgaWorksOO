package Exercicio3Alura;

public class PrincipalFunc {

	public static void main(String[] args) {
		Funcionario eu = new Funcionario();
		eu.nome = "Douglas Lima";
		eu.departamento = "T.I";
		eu.salario = 2100;
		eu.rg = "MG-132.123";

		Data dataEntradaEu = new Data();
		eu.dataEnt = dataEntradaEu.formatadaData(1, 1, 2015);
		
		eu.mostra();
		
		Funcionario fulano = new Funcionario();
		fulano.nome = "Cristina";
		fulano.departamento = "Analista de Qua.";
		fulano.salario = 3800;
		fulano.rg = "MG-456.987";
		
		Data dataEntradaFulano = new Data();
		fulano.dataEnt = dataEntradaEu.formatadaData(1, 1, 2016);
	
		System.out.println("\nGanho anual antes: " + eu.calculaGanhoAnual(eu.salario));
		System.out.println(" Salário atualizado: " + eu.receberAumento(0.12));
		System.out.println("Ganho anual depois: " + eu.calculaGanhoAnual(eu.receberAumento(0.12)) );
	}

}
