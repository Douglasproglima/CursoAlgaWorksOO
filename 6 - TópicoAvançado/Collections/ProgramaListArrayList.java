package Collections;

import java.util.ArrayList;
import java.util.List;

public class ProgramaListArrayList {
	public static void main(String[] args){
		Aluno a1 = new Aluno("Douglas");
		Aluno a2 = new Aluno("Paulo");
		Aluno a3 = new Aluno("Jader");
		Aluno a4 = new Aluno("Flávio");
		
		//List é a interface e ArrayList é class.
		//Os sinal de List<E>, server para informar o tipo que essa interface ou lista é (generic)
		List<Aluno> alunos = new ArrayList<Aluno>(); //Declaração do array
		
		//Informando o tipo de lista impossibilita erros, foi adicionado essa opção no Java 5
		alunos.add(a1); //inserido informações no array
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		imprimirAlunosList(alunos);
	}
	
	public static void imprimirAlunosList(List<Aluno> alunos){
		for(Aluno a : alunos){
			System.out.println("Nome do aluno: " + a.getNome());
		}
	}
}
