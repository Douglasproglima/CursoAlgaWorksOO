package TesteDouglasEstoque;

public class Unidade {
	int codUni;
	String tag;
	String descricao;

	String caixaAlta(String texto) {
		return texto.toUpperCase();
	}

	void listar() {
		System.out.println("Código.: " + codUni + "\n" + "Tag....: " + tag.toUpperCase() + "\n" + "Unidade: "
				+ descricao.toUpperCase());
	}
}
