public class Biscoito {
	private static String Datadevalidade;
	private String sabor;
	private String quantidade;

	public biscoito(String validadedoproduto, String sabor, String quantidade){
		this.sabor = sabor;
		this.quantidade = quantidade;
	}

	public String getsabor() {
		return sabor;
	}

	public void setsabor(String sabor) {
		this.sabor = sabor;
	}

	public String getquantidade() {
		return quantidade;
	}

	public void setquantidade(String quantidade) {
		this.quantidade = quantidade;
	}
}