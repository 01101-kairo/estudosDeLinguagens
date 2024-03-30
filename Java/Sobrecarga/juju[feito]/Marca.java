package juju;
public class Marca {
	private String chanel;
	private String lacoste;
	private String supreme;
	private String versace;

	public Marca(String chanel, String lacoste, String supreme, String versace) {
		this.chanel = chanel;
		this.lacoste = lacoste;
		this.supreme = supreme;
		this.versace = versace;
	}
	public String getNike() {
		return chanel;
	}
	public void setNike(String chanel) {
		this.chanel = chanel;
	}
	public String getLacoste() {
		return lacoste;
	}
	public void setLacoste(String lacoste) {
		this.lacoste = lacoste;
	}
	public String getAdidas() {
		return supreme;
	}
	public void setAdidas(String supreme) {
		this.supreme = supreme;
	}
	public String getAcostamento() {
		return versace;
	}
	public void setAcostamento(String versace) {
		this.versace = versace;
	}
}
