package revisao;

import javax.swing.JOptionPane;

public class Aluno {
	private String nome;
	private String matricula;
	private double N1, N2, N3, N4, media;
	private String situacao;

	public Aluno(String nome, String matricula){
		this.nome = nome;
		this.matricula = matricula;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public String getMatricula(){
		return matricula;
	}
	public void setNotas(){
		this.N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 1º bimestre:"));
		this.N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 2º bimestre:"));
		this.N3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 3º bimestre:"));
		this.N4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 4º bimestre:"));
	}
	public void calcularMedia(){
		media = (N1+N2+N3+N4)/4;
	}
	public double getMedia(){
		calcularMedia();
		return media;
	}
	public void setSituacao(){
		calcularMedia();
		if(media >= 7){
			situacao = "Aprovado";
		} else {
			situacao = "Recuperação";
		}
	}
	public String getSituacao(){
		setSituacao();
		return situacao;
	}
	public void getNotas(){
		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + "\n1º BIM: " + N1 + "\n2º BIM: "
				+ N2 + "\n3º BIM: " + N3 + "\n4º BIM: " + N4 + "\nMédia: " + getMedia());
	}
	public void getBoletim(){
		JOptionPane.showMessageDialog(null,
				"Aluno(a) " + nome + "\nMatrícula: " + matricula + "\nMédia: " + getMedia()
				+ "\nSituação: " + getSituacao());
	}
}
