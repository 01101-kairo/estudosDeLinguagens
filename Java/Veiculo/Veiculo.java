import javax.swing.JOptionPane;
public class Veiculo{
	private String cor;
	private double preco;
	private String marca;
	

	public Veiculo(){
	}
	public Veiculo(double preco, String marca) {
		this.preco = preco;
		this.marca = marca;
	}
	public Veiculo(String cor, double preco, String marca) {
		this.cor = cor;
		this.preco = preco;
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
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
	
	public void dadosDoProduto(){
		JOptionPane.showMessageDialog(null, "Informações do produto;" + "\nCor:" + cor 	+ "\nPreço:" + preco + "\nMarca:" + marca);
	}
	public static void main(String[] args) {

		Veiculo veculo = new Veiculo("Branco", 98.000, "Chevrolet");
		Veiculo veiculo = new Veiculo(98.000, "Chevrolet");

		veculo.dadosDoProduto();
		veiculo.dadosDoProduto();
	}
}
