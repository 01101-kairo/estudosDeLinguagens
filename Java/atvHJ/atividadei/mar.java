import javax.swing.JOptionPane;

class Professor{
	private String nome, sexo, CPF, diciplina, graduacoes, tempodeserviso;
	private int idade;
	public Professor(String nome,String  sexo,String  CPF,String  diciplina,String  graduacoes,String  tempodeserviso, int idade){
		this.nome = nome;
		this.sexo = sexo;
		this.CPF = CPF;
		this.diciplina = diciplina;
		this.graduacoes = graduacoes;
		this.tempodeserviso = tempodeserviso;
		this.idade = idade;

	}
	
	public void exib(){
		JOptionPane.showMessageDialog(null,
				+"\n"+nome
				+"\n"+sexo
				+"\n"+CPF
				+"\n"+diciplina
				+"\n"+graduacoes
				+"\n"+tempodeserviso);


	}
}

import javax.swing.JOptionPane;
class Aluno{
	private String nome, sexo, CPF, curso, periodo, diciplinas;
	private int idade;
	public Aluno(String nome,String  sexo,String  CPF,String  curso,String  periodo,String  diciplinas, int idade){
		this.nome = nome;
		this.sexo = sexo;
		this.CPF = CPF;
		this.curso = curso;
		this.periodo = periodo;
		this.diciplinas = diciplinas;
		this.idade = idade;

	}
	public void exib(){
		JOptionPane.showMessageDialog(null,
				"\n"+nome
				+"\n"+sexo
				+"\n"+CPF
				+"\n"+curso
				+"\n"+periodo
				+"\n"+diciplina
				+"\n"+idade);

	}
}
