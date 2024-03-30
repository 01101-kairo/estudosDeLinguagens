public class Livro {
	private String titulo;
	private String autor;
	private String isbn;

	public Livro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getautor() {
		return autor;
	}
	public void setautor(String autor) {
		this.autor = autor;
	}
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
}
