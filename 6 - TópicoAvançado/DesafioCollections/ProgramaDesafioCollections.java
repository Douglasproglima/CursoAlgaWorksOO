package DesafioCollections;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ProgramaDesafioCollections {
	public static void main(String[] args) {
		DecimalFormat formatarNumeros = new DecimalFormat("R$ #,##0.00");
		
		//Instanciando o governo
		Governo governo = new Governo();
		
		//Instanciando os cargos
		Cargo vereador = new Cargo();
		vereador.setDescricao("Vereador");
		vereador.setSalario(new BigDecimal(16000));
		
		Cargo prefeito = new Cargo();
		prefeito.setDescricao("prefeito");
		prefeito.setSalario(new BigDecimal(25000));
		
		Cargo deputadoEstadual = new Cargo();
		deputadoEstadual.setDescricao("Deputado Estadual");
		deputadoEstadual.setSalario(new BigDecimal(27000));
		
		
		//Adicionando os vereadores
		Politico politico = new Politico();
		politico.setNome("Osmar Vereador 1");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PT", politico);

		politico.setNome("Batista Vereador 2");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PT", politico);
		
		politico = new Politico();
		politico.setNome("Joaquim Vereador 3");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PSDB", politico);

		politico = new Politico();
		politico.setNome("Eustáquio Vereador 4");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PSDB", politico);		
		
		politico = new Politico();
		politico.setNome("Maria Vereador 5");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PSOL", politico);
		
		//Teste informação duplicada
		politico = new Politico();
		politico.setNome("Maria Vereador 5");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PSOL", politico);		
		
		//Adicionando os prefeitos
		politico = new Politico();		
		politico.setNome("João Prefeito 1");
		politico.setCargo(prefeito);
		governo.adicionarPolitico("PT", politico);	

		politico = new Politico();		
		politico.setNome("Lucas Prefeito 2");
		politico.setCargo(prefeito);
		governo.adicionarPolitico("PT", politico);		
		
		politico = new Politico();		
		politico.setNome("Marta Prefeito 3");
		politico.setCargo(prefeito);		
		governo.adicionarPolitico("PSOL", politico);	
		
		//Adicionando os deputados
		politico = new Politico();
		politico.setNome("Augusto Deputados 1");
		politico.setCargo(deputadoEstadual);
		governo.adicionarPolitico("PT", politico);	
		
		politico = new Politico();
		politico.setNome("Ramon Deputados 2");
		politico.setCargo(deputadoEstadual);
		governo.adicionarPolitico("PSDB", politico);	

		politico = new Politico();
		politico.setNome("Ramon Deputados 3");
		politico.setCargo(deputadoEstadual);
		governo.adicionarPolitico("PSOL", politico);		
		
		//Calcula gastos com partidos
		BigDecimal custoPartidoPT = governo.calcularGastosComSalario("PT");
		System.out.println("Gastos com partido PT: " + formatarNumeros.format(custoPartidoPT.doubleValue()));

		BigDecimal custoPartidoPSDB = governo.calcularGastosComSalario("PSDB");
		System.out.println("Gastos com partido PSDB: " + formatarNumeros.format(custoPartidoPSDB.doubleValue()));
		
		BigDecimal custoPartidoPSOL = governo.calcularGastosComSalario("PSOL");
		System.out.println("Gastos com partido PSOL: " + formatarNumeros.format(custoPartidoPSOL.doubleValue()));
		
		//Gastos com partidos para determinados cargos
			//PT
		BigDecimal custoVereadoresPT = governo.calcularGastosComSalarioParaCargo(vereador, "PT");
		System.out.println("Gastos com vereadores do PT: " + formatarNumeros.format(custoVereadoresPT.doubleValue()));
		
		BigDecimal custoPrefeitosPT = governo.calcularGastosComSalarioParaCargo(prefeito, "PT");
		System.out.println("Gastos com prefeitos do PT: " + formatarNumeros.format(custoPrefeitosPT.doubleValue()));

		BigDecimal custoDeputadosPT = governo.calcularGastosComSalarioParaCargo(deputadoEstadual, "PT");
		System.out.println("Gastos com governador do PT: " + formatarNumeros.format(custoDeputadosPT.doubleValue()));		
		
			//PSDB
		BigDecimal custoVereadoresPSDB = governo.calcularGastosComSalarioParaCargo(vereador, "PSDB");
		System.out.println("Gastos com vereadores do PSDB: " + formatarNumeros.format(custoVereadoresPSDB.doubleValue()));
		
		BigDecimal custoPrefeitosPSDB = governo.calcularGastosComSalarioParaCargo(prefeito, "PSDB");
		System.out.println("Gastos com prefeitos do PSDB: " + formatarNumeros.format(custoPrefeitosPSDB.doubleValue()));

		BigDecimal custoDeputadosPSDB = governo.calcularGastosComSalarioParaCargo(deputadoEstadual, "PSDB");
		System.out.println("Gastos com governador do PSDB: " + formatarNumeros.format(custoDeputadosPSDB.doubleValue()));
		
			//PSOL
		BigDecimal custoVereadoresPSOL = governo.calcularGastosComSalarioParaCargo(vereador, "PSOL");
		System.out.println("Gastos com vereadores do PSOL: " + formatarNumeros.format(custoVereadoresPSOL.doubleValue()));
		
		BigDecimal custoPrefeitosPSOL = governo.calcularGastosComSalarioParaCargo(prefeito, "PSOL");
		System.out.println("Gastos com prefeitos do PSOL: " + formatarNumeros.format(custoPrefeitosPSOL.doubleValue()));

		BigDecimal custoDeputadosPSOL = governo.calcularGastosComSalarioParaCargo(deputadoEstadual, "PSOL");
		System.out.println("Gastos com governador do PSOL: " + formatarNumeros.format(custoDeputadosPSOL.doubleValue()));
	
	}
}
