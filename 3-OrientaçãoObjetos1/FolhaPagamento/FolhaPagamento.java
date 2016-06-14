package FolhaPagamento;

public class FolhaPagamento {
	//double calcularSalario(int, int, double, double)
	double calcularSalario(int hhNormais, int hhExtras, double valorHhNormal, double valorHhExtra){
		double valorHhNormais = hhNormais * valorHhNormal;
		double valorHhExtras = hhExtras * valorHhExtra;
		
		return valorHhNormais + valorHhExtras;
	}
}
