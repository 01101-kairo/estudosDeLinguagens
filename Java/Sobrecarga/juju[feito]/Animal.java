import javax.swing.JOptionPane;

public class Animal{
	private String nome;
	private String raca;
	private String especie;
	private String abitate;

	public Animal(){}

	public Animal(String nome,String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	public Animal(String nome,String raca,String especie, String abitate, Animalia animalia) {
		this.nome = nome;
		this.raca = raca;
		this.especie = especie;
		this.abitate = abitate;
	}

	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getabitate() {
		return abitate;
	}
	public void setabitate(String abitate) {
		this.abitate = abitate;
	}

	public void dadosDoProduto(){
		JOptionPane.showMessageDialog(null, "Informações:" + "\nnome:"+nome 
				+"\nRaca:"+raca
				+"\nespecie:"+especie
				+ "\nAbitate:" + abitate);
	}
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe o nome:");
		String raca = JOptionPane.showInputDialog("Informe a raca:");
		String especie = JOptionPane.showInputDialog("Informe a especie:");
		String abitate = JOptionPane.showInputDialog("Informe o abitate:");
		String nomeado = ("cavalo");
		String raca1 = ("cavaleiro");

		Animal ani = new Animal(nomeado, raca1);
		Animal ana = new Animal(nome, raca, especie, abitate);

		ani.dadosDoProduto();
		ana.dadosDoProduto();
	}
}