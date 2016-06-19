package DesafioSobrecarga;

public class MaquinaCafe {

	int acucarDisponivel;

	void fazerCafe(){
		if(acucarDisponivel < 10){
			System.out.println("2 - Não há açucar suficiente para fazer o café.");
		}else{
			acucarDisponivel-=10;
			System.out.println("2 - Fazendo café com 10 gramas de açucar.");
		}
	}	
	
	void fazerCafe(int qtdeAcucar){
		if(acucarDisponivel < qtdeAcucar){
			System.out.println("1 - Não há açucar suficiente para fazer o café.");
		}else{
			acucarDisponivel -= qtdeAcucar;
			System.out.println("1 - Fazendo café com " + qtdeAcucar + " gramas de açucar.");
		}
	}
}
