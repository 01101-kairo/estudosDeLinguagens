public class Categoria {
	private String drama;
	private String terror;
	private String acaoAventura;
	private String ficcaoCientifica;

	public Categoria(String drama, String terror, String acaoAventura, String ficcaoCientifica) {
		this.drama = drama;
		this.terror = terror;
		this.acaoAventura = acaoAventura;
		this.ficcaoCientifica = ficcaoCientifica;

	}
	public String getNike() {
		return drama;
	}
	public void setNike(String drama) {
		this.drama = drama;
	}
	public String getLacoste() {
		return terror;
	}
	public void setLacoste(String terror) {
		this.terror = terror;
	}
	public String getAdidas() {
		return acaoAventura;
	}
	public void setAdidas(String acaoAventura) {
		this.acaoAventura = acaoAventura;
	}
	public String getAcostamento() {
		return ficcaoCientifica;
	}
	public void setAcostamento(String ficcaoCientifica) {
		this.ficcaoCientifica = ficcaoCientifica;
	}

}