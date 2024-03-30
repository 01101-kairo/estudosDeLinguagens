import javax.swing.JOptionPane;

public class Man {
	public static void main(String[] args) {
			String cor = JOptionPane.showInputDialog("Cor:");
			String marca = JOptionPane.showInputDialog("Marca:");
			int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Tamanho:"));

			Roupa roupa = new Roupa(cor, marca, tamanho);

			roupa.mostrarDetalhes();
	}

}
