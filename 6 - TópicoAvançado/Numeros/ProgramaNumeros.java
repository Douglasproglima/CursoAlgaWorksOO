package Numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ProgramaNumeros {
	public static void main(String[] args){
		DecimalFormat formatarNumeros = new DecimalFormat("R$ #,##0.00");
		double valorTotal = 111222333444555169.00;
		
		System.out.println(valorTotal);
		System.out.println(formatarNumeros.format(valorTotal));
		
		//Transformando String para double - entrada do usuário e exemplo de inserir no banco
		String entrada = "R$ 50,34";
		
		//numero do tipo double que recebe o objeto formatarNumeros que utiliza o método parse(String) e que
		//utiliza o método doubleValue() que irá converte a string para double.
		//Neste caso o java pede para fazer um try catch
		try {
			double numero = formatarNumeros.parse(entrada).doubleValue();
			System.out.println(numero); //O usuário informou R$ 50,34 e o sistema inseriu correto no banco 50.34
		} catch (Exception e) {
			System.out.println("Formato inválido - Erro: " + e);
		}
		
		//Testando zero a esquerda
		for(int i = 0; i < 10; i++){
			DecimalFormat formatadorDePK = new DecimalFormat("000");
			System.out.println(formatadorDePK.format(i + 1));
		}
		
		//Class BigDecimal - Ela tem limitação maior de números do que os tipos primitivos tem
		BigDecimal bigDecimal = new BigDecimal(100d);
		bigDecimal = bigDecimal.divide(BigDecimal.TEN);
		
		System.out.println("BigDecimal: " + bigDecimal);
	}
}
