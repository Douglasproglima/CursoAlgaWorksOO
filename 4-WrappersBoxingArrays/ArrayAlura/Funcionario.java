package ArrayAlura;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	//String dataEnt;
	String rg;
	
	String dataEnt;

	double receberAumento(double percentualAumento){
		double salarioAtualizado = salario + (salario * percentualAumento);
		return salarioAtualizado;
	}	

	double calculaGanhoAnual(double salario){
		return salario * 12;
	}	
	
	void mostra(){
		System.out.println("Nome........: " + nome +
						   "\nSetor.......: " + departamento +
						   "\nSalario.....: " + salario +
						  "\nData Entrada: " + dataEnt+
						   "\nRG..........: " + rg);
	}
}
