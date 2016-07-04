package Collections;

import java.util.HashMap;
import java.util.Map;

public class ProgramaMapHashMap {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Douglas");
		Aluno a2 = new Aluno("Paulo");
		Aluno a3 = new Aluno("Jader");
		Aluno a4 = new Aluno("Flávio");
		
		/*HashMap
		 * Map - HashMap - : onde o Map é a interface e o HashMap é a class
		 * 
		 * Sua composição é baseada em:
		 * 
		 * ChaveA -> Objeto1;
		 * ChaveB -> Objeto2;
		 * ChaveC -> Objeto3;
		 * ChaveD -> Objeto4;
		 * 
		 * Onde Chave é o Array e Objeto1, 2, 3 e 4 é a onde está os objetos.
		 * Onde o Array (Chave) estará apontando para os objetos na memória.
		 * 
		 * Quando for capturar os objetos deve utilizar a chave, exemplo
		 * 
		 * Map<K, V> alunos = new HashMap<>();
		 * Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		 * 
		 * No exemplo acima estamos dizendo que a chave é do tipo String e o objeto é do tipo Aluno
		 * */
		
		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		
		//Para adicionar dados no array diferente de List e Hash se utiliza o put(chave, objeto)
		alunos.put("01", a1);
		alunos.put("02", a2);
		alunos.put("03", a3);
		alunos.put("04", a4);
		alunos.put("05", a4);
		
		//Observação: Não é possível ter duas chaves iguais - ex: alunos.put("01", a2); objeto a1 será sobrescrito
		
		imprimirAlunosMap(alunos);
		
		//A chave pode ser usada no caso de precisar recuperar o valor pela chave, conforme abaixo:
		Aluno alunoRecuperado = alunos.get("03");
		System.out.println("Aluno recuperado: " + alunoRecuperado.getNome());
	}

	private static void imprimirAlunosMap(Map<String, Aluno> alunos) {
		//No caso do Map deve informar por qual argumento deve se fazer a iteração se é pela chave ou pelo valor (objeto)
		//No exemplo abaixo está sendo iterado pelo valor
		for(Aluno a : alunos.values()){
			System.out.println("Nome do aluno: " + a.getNome());
		}
	}
}
