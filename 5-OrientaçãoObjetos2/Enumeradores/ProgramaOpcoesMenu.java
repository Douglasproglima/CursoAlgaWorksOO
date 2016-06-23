package Enumeradores;

public class ProgramaOpcoesMenu {
	public static void escolherOpcao(OpcoesMenu opcao){
		if (opcao == OpcoesMenu.SALVAR) {
			System.out.println("Salvou a bagaça!");
		}
		
		if (opcao == OpcoesMenu.IMPRMIR) {
			System.out.println("Impriu a bagaça!");
		}
		
		if (opcao == OpcoesMenu.ABRIR) {
			System.out.println("Abriu a bagaça!");
		}
		
		if (opcao == OpcoesMenu.VISUALIZAR) {
			System.out.println("Viu a bagaça!");
		}
		
		if (opcao == OpcoesMenu.FECHAR) {
			System.out.println("Fechou a bagaça!");
		}
	}
	
	public static void main(String[] args) {
		escolherOpcao(OpcoesMenu.ABRIR);
	}
}
