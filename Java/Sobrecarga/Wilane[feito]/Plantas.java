import javax.swing.JOptionPane;

public class Plantas{
	private String nome;
	private String carac;
	private String especie;
	private String habitate;

	public Plantas(){}
	public Plantas(String nome, String carac){
		this.nome = nome;
		this.carac = carac;
	}
	public Plantas(String nome, String especie, String habitate){
		this.nome = nome;
		this.especie = especie;
		this.habitate = habitate;
	}
	public String getnome(){
		return nome;
	}
	public void setnome(String nome){
		this.nome = nome;
	}
	public String getCarac() {
		return carac;
	}
	public void setCarac(String carac) {
		this.carac = carac;
	}
	public String getespecie(){
		return especie;
	}
	public void setespecie(String especie){
		this.especie = especie;
	}
	public String gethabitate(){
		return habitate;
	}
	public void sethabitate(String habitate){
		this.habitate = habitate;
	}
	public void getDados(){
		JOptionPane.showMessageDialog(null,
				"Dados do planta \nnome " + nome
				+ "\ncaracteres:"+ carac
				+ "\nespecie:"+ especie
				+ "\nhabitate: " + habitate);
	}
	public static void main(String[] args) {
		Plantas plat = new Plantas("Rosa", "espinhos");
		Plantas plata = new Plantas("Rosa", "Rosetas", "regioes frias");

		plat.getDados();
		plata.getDados();
	}
}
