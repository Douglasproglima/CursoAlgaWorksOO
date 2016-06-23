package DesafioPolimorfismoDevMedia;

public class ProgramaPolimorfismoDevMedia {
	public static void main(String[] args){
		Fisica p1 = new Fisica();
		p1.setNome("Fernando");
		p1.setCpf("569.478.546-01");
		System.out.println("Nome: " + p1.getNome() + "(" + p1.getCpf() +")");
		
		Juridica p2 = new Juridica();
		p2.setNome("GM Motors Company");
		p2.setCnpj("42.222.366/0001-55");
		System.out.println("Empresa: " + p2.getNome() + "(" + p2.getCnpj() + ")");
	}
}
