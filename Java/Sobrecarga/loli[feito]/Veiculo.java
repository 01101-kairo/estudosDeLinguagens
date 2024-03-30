import javax.swing.JOptionPane;
public class Veiculo{
	private String modelo;
	private double valor;
	private String marca;
	private String altomovel;

	public Veiculo(){}
	public Veiculo(String modelo, double valor, String marca, String altomovel) {
		this.modelo = modelo;
		this.valor = valor;
		this.marca = marca;
		this.altomovel = altomovel;

	}
	public Veiculo(double valor, String altomovel) {
		this.valor = valor;
		this.altomovel = altomovel;

	}
	public String getTamanho() {
		return modelo;
	}
	public void setTamanho(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return valor;
	}
	public void setPreco(double valor) {
		this.valor = valor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTecido() {
		return altomovel;
	}
	public void setTecido(String altomovel) {
		this.altomovel = altomovel;
	}

	public void dadosDoProduto(){
		JOptionPane.showMessageDialog(null, "Informações do produto;" + "\nTamanho:" + modelo 
				+ "\nPreço:" + valor 
				+ "\nMarca:" + marca
				+ "\nAltomovel:"+ altomovel);

	}
	public static void main(String[] args) {
		Veiculo vei = new Veiculo(2370.80, "carro");
		Veiculo vecu = new Veiculo("M", 70080.00, "havai50", "carro");
		vei.dadosDoProduto();
		vecu.dadosDoProduto();
	}
}
