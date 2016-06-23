package Enumeradores;

public enum OpcoesMenu {
	SALVAR(1), IMPRMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);
	
	private final int valor;
	private OpcoesMenu(int valorOpcao) {
		this.valor = valorOpcao;
	}
	
	public int getValor(){
		return this.valor;
	}
}
