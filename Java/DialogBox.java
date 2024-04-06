import javax.swing.JOptionPane;
public class DialogBox {
	public static void main(String[] args){
		String n;
		StringBuilder mensagem = new StringBuilder();

		n = JOptionPane.showInputDialog(" Digite seu nome: ");
		mensagem.append(" Bem-vindo ").append(n).append(" ! ");
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
