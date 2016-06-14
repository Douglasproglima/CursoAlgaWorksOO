package FolhaPagamento;

public class PrincipalFolha {

	public static void main(String[] args) {
		FolhaPagamento folha = new FolhaPagamento();
		double salario = folha.calcularSalario(160, 12, 32.50, 4.20);
	
		System.out.println("Salário a receber: " + salario);
	}

}
