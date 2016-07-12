package RevisaoPolimorfismoEInterfaces;

public class SistemaInterno {
	public void autentica(Autenticavel f){
		int senha = 123; //Informação passada pelo usuário no teclado ou algo do tipo
		
		if(f.autentica(senha) == true){
			System.out.println("Bem vindo ao sistema!");
		}else{
			System.out.println("Senha incorreta!");
		}
	}
}
