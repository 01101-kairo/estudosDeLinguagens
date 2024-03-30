// package poo2;
import java.time.LocalDate;

import javax.swing.JOptionPane;
public class Servidor extends Pessoa{
	private String competecia;
	private String salario;
	public Servidor(String nome, LocalDate dataNasc, String sexo, String CPF, String competecia, String salario){
				super(nome, sexo, dataNasc, CPF);
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
	@Override
	public void getDados(){
		JOptionPane.showMessageDialog(null, 
		"Dados do animal" + nome 
		+ "\ncompetecia:" + competecia 
		+ "\nsalario:" + salario 
		+ "\nsexo:" + sexo 
		+ "\ndataNasc:" + dataNasc 
		+ "\nCPF:"+ CPF);
	}
}