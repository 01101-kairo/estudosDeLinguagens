import javax.swing.JOptionPane;

public class Supermercado {
	private String produto;
	private String preco;
	private String marca;
	private String datadevalidade;

	public Supermecado(){
	}
	public Supermecado(String produto, String preco, String marca, String datadevalidade) {
		this.produto = produto;
		this.preco = preco;
		this.marca = marca;
		this.datadevalidade = datadevalidade;
	}
	public Supermecado(String produto, String preco) {
		this.produto = produto;
		this.preco = preco;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getpreco() {
		return preco;
	}

	public void setpreco(String preco) {
		this.preco = preco;
	}

	public String getmarca() {
		return marca;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public String getDatadevalidade() {
		return datadevalidade;
	}

	public void setdatadevalidade(String datadevalidade) {
		this.datadevalidade = datadevalidade;
	}

	public void getDados() {
		JOptionPane.showMessageDialog(null,
				"Dados do(a) produto: " + produto + "\npreco: " + preco
				+ "\nE-mail:" + marca + "\ndatadevalidade: " + datadevalidade);
	}
	public static void main(String[] args) {
		Supermecado maga = new Supermecado("Nutela", "11.99", "Nutela", "12/11/23");
		Supermecado mega = new Supermecado("Melao", "15.60");
		
		maga.getDados();
		mega.getDados();
	}
}