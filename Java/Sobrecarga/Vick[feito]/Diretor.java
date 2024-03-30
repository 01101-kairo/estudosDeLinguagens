import java.time.LocalDate;

public class Diretor {
	private LocalDate nacimento;
	private String nome;
	private String email;
	private String filmes;

	public Diretor(LocalDate nacimento, String nome, String email, String filmes) {
		this.nacimento = nacimento;
		this.nome = nome;
		this.email = email;
		this.filmes = filmes;

	}
	public LocalDate getNacimento() {
		return nacimento;
	}
	public void setNacimento(LocalDate nacimento) {
		this.nacimento = nacimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFilmes() {
		return filmes;
	}
	public void setFilmes(String filmes) {
		this.filmes = filmes;
	}
}