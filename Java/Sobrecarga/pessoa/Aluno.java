package pessoa;

public class Aluno {
	private String turno;
	private String turma;

	public Aluno(String turno, String turma) {
		this.turno = turno;
		this.turma = turma;
	}

	public String getturno() {
		return turno;
	}

	public void setturno(String turno) {
		this.turno = turno;
	}

	public String getturma() {
		return turma;
	}

	public void setturma(String turma) {
		this.turma = turma;
	}
}
