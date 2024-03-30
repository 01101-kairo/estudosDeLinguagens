import javax.swing.JOptionPane;

public class Aparelho {
	private String marca;
	private String celular;
	private String preco,memoria, cor;

	public Aparelho(){
	}
	public Aparelho (String marca, String preco, String cor) {
		this.marca = marca;
		this.preco = preco;
		this.cor = cor;
	}
	public Aparelho (String marca, String celular, String preco, String memoria, String cor) {
		this.marca = marca;
		this.celular = celular;
		this.preco = preco;
		this.memoria = memoria;
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void getDados() {
		JOptionPane.showMessageDialog(null,
				"Dados do(a) Aparelho: " + marca 
				+ "\ncelular: " + celular
				+ "\npreco:"+preco
				+"\nmemoria:"+memoria
				+"\ncor:"+cor);
	}
	public static void main(String[] args) {
		Aparelho apa = new Aparelho("marca","celular","preco","memoria","cor");
		Aparelho apare = new Aparelho("marca","preco","cor");

		apa.getDados();
		apare.getDados();
	}
}
