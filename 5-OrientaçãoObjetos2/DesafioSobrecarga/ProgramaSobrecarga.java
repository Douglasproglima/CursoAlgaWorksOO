package DesafioSobrecarga;

public class ProgramaSobrecarga {
	public static void main(String[] args){
		MaquinaCafe mc1 = new MaquinaCafe();
		mc1.acucarDisponivel = 55;
		mc1.fazerCafe(10);
		mc1.fazerCafe(65);
	}
}