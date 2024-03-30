import javax.swing.JOptionPane;
public class Produto {
	private String preco;
	private String codigo;
	private String ano;
	private String sessao;
	private String livro;

	public Produto(){}
	public Produto(String preco, String livro) {
		this.preco = preco;
		this.livro = livro;
	}
	public Produto(String preco, String codigo, String ano, String sessao, String livro) {
		this.preco = preco;
		this.codigo = codigo;
		this.ano = ano;
		this.sessao = sessao;
		this.livro = livro;
	}
	public String getpreco() {
		return preco;
	}
	public void setpreco(String preco) {
		this.preco = preco;
	}
	public String getcodigo() {
		return codigo;
	}
	public void setcodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getano() {
		return ano;
	}
	public void setano(String ano) {
		this.ano = ano;
	}
	public String getsessao() {
		return sessao;
	}
	public void setsessao(String sessao) {
		this.sessao = sessao;
	}
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public void getDados(){
		JOptionPane.showMessageDialog(null,
				"Dados do produto \npreco " + preco + "\ncodigo: " + codigo
				+ "\nano:" + ano + "\nsessao: " + sessao +"\nlivro:" + livro);
	}

	public static void main(String[] args) {
		Produto pro = new Produto("12.99", "Pequeno principe");
		Produto prop = new Produto("12.99","121234e34556835608-12", "1943","infantil","Pequeno principe");
		pro.getDados();
		prop.getDados();
	}
}
