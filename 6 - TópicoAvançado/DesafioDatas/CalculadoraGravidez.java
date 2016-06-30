package DesafioDatas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalculadoraGravidez {
	private Date dataUltimoPeriodoMenstrual;
	
	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual){
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
	
	private Calendar converterDataCalendar(Date data){
		Calendar calendario = new GregorianCalendar();
		calendario.setTime(data);
		
		return calendario;
	}
	
	public String formatarData(Date data){
		// Padrão de formatação de data por extenso
		// A classe Locale representa uma região no planeta, sendo neste caso
		// o Brasil (br), onde falamos Português (pt)
		// O Locale é usado aqui para formatar a data em português brasileiro
		
		DateFormat formatador = new SimpleDateFormat("EEEE, dd 'de' MMMM de 'YYYY'", new Locale("pt", "br"));
		
		return formatador.format(data);
	}
	
	public Date converterData(String dataStr) throws ParseException{
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataDt = formatador.parse(dataStr);
		
		return dataDt;
	}
	
	public Date calcularDataEstimadaConcepcao(){
		// implementar cálculo de data estimada da concepção
		// 2 semanas após a data do último período menstrual

		Calendar dataConcepcao = this.converterDataCalendar(this.getDataUltimoPeriodoMenstrual());
		dataConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
		
		return dataConcepcao.getTime();
	}
	
	public Date calcularDataEstimadaParto(){
		// implementar cálculo de data estimada para parto
		// 40 semanas após a data do último período menstrual
		
		Calendar dataConcepcao = this.converterDataCalendar(this.getDataUltimoPeriodoMenstrual());
		dataConcepcao.add(Calendar.WEEK_OF_YEAR, 40);
		
		return dataConcepcao.getTime();
	}
	
	public Date getDataUltimoPeriodoMenstrual() {
		return dataUltimoPeriodoMenstrual;
	}
	
	public void setDataUltimoPeriodoMenstrual(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
}
