package Strings_;
import java.util.Scanner;

class AnoBissexto{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		
		int teste = ano % 400;
		System.out.print("Teste: "+teste+"\n\n");
		
		if(ano % 400 == 0){
			System.out.println("O ano " + ano + " eh um ano bissexto!");
		}else if(ano % 4 == 0){
			if(ano % 100 != 0){
				System.out.println("O ano " + ano + " eh um ano bissexto!");
			}else{
				System.out.println("O ano " + ano + " nao eh um ano bissexto!");
			}
		}else{
			System.out.println("O ano " + ano + " nao eh um ano bissexto!");
		}
	}
}