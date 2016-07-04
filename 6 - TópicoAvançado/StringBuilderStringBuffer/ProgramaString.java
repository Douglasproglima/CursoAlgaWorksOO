package StringBuilderStringBuffer;

public class ProgramaString {
	public static void main(String[] args){
		//Class String -> Essa class em Java é imultavel, isso mesmo não altera o valor atribuído
		
		String s = "Douglas"; //Cria o objeto s na heap
		
		s = s + " Lima"; //Cria outro objeto com a string Douglas Lima, o bjeto anterior fica na heap ocupando espaço;
		System.out.println(s);
		
		/*Para contorna essa situação existem StringBuilder e StringBuffer
		 * StringBuilder -> Não é protegida com relação a threads, porém StringBuilder é mais rápida do que StringBuffer
		 * StringBuffer  -> É protegida com relação a threads porém é mais lento do StringBuilder
		 * */
		
		StringBuilder strBuilder = new StringBuilder("Douglas");//Existe a StringBuilder Douglas
		strBuilder.append(" Lima"); //Reaproveita a StringBuilder e concatena (.append) com Lima
		
		//Dessa forma não é desperdiçado recurso
		
		//Se precisar utilizar a class String para mostrar, basta fazer o cast
		
		String resultado = strBuilder.toString();
		System.out.println("Com StringBuilder: " + resultado);
		
	}
}
