package DesafioStaticFinal;

public class MatematicaUtil {

	static final double PI = 3.14;
	
	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci (posicao - 1) + calcularFibonacci(posicao - 2);
	}
	
	static double calculaAreaCirculo(double raio){
		return raio * raio * PI;
	}
}
