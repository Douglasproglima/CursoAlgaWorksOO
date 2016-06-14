package TesteDouglasEstoque;

public class ProgramaEstoque {

	public static void main(String[] args) {
		Unidade unid = new Unidade();
		unid.codUni = 1;
		unid.tag = "un";
		unid.descricao = "unidade";

		System.out.println("Cadastro de Unidade");
		unid.listar();

		Material pneu = new Material();
		pneu.codMat = 1;
		pneu.tag = "001";
		pneu.descricao = "pneu pirelli";
		pneu.ativo = true;
		pneu.valorCompra = 159.57;
		pneu.valorVenda = 170.57;
		pneu.unidadeMat = unid;

		System.out.println("\n Cadastro de Material");
		pneu.listar();

		Estoque estoquePneu = new Estoque();
		estoquePneu.codEst = 1;
		estoquePneu.codMat = pneu;
		estoquePneu.codUni = pneu.unidadeMat;
		estoquePneu.qtdeMax = 100;
		estoquePneu.qtdeMin = 1;
		estoquePneu.saldo = 500;
		double valorTotal = estoquePneu.atualizaValorTotal(pneu, estoquePneu.saldo, pneu.valorCompra);

		System.out.println("\n Estoque de Material");
		System.out.println("Saldo Anterior: " + estoquePneu.saldo + 
						   "\n" + "Valor Total...: " + valorTotal + "\n");
		estoquePneu.saida(pneu, 50);
		estoquePneu.atualizaValorTotal(pneu, estoquePneu.saida(pneu, 50), pneu.valorCompra);
		estoquePneu.listar();
	}

}
