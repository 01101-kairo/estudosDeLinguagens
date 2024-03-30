package DicionárioWeb;
public class Dicionário {
	private String palavra;
	private String conceito;
	private String sinonimo, exemplo, antonimo;

	public Dicionário(String palavra, String conceito) {
		this.palavra = palavra;
		this.conceito = conceito;
	}

	public Dicionário (String sinonimo, String exemplo, String antonimo) {
		this.sinonimo = sinonimo;
		this.exemplo = exemplo;
		this.antonimo = antonimo;
	}
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public String getConceito() {
		return conceito;
	}
	public void setConceito(String conceito) {
		this.conceito = conceito;
	}
	public static void main(String[] args) {
		Dicionário dic = new Dicionário("Emancipação", "Tornar-se independente");
		Dicionário dici = new Dicionário("Liberdade e Alforria", "Eu pedi pedi emancipação quando completei 16 anos.", "Escravidão");
		System.out.println("Palavra:"+ dic.palavra);
		System.out.println("Conceito:"+ dic.conceito);
		System.out.println("Exemplo:"+ dici.exemplo);
		System.out.println("Sinônimo:"+ dici.sinonimo);
		System.out.println("Antônimo:"+ dici.antonimo);
	}
}
