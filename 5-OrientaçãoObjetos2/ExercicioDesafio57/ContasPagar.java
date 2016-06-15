package ExercicioDesafio57;

public class ContasPagar {
	private String descricao;
	private String data;
	private Double valor;
	
	private FornecedorBean fornecedor;
	
	//Construtor default;
	public ContasPagar(){
		
	}
	
	//Sobrecarga do construtor passando todos os atributos;
	public ContasPagar(FornecedorBean fornecedor, String descricao, String data, Double valor){
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}
	
	//Métodos gettes e setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public FornecedorBean getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(FornecedorBean fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void pagar(){
		System.out.println("Fornecedor: " + fornecedor.getNome() + "\n"+
						   "Conta.....: " + getDescricao() +  "\n"+
						   "Data Venc.: " + getData() + "\n"+
						   "Valor.....: " + getValor() + "\n");		
	}
	
}
