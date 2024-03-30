public class Nome {
	private String nomePopular;
	private String nomeCientifico;

	public Nome(String nomePopular, String nomeCientifico) {
		this.nomePopular = nomePopular;
		this.nomeCientifico = nomeCientifico;
	}
	public String getTamanho() {
		return nomePopular;
	}
	public void setTamanho(String nomePopular) {
		this.nomePopular = nomePopular;
	}
	public String getTecido() {
		return nomeCientifico;
	}
	public void setTecido(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
}
