package pessoa;

public class Servidor {
	private String competecia;
	private String salario;

	public Servidor(String competecia, String salario) {
		this.competecia = competecia;
		this.salario = salario;
	}

	public String getcompetecia() {
		return competecia;
	}

	public void setcompetecia(String competecia) {
		this.competecia = competecia;
	}

	public String getsalario() {
		return salario;
	}

	public void setsalario(String salario) {
		this.salario = salario;
	}
}