public class Banco {
	private int cadastro;
	private String titular;
	private double saldo;

	public Banco(int cadastro, String titular, double initDeposito){
		this.cadastro = cadastro;
		this.titular = titular;
		deposito(initDeposito);
	}

	public void deposito(double resultado) {
		saldo += resultado;
	}

	public void saque(double resultado) {
		saldo -= resultado + 5.0;
	}

	public void getConta() {
		System.out.println("Conta: "+ cadastro
				+ ", Titular:"+ titular
				+ ", Saldo: $ "+ String.format("%.2f", saldo));
	}
}
