package ModificadoresStaticFinal;

public class Contador {
	//Atributos ou variáveis statics geralmente são representadas
	//por letras em maiúsculas pois utilizando a palavra final são constantes, ou seja
	//que não alterar o seu o valor;
	
	//Link que explica detalhadamento o uso do final e do static para:
	//class, atributos, variáveis e métodos;
	//http://pt.stackoverflow.com/questions/17015/qual-o-uso-de-uma-vari%C3%A1vel-est%C3%A1tica-ou-final-em-java
	public static int COUNT = 0; 
	public static final double PI = 3.14;
	
	public void incrementaCount(){
		COUNT++;
	}
	
	public static void imprimeCount(){
		System.out.println("O valor do count é: " + COUNT);
	}
}
