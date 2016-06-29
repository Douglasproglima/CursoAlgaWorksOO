package Datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProgramaCalendar {
	public static void main(String[] args) {
		Calendar calendario = new GregorianCalendar();

		calendario.set(Calendar.DAY_OF_MONTH, 29);
		calendario.set(Calendar.MONTH, 5);
		calendario.set(Calendar.YEAR, 2016);
		calendario.set(Calendar.HOUR_OF_DAY, 16);
		calendario.set(Calendar.MINUTE, 49);
		calendario.set(Calendar.SECOND, 50);

		DateFormat formatarData = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		System.out.println(formatarData.format(calendario.getTime()));

		// Adicionando dois dia no mês, se estiver no último dia automáticamente
		// vira o mês
		calendario.add(Calendar.DAY_OF_MONTH, 2);
		System.out.println(formatarData.format(calendario.getTime()));

		// Adicionando um mês
		calendario.add(Calendar.MONTH, 1);
		System.out.println(formatarData.format(calendario.getTime()));

		// Adicionando um ano
		calendario.add(Calendar.YEAR, 1);
		System.out.println(formatarData.format(calendario.getTime()));

		// Voltando 5 anos
		calendario.add(Calendar.YEAR, -5);
		System.out.println(formatarData.format(calendario.getTime()));

		// Adicionando dois dia sem alterar o mês
		calendario.roll(Calendar.DAY_OF_MONTH, 31);
		System.out.println(formatarData.format(calendario.getTime()));

		//O .add considera o calendário;
		//O .roll alterar somente o parâmetro informado;
		
	}
}
