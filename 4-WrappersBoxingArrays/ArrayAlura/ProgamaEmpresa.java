package ArrayAlura;

public class ProgamaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[3];
		
		Funcionario f1 = new Funcionario();
		f1.salario = 1000f;
		empresa.adiciona(f1, 0);

		Funcionario f2 = new Funcionario();
		f2.salario = 2000f;
		empresa.adiciona(f2, 1);
	
		Funcionario f3 = new Funcionario();
		f3.salario = 3000;
		empresa.adiciona(f3, 3);
		
		empresa.mostrarEmpregados();
		
		//Testa a forma abaixo
//		for(int i = 0; i < 5; i++){
//			Funcionario f = new Funcionario();
//			f.salario = 1000 + i * 100;
//			empresa.adiciona(f, i);
//		}
		
	}
}
