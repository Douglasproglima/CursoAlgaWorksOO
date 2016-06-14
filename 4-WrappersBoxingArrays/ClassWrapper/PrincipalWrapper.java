package ClassWrapper;

public class PrincipalWrapper {
	public static void main(String[] args) {
		/*Class wrappers são a extensão dos tipos primitivos:
		 * byte		- Byte
		 * short	- Short
		 * int		- Interger
		 * long		- Long
		 * float	- Float
		 * double	- Double
		 * char		- Character
		 * */
		
		Integer a1 = new Integer(10);
		//ou
		Integer a2 = 10; //Este processo é chamado de boxing, faz a conversão automática;
		
		
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		//Se o intervalo do número armazenado estiver entre -127 a 127
		//O Java armazena em um único objeto, por isso é true, pois está
		//apontando para o mesmo local na memória, Perigoso!!!
		System.out.println(i1 == i2);
		
		//No caso do -128 ele armazena em objetos diferentes na memória
		//Como 128 é > -128 são objetos diferentes, locura!!!
		System.out.println(i3 == i4);
		
		/* Na objetos o valor irá ocorre da mesma forma, true quando utilizado o operador ==
		 * O correto é utilizar o método equals() - Ex: i1.equals(i2)
		 * Booleans
		 * Byte
		 * Short
		 * Integer
		 * Character -> No intervalo unicode 0000 a 007F 
		 * */
		
		System.out.println(i1.equals(i2));
		System.out.println(i3.equals(i3));
		
	}
}
