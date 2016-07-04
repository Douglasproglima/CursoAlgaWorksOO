package DesafioCollections;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ProgramaDesafioCollections {
	public static void main(String[] args) {
		DecimalFormat formatarNumeros = DecimalFormat("R$ #.##0,00");
		
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
		
		politico = new Politico();
		politico.setNome("Joaquim Vereador 2");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PSDB", politico);
		
		politico = new Politico();
		politico.setNome("Maria Vereador 3");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PSOL", politico);
		
		//Teste informação duplicada
		politico = new Politico();
		politico.setNome("Maria Vereador 3");
		politico.setCargo(vereador);
		governo.adicionarPolitico("PSOL", politico);		
		
		//Adicionando os prefeitos
		politico = new Politico();		
		politico.setNome("João Prefeito 1");
		politico.setCargo(prefeito);

		politico = new Politico();		
		politico.setNome("Marta Prefeito 2");
		politico.setCargo(prefeito);		
		
		//Adicionando os deputados
		politico = new Politico();
		politico.setNome("Augusto Deputados 1");
		politico.setCargo(deputadoEstadual);
		
		politico = new Politico();
		politico.setNome("Ramon Deputados 1");
		politico.setCargo(deputadoEstadual);
	}
}
