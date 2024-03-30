import javax.swing.JOptionPane;
public class Plantas {
	private String nome;
	private String nomeCientifico;
	private String especie;
	private String habitate;
	public Plantas(String nome, String nomeCientifico, String especie, String habitate) {
		this.nome = nome;
		this.nomeCientifico = nomeCientifico;
		this.especie = especie;
		this.habitate = habitate;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getnomeCientifico() {
		return nomeCientifico;
	}
	public void setnomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public String getespecie() {
		return especie;
	}
	public void setespecie(String especie) {
		this.especie = especie;
	}
	public String gethabitate() {
		return habitate;
	}
	public void sethabitate(String habitate) {
		this.habitate = habitate;
	}
	public void getDados(){
		JOptionPane.showMessageDialog(null,
				"Dados do planta \nnome " + nome + "\nnomeCientifico: " + nomeCientifico
				+ "\nespecie:" + especie + "\nhabitate: " + habitate);
	}
}