package DesafioDatas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaData {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informa a data da última menstruação: ");
		
		String dataUltimaMenstruacaoStr = entrada.nextLine();
		DateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date dataUltimaMenstruacaoDt = formatData.parse(dataUltimaMenstruacaoStr);
			CalculadoraGravidez calculadoraGravidez = new CalculadoraGravidez(dataUltimaMenstruacaoDt);
			
			Date dataConcepcao = calculadoraGravidez.calcularDataEstimadaConcepcao();
			
			System.out.println("Data Estimada Concepção: " + formatData.format(dataConcepcao));
		
			Date dataParto = calculadoraGravidez.calcularDataEstimadaParto();
			System.out.println("Data Estimada Parto: " + formatData.format(dataParto));
				
		} catch (Exception e) {
			System.out.println("Formato de data inválido!");
		}	
	}
}
