package poo3;
import javax.swing.JOptionPane;
public class Conta {
	private String titular;
	private int agencia, numero;
	private double saldo, limite;
	public Conta(String titular, int agencia, int numero, double saldo, double limite) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	public Conta(){}
	public void sacar(double valor){
		if(valor <= saldo){
			if(valor <= limite){
				saldo = saldo-valor;
				JOptionPane.showMessageDialog(null, "Saque realizado com sucesso.");
			} else {
				JOptionPane.showMessageDialog(null, "Limite insuficiente.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
		}
	}
	public void sacar(){
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
		if(valor <= saldo){
			if(valor <= limite){
				saldo = saldo-valor;
				JOptionPane.showMessageDialog(null, "Saque realizado com sucesso.");
			} else {
				JOptionPane.showMessageDialog(null, "Limite insuficiente.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
		}
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;

	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
}
