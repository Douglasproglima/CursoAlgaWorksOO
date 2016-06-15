package Enumeradores;

public enum OperacaoAritmetica {
	//Enums e seus métodos;
	ADICAO{
		public int operacao(int num1, int num2){
			return num1 + num2;
		}
	},
	SUBTRACAO{
		public int operacao(int num1, int num2){
			return num1 - num2;
		}
	},
	MULTIPLICACAO{
		public int operacao(int num1, int num2){
			return num1 * num2;
		}
	},
	DIVISAO{
		public int operacao(int num1, int num2){
			return num1 / num2;
		}
	};
	
	//Assinatura do método com a palavra reserva abstract;
	public abstract int operacao(int num1, int num2);
}