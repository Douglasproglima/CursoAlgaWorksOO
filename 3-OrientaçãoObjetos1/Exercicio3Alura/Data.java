package Exercicio3Alura;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String formatadaData(int dia, int mes, int ano){
		String dataformatada = "";
		if (dia > 0 && mes > 0 && ano > 1900) {
			dataformatada =   (dia +"/"+ mes +"/"+ ano);
			return dataformatada;
		}else{
			System.out.println("Data invalida, verifique o dia, mês ou ano informado!");
		}
		return dataformatada;
	}
}
