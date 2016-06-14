package ArrayAlura;

public class Empresa {
	String nome;
	int cnpj;
	Funcionario[] empregados;
	
	void adiciona(Funcionario f, int posicao){
		this.empregados[posicao].salario = f.salario;
	}
	
	void mostrarEmpregados(){
		for(int i = 0; i <= this.empregados.length; i++){
			System.out.println("Posição do funcionário: " + this.empregados[i].nome);
		}
	}
}
