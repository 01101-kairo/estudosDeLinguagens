import javax.swing.JOptionPane;
/*
 *Realize a implementação da herança em Java. A superclasse deve conter um método
 *construtor que inicializa os valores dos atributos e um método que apresenta os
 *dados do objeto armazenado, além dos métodos get e set. As classes filhas devem
 *conter atributos específicos, faça a sobrescrita do método que apresenta os dados
 *do objeto nas classes filhas.
 */

public class Main {
	public static void main(String[] args) {
		Plantas planta;
			String nome = JOptionPane.showInputDialog("nome:");
			String nomeCientifico = JOptionPane.showInputDialog("nomeCientifico:");
			String especie = JOptionPane.showInputDialog("especie:");
			String habitate = JOptionPane.showInputDialog("habitate:");
			
		planta = new Plantas(nome, nomeCientifico, especie, habitate);
		planta.getDados();
	}
}
