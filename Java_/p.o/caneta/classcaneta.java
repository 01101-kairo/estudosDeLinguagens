package Caneta;

public class classcaneta{
	String modelo;
	String cor;
	float ponta;
	int	carga;
	boolean tampada;
	void status(){
		/*System.out.print("Uma caneta" +this.cor);
		System.out.print("esta tampada?"+this.tampada);*/	
	}
	void tampar(){
		this.tampada = true;
	}
	void dtampa(){
		this.tampada = false;
	}
}
