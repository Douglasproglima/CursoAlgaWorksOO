package Datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProgramaData {
	public static void main(String[] args){
		Date dataAtual = new Date();
		System.out.println("Data Atual sem formatar: " + dataAtual);
		
		DateFormat formatDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Data atual formatada: " + formatDataHora.format(dataAtual));
		
		DateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatData.format(dataAtual));

		//**************Convertendo data String para o tipo Date****************//
		String dataStrNascimento = "26/12/1987";
		
		try {
			Date dataDtNascimento = formatData.parse(dataStrNascimento);
			System.out.println("Data Nascimento: " + formatData.format(dataDtNascimento));
		} catch (Exception e) {
			System.out.println("Formato de data inválido!");
		}
		
	}
}
