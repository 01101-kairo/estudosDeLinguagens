import javax.swing.JOptionPane;
import java.time.LocalDate;
public class Aluno extends Pessoa{
	private String turno;
	private String turma;

	public Aluno(String nome, String sexo, LocalDate dataNasc, String CPF, String turno, String turma){
		super(nome, sexo, dataNasc, CPF);
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
	@Override
	public void getDados(){
		JOptionPane.showMessageDialog(null, 
		"Dados do animal" + nome 
		+ "\nturno:" + turno 
		+ "\nturma:" + turma 
		+ "\nsexo:" + sexo 
		+ "\ndataNasc:" + dataNasc 
		+ "\nCPF:"+ CPF);
 
	}
}