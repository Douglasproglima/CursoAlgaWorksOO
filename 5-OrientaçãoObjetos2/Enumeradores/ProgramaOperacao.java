package Enumeradores;

public class ProgramaOperacao {
	public static void main(String[] args) {
		OperacaoAritmetica opA1 =  OperacaoAritmetica.ADICAO;
		
		int resultadoOp = opA1.operacao(5, 95);
		System.out.println(resultadoOp);
		
		//Percorrendo o Enum - For avançado
		for(OperacaoAritmetica opA2 : OperacaoAritmetica.values()){
			System.out.println(opA2 + "->" + opA2.operacao(10, 2));
		}
		
	}
}
