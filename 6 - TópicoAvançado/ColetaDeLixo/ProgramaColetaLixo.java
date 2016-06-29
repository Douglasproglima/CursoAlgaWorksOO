package ColetaDeLixo;

import Interfaces.NotaFiscal;
import SobrecargaMetodos.Pessoa;

public class ProgramaColetaLixo {
	public static void main(String[] args){
		/*Quando se cria um objeto o mesmo fica armazenado na memória heap
		 * Carro carro    = -----> objeto1
		 * NotaFiscal nfe = -----> objeto2
		 * Pessoa pessoa  = -----> objeto3
		 * */
		
		NotaFiscal nfe = new NotaFiscal(132456);
		nfe.imprimirAlgo();
		
		//Elimina a referência do objeto na mémoria. Obs: O objeto2 ainda está na heap
		nfe = null;
		
		//Erro de NullPointerException -> O objeto não tem referência para o objeto
		nfe.imprimirAlgo();
		
		//É neste momento que entra o garbage coletion, ele verifica se os objetos na healp estão instanciados
		//se não estiver ele elimina o objeto da mémoria heap.
		 
	}
}
