package Arrays;

import java.util.Scanner;

public class ProgramaTesteArray {
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do array: ");
		int tamanhoIntArray = entrada.nextInt();
		if (tamanhoIntArray < 0) {
			System.out.println("Informe um número maior ou igual a 0.");
			return;
		}
		
		String[] alunos = new String[tamanhoIntArray];
		
		System.out.println("Informe o primeiro valor que será atribuido ao Array: ");
		String aluno1 = entrada.nextLine();
		alunos[0] = aluno1;
		
		System.out.println("Informe o segundo valor que será atribuido ao Array: ");
		String aluno2 = entrada.nextLine();
		alunos[1] = aluno2;
		
		System.out.println("Informe o terceiro valor que será atribuido ao Array: ");
		String aluno3 = entrada.nextLine();
		alunos[2] = aluno3;
		
		System.out.println("Informe o quarto valor que será atribuido ao Array: ");
		String aluno4 = entrada.nextLine();
		alunos[3] = aluno4;
		
		for(int i = 0; i < alunos.length; i++){
			System.out.println("Posição: " + i + " - Valor: " + alunos[i]);
		}
	}
}
