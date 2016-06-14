package EncapsulamentoModificadorAcesso;

public class ArCondicionado {
	/*Modificadores de acesso
	 * Private - Os membros da classe definidos como não podem ser acessados ou usados por 
	 * 			 nenhuma outra classe. Esse modificador não se aplica às classes, somente 
	 * 			 para seus métodos e atributos. Esses atributos e métodos também não podem 
	 * 			 ser visualizados pelas classes herdadas;
	 * 
	 * Public  - Uma declaração com o modificador public pode ser acessada de qualquer lugar 
	 * 			 e por qualquer entidade que possa visualizar a classe a que ela pertence;
	 * 
	 * Protectd- O modificador protected torna o membro acessível às classes do mesmo pacote 
	 * 			 ou através de herança, seus membros herdados não são acessíveis a outras 
	 * 			 classes fora do pacote em que foram declarados;
	 * 
	 * Final   - Quando é aplicado na classe, não permite estende-la, nos métodos impede que 
	 * 			 o mesmo seja sobrescrito (overriding) na subclasse, e nos valores de 
	 * 			 variáveis não pode ser alterado depois que já tenha sido atribuído um valor;
	 * 
	 * Abstract- Esse modificador não é aplicado nas variáveis, apenas n as classes. 
	 * 			 Uma classe abstrata não pode ser instanciada, ou seja, não pode ser chamada 
	 * 			 pelos seus construtores. Se houver alguma declaração de um método como 
	 * 			 abstract (abstrato), a classe também deve ser marcada como abstract;
	 * 
	 * Static  - É usado para a criação de uma variável que poderá ser acessada por todas 
	 * 			 as instâncias de objetos desta classe como uma variável comum, ou seja, a 
	 * 			 variável criada será a mesma em todas as instâncias e quando seu conteúdo é 
	 * 			 modificado numa das instâncias, a modificação ocorre em todas as demais. 
	 * 			 E nas declarações de métodos ajudam no acesso direto à classe, portanto não 
	 * 			 é necessário instanciar um objeto para acessar o método;
	 * */
	
	private int temperatura;
	
	void validarTemp(int temperatura){
		if(temperatura >= 0 && temperatura <= 34){
			this.temperatura = temperatura;
		}
	}
	
	int getTemperatura(){
		return temperatura;
	}
}
