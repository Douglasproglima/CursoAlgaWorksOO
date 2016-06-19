package Sobreposicao;

import java.util.Date;

public class ProgramaSobreposicao {
	public static void main(String[] args) {
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Fardo de Coca-Cola.";
		pp.dataValidade = new Date();
		pp.identificar();
	}
}
