import javax.swing.JOptionPane;
import java.time.LocalDate;
/*
 *Realize a implementação da herança em Java. A superclasse deve conter um método
 *construtor que inicializa os valores dos atributos e um método que apresenta os
 *dados do objeto armazenado, além dos métodos get e set. As classes filhas devem
 *conter atributos específicos, faça a sobrescrita do método que apresenta os dados
 *do objeto nas classes filhas.
 */

public class Main {
	public static void main(String[] asalarios) {
		Pessoa pessoa;
			String nome = JOptionPane.showInputDialog("nome:");
			String sexo = JOptionPane.showInputDialog("sexo:");
			LocalDate dataNasc = Integer.parseInt(JOptionPane.showInputDialog("data de nacimento:"));
			String CPF = JOptionPane.showInputDialog("CPF:");
			
		pessoa = new Pessoa(nome, sexo, dataNasc, CPF);
		pessoa.getDados();
	}
}
