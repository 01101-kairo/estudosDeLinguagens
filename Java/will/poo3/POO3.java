package poo3;
public class POO3 {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta("André Gomes Pinheiro", 12367, 569023, 5000, 5000);
		conta2.sacar();
		conta2.sacar(3000);
	}
}
