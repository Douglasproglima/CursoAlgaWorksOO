package DesafioStaticFinal;

public class ProgramaDesafioStaticFinal {
	public static void main(String[] args) {
		//MatematicaUtil mtUtil = new MatematicaUtil();
		
		double area = MatematicaUtil.calculaAreaCirculo(8);
		System.out.println("A área do circulo é: " + area);
		
		int numFibonacci = MatematicaUtil.calcularFibonacci(8);
		
		System.out.println("O número fibonacci de 8 é: " + numFibonacci);
	}
}
