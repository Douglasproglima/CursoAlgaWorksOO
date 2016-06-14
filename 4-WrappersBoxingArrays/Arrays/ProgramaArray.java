package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ProgramaArray {
	public static void main(String[] args) {
		int[] notas = new int[5];
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 0;
		notas[4] = 9;
		
		for(int i = 0; i < notas.length; i++){
			System.out.println("Exemplo 01: " + notas[i]);
		}
		
		for(int x : notas){
			System.out.println("Exemplo 02: " + x);
		}
		
		//java.util.List - API Java Colletions
		System.out.println("\n");
		List alunos = new ArrayList<>();
		alunos.add("Douglas");
		alunos.add("Rafalea");
		alunos.add("João Paulo");
		System.out.println(alunos + "\n");
		
		Carro c1 = new Carro();
		c1.valor = 1000;
		
		Carro c2 =  new Carro();
		c2.valor = 2000;

		Carro c3 =  new Carro();
		c3.valor = 3000;
		
		List carros = new ArrayList();
		carros.add(c1);
		carros.add(c2);
		carros.add(c3);
		
		for(int i = 0; i < carros.size(); i++){
			Carro cc = (Carro) carros.get(i);
			System.out.println(cc.valor);
		}
	}
}