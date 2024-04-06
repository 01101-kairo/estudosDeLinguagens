package pessoa;

public class Professor {
	private String diciplina;
	private String salario;

	public Professor(String diciplina, String salario) {
		this.diciplina = diciplina;
		this.salario = salario;
	}

	public String getdiciplina() {
		return diciplina;
	}

	public void setdiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	public String getsalario() {
		return salario;
	}

	public void setsalario(String salario) {
		this.salario = salario;
	}
}