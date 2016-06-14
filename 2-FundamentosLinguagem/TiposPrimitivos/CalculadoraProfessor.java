package TiposPrimitivos;

import java.util.Scanner;

class CalculadoraProfessor{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		float raio = 5.3f;
		float pi = 3.14f;
		float areaFloat = raio * raio * pi;
		int area = (int)10;
		
		
		System.out.print("Deseja imprimir a formula (Sim ou Nao) ? ");
		String opcao = entrada.nextLine();
		
		if(opcao == "Sim"){
			System.out.print("\nFormula - Raio: " + raio + "\nPI:" + pi + "\n\n");
		}
		
		System.out.print("\nO area do circulo com casas decimais: " + areaFloat + " e sem casas decimais: " + area);
	}
}