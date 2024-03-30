package atividadei;

import javax.swing.JOptionPane;

public class Main{

    public static void main(String args[]) {
        String titular = JOptionPane.showInputDialog("Informe o titular:");
        String agencia = JOptionPane.showInputDialog("Digite a agência:");
        String numero = JOptionPane.showInputDialog("Digite o número:");
        String tipo = JOptionPane.showInputDialog("Informe o tipo:");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo:"));
        double limiteSaque = Double.parseDouble(JOptionPane.showInputDialog("Informe o limite de saque:"));
        
        Conta conta1 = new Conta(titular, agencia, numero, tipo, saldo, limiteSaque);
        
        conta1.mostrarDetalhes();
    }
}
