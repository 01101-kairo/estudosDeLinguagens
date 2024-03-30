import java.time.LocalDate;
import javax.swing.JOptionPane;
public class Professor extends Pessoa{
	private String diciplina;
	private String salario;
	public Professor(String nome, String sexo, LocalDate dataNasc, String CPF, String diciplina, String salario){
		super(nome, sexo, dataNasc, CPF);
		this.diciplina = diciplina;
		this.salario = salario;
	}
	public String getdiciplina() {return diciplina;}
	public void setdiciplina(String diciplina) {this.diciplina = diciplina;}
	public String getsalario() {return salario;}
	public void setsalario(String salario) {this.salario = salario;}
	@Override
	public void getDados(){
		JOptionPane.showMessageDialog(null, 
		"Dados do animal" + nome 
		+ "\ndiciplina:" + diciplina 
		+ "\nsalario:" + salario 
		+ "\nsexo:" + sexo 
		+ "\ndataNasc:" + dataNasc 
		+ "\nCPF:"+ CPF);
 
	}
}