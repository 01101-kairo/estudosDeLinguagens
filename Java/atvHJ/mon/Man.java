import javax.swing.JOptionPane;
/*
 *Realize a implementação da herança em Java. A superclasse deve conter um método
 *construtor que inicializa os valores dos atributos e um método que apresenta os
 *dados do objeto armazenado, além dos métodos get e set. As classes filhas devem
 *conter atributos específicos, faça a sobrescrita do método que apresenta os dados
 *do objeto nas classes filhas.
 */

public class Man {
	public static void main(String[] args) {
		Mamifero animal;
			String indentificacao = JOptionPane.showInputDialog("Indentificação:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
			String abtati = JOptionPane.showInputDialog("Abtati:");
			String raca = JOptionPane.showInputDialog("Raca:");
			String caracteristicas = JOptionPane.showInputDialog("Caracteristicas5:");

		animal = new Mamifero(indentificacao, idade, abtati, raca, caracteristicas);
		animal.dayMamifero();
	}
}
