package DesafioSobrecarga;

public class MaquinaCafe {

	int acucarDisponivel;
	
	void fazerCafe(int qtdeAcucar){
		if(acucarDisponivel < qtdeAcucar){
			System.out.println("1 - Não há açucar suficiente para fazer o café.");
		}else{
			acucarDisponivel -= qtdeAcucar;
			System.out.println("1 - Fazendo café com " + qtdeAcucar + " gramas de açucar.");
		}
	}

	//Sobrecarga do método fazerCafe()
	void fazerCafe(){
		fazerCafe(10);
	}
}
