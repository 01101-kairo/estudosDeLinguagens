public class rosa extends Plantas{
	private String cor;
	private String tamanho;
	public rosa(String nome, String nomeCientifico, String especie, String habitate, String cor, String tamanho){
		super(nome, nomeCientifico, especie, habitate);
		this.cor = cor;
		this.tamanho = tamanho;
	}
	public String getcor() {
		return cor;
	}
	public void setcor(String cor) {
		this.cor = cor;
	}
	public String gettamanho() {
		return tamanho;
	}
	public void settamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}