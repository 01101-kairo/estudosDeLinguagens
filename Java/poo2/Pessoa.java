import javax.swing.JOptionPane;
import java.time.LocalDate;
public class Pessoa {
	protected String nome;
	protected String sexo;
	protected LocalDate dataNasc;
	protected String CPF;
	public Pessoa(String nome, String sexo, LocalDate dataNasc, String CPF) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.CPF = CPF;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
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
	public void getDados(){
		JOptionPane.showMessageDialog(null,
				"Dados do Pessoa \nnome " + nome 
				+ "\nsexo: " + sexo
				+ "\ndataNasc:" + dataNasc 
				+ "\nCPF: " + CPF);
	}
}