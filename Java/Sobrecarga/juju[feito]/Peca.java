package juju;
public class Peca {
	private String pecaIntima;
	private String camisa;
	private String calsa;
	private String vestido;

	public Peca(String pecaIntima, String camisa, String calsa, String vestido) {
		this.pecaIntima = pecaIntima;
		this.camisa = camisa;
		this.calsa = calsa;
		this.vestido = vestido;
	}
	public String getAlgodao() {
		return pecaIntima;
	}
	public void setAlgodao(String pecaIntima) {
		this.pecaIntima = pecaIntima;
	}
	public String getElastano() {
		return camisa;
	}
	public void setElastano(String camisa) {
		this.camisa = camisa;
	}
	public String getPoliester() {
		return calsa;
	}
	public void setPoliester(String calsa) {
		this.calsa = calsa;
	}
	public String getMalha() {
		return vestido;
	}
	public void setMalha(String vestido) {
		this.vestido = vestido;
	}
}
