package pessoa;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Pessoa {
	protected String nome;
	protected String mail;
	protected String sexo;
	protected LocalDate dataNasc;
	protected String CPF;
	protected Aluno aluno;
	protected Professor professor;
	protected Servidor servidor;

	public Pessoa(String nome, String mail, String sexo, LocalDate dataNasc, String CPF, Aluno aluno,
			Professor professor, Servidor servidor) {
		this.nome = nome;
		this.mail = mail;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.CPF = CPF;
		this.aluno = aluno;
		this.professor = professor;
		this.servidor = servidor;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getsexo() {
		return sexo;
	}

	public void setsexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDate getdataNasc() {
		return dataNasc;
	}

	public void setdataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public void getDados() {
		JOptionPane.showMessageDialog(null,
				"Dados do(a) " + nome
						+ "\nE-mail:" + mail
						+ "\nsexo: " + sexo
						+ "\ndataNasc:" + dataNasc
						+ "\nCPF: " + CPF);
	}
}
