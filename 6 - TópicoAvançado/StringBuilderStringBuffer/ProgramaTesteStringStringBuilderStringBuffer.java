package StringBuilderStringBuffer;

public class ProgramaTesteStringStringBuilderStringBuffer {
	public static void main(String[] args) {

//Teste com String utilizando o operador '+' para concatenar
		String strFinal = "";
		long tempoInicial = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++){
			strFinal += "a";
		}
		
		long tempoFinal = System.currentTimeMillis();
		long tempoResultado = (tempoFinal - tempoInicial);
		
		System.out.println("String: " + tempoResultado +" milisegundos");
		
//Teste com o StringBuilder -> É mais rápido pois não é sincronizado
		StringBuilder stringBuilderFinal = new StringBuilder();
		long tempostringBuilderInicial = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++){
			stringBuilderFinal.append("a");
		}
		
		long tempostringBuilderFinal = System.currentTimeMillis();
		long tempostringBuilderResultado = (tempostringBuilderFinal - tempostringBuilderInicial);
		
		System.out.println("StringBuilder: " + tempostringBuilderResultado +" milisegundos");
		
//Teste com o StringBuffer
		StringBuffer stringBufferFinal = new StringBuffer();
		
		long tempoStringBufferInicial = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++){
			stringBufferFinal.append("a");
		}
		
		long tempoStringBufferFinal = System.currentTimeMillis();
		long tempoStringBufferResultado = tempoStringBufferFinal - tempoStringBufferInicial;
		
		System.out.println("StringBuffer: " + tempoStringBufferResultado +" milisegundos");
	}
}
