package ModificadoresStaticFinal;

public class ProgramaContador {
	public static void main(String[] args) {
		Contador.COUNT++;
		Contador.imprimeCount();

		Contador c1 = new Contador();
		c1.incrementaCount();
		
		Contador.imprimeCount();
		System.out.println(c1.COUNT);
	}
}
