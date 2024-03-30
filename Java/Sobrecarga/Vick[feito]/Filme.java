import javax.swing.JOptionPane;

public class Filme {
	private String titulo;
	private double orcamento;
	private String diretor;
	private String categoria;

	public Filme(){}
	public Filme(String titulo, String diretor, String categoria) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.categoria = categoria;

	}
	public Filme(String titulo, double orcamento, String diretor, String categoria) {
		this.titulo = titulo;
		this.orcamento = orcamento;
		this.diretor = diretor;
		this.categoria = categoria;

	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void infoDoFilme(){
		JOptionPane.showMessageDialog(null, "Informações:" + "\nTitulo:" + titulo
				+ "\ncategoria:"+ categoria
				+ "\nOrcamento:" + orcamento
				+ "\nDiretor:" + diretor);
	}
	public static void main(String[] args) {
		Filme move = new Filme("halloween","John Carpente","Slasher");
		Filme movi = new Filme("halloween", 255.60, "John Carpente","Slasher");

		move.infoDoFilme();
		movi.infoDoFilme();
	}
}
