package ClassMath;

import java.util.Scanner;
import static java.lang.Math.*;

public class TesteClassMath {
	
	static final double constantePI = 3.1415; //Constante -> Nunca vai alterar o seu valor
	
	public static void main(String[] args) {
		/*A class Math possui várias constantes e métodos estáticos
		Pode se utilizar os metodos passando o nomeClass.nomeMetodo() = Math.round()
		ou
		Efetuar o import da class -> import static java.lang.Math.*;
		*/
		//Comprimento de uma circunferência (2x raio * PI(3.1415....))
		Scanner entradaDados = new Scanner(System.in);
		
		//System.out.println("Informe o raio para calcular o tamanho da circinferência: ");
		//int raio = entradaDados.nextInt();
		int raio = 40;
		double comprimento1 = 2 * raio * constantePI;
		System.out.println("01 - comprimento: "+ comprimento1);
		
		//Ou pode se utilizar a class Math que tem a constante PI já definida
		System.out.println("Informe o raio para calcular o tamanho da circinferência: ");
		double comprimento2 = 2 * raio * PI;
		System.out.println("01 - comprimento: "+ comprimento2);		
		
		
		//Máximo e minimo - Utilizando o método max e min da class Math
		double[] precosProdutoA = {45.32, 99.99, 102.32, 10.32, 19.32};
		double maiorPreco = max(precosProdutoA[0], precosProdutoA.length-1); //max(): Método estático dentro da class Math();
		System.out.println("Maior number da class math: " + maiorPreco);
		
		double menorPreco =min(precosProdutoA[2], precosProdutoA[3]);
		System.out.println("Menor number da class math: " + menorPreco);		
		
		//Potência
		System.out.println("2^3: "+pow(2, 3));
		
		//Raiz quadrada
		System.out.println("Raiz quadrada de 9: "+ sqrt(9));
		
		//Arredondamento ceil, floor e round
		double num1 = 5.6868;
		
		//Arredonda para baixo
		System.out.println("Menor inteiro de  "+num1+" é: "+floor(num1)); //Pega o menor inteiro
		
		//Arredonda para cima
		System.out.println("Maior inteiro de "+num1+" é: "+ceil(num1)); //Pega o maior inteiro
		
		//Arredonda no geral
		System.out.println("Arredondamento de "+num1+" é: "+round(num1));
		
		//Trigonometria - seno
		System.out.println("Seno de 40 é: " + sin(40));
		
		//Randomicos
		double  numAleatorio = (int) (random() * 100); //Pode se arredondar usando o Math.round() ou casting para int;
		System.out.println("Radom: " + numAleatorio );
	}

}
