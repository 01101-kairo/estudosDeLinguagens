package revisao;

import javax.swing.JOptionPane;

public class Revisao {

	public static void main(String[] args) {
		Aluno joao = new Aluno(
				JOptionPane.showInputDialog("Digite o nome do aluno:"),
				JOptionPane.showInputDialog("Digite a matrícula:"));

		joao.setNotas();
		joao.getNotas();
		joao.getBoletim();
	}
}
