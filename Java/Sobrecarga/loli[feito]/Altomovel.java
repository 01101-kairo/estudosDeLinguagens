public class Altomovel{
	private String carro;
	private String moto;
	private String caminhonete;
	private String trato;

	public Altomovel(String carro, String moto, String caminhonete, String trato) {
		this.carro = carro;
		this.moto = moto;
		this.caminhonete = caminhonete;
		this.trato = trato;
	}
	public String getAlgodao() {
		return carro;
	}
	public void setAlgodao(String carro) {
		this.carro = carro;
	}
	public String getElastano() {
		return moto;
	}
	public void setElastano(String moto) {
		this.moto = moto;
	}
	public String getPoliester() {
		return caminhonete;
	}
	public void setPoliester(String caminhonete) {
		this.caminhonete = caminhonete;
	}
	public String getMalha() {
		return trato;
	}
	public void setMalha(String trato) {
		this.trato = trato;
	}
}
