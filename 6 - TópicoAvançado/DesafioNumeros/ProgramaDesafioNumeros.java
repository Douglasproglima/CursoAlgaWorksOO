package DesafioNumeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgramaDesafioNumeros {
	public static void main(String[] args){
		System.out.println("Informe o preço do produto.");
		
		Scanner entrada = new Scanner(System.in);
		double valorProduto = entrada.nextDouble();
		
		BigDecimal bigDecimal = new BigDecimal(valorProduto);
		bigDecimal = bigDecimal.multiply(new BigDecimal(0.1));
		
		//BigDecimal resultado = bigDecimal.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		
		DecimalFormat formatadorNumeros = new DecimalFormat("R$ #,##0.00");
		
		String valorProdutoFormatado = formatadorNumeros.format(bigDecimal.doubleValue());
		System.out.println("Valor do produto: " + formatadorNumeros.format(valorProduto));
		System.out.println("10% do valor é: " + valorProdutoFormatado);
	}
}
