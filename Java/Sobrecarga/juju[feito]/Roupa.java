import javax.swing.JOptionPane;
public class Roupa{
	private String tamanho;
	private double preco;
	private String marca;
	private String peca;

	public Roupa(){
	}
	public Roupa(double preco, String marca, String peca) {
		this.preco = preco;
		this.marca = marca;
		this.peca = peca;
	}
	public Roupa(String tamanho, double preco, String marca, String peca) {
		this.tamanho = tamanho;
		this.preco = preco;
		this.marca = marca;
		this.peca = peca;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTecido() {
		return peca;
	}
	public void setTecido(String peca) {
		this.peca = peca;
	}

	public void dadosDoProduto(){
		JOptionPane.showMessageDialog(null, "Informações do produto;" + "\nTamanho:" + tamanho 
				+ "\nPreço:" + preco 
				+ "\nMarca:" + marca
				+ "\nTecido:"+ peca);
	}
	public static void main(String[] args) {

		Roupa ropa = new Roupa("M", 99.99, "Monna", "Jins");
		Roupa dinit = new Roupa(100, "Mona", "Jins");

		ropa.dadosDoProduto();
		dinit.dadosDoProduto();
	}
}
