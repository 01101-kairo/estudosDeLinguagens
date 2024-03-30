public class Celular extends Aparelho{
	private String memoria;
	private String modelo;
	public Celular(String marca, String Cor, String preco, String numerDlinha,
			String memoria, String modelo){

		super(marca, Cor, preco, numerDlinha);
		this.memoria = memoria;
		this.modelo = modelo;
	}
	public String getmemoria() {
		return memoria;
	}
	public void setmemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
}