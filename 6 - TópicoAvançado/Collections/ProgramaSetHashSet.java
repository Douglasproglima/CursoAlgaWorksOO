package Collections;

import java.util.HashSet;
import java.util.Set;

public class ProgramaSetHashSet {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Douglas");
		Aluno a2 = new Aluno("Paulo");
		Aluno a3 = new Aluno("Jader");
		Aluno a4 = new Aluno("Flávio");
		
		/*HashSet
		 * No HashSet não é permitido objetos iguais, no ArrayList é possível:
		 * 		List<Aluno> alunos = new ArrayList<Aluno>();
		 * 		alunos.add(a4);
		 * 		alunos.add(a4);
		 * 		
		 * */
		//
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4); //Adicionado a referência do aluno a4, porém o mesmo não é impresso
		
		//Outra diferença entre o Hash para o List é que o Hash imprime é uma ordem aleatória
		imprimirAlunosHash(alunos); 
	}
	
	public static void imprimirAlunosHash(Set<Aluno> alunos){
		//Para capturar as informações do setHash somente efetuar iteração, pois o mesmo não possui índices.
		
		for(Aluno a : alunos){
			System.out.println("Nome do aluno: " + a.getNome());
		}
	}
}