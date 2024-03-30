import java.util.Scanner;
public class Banco {
	private String cadastro;
	private String titular;
	private double saldo;

	public Banco(String cadastro, String titular, double initdeposit){
		this.cadastro = cadastro;
		this.titular = titular;
		getdeposit(initdeposit);
	}

	public void getdeposit(double deposit) {
		saldo=saldo+deposit;
	}
	public void getwithdraw(double withdraw) {
		saldo=saldo-(withdraw+5.0);
	}

	public void DadosBanco() {
		System.out.println(
				"Banco: "+ cadastro
				+ ", Holder:"+ titular
				+ ", Balance: $ "+ String.format("%.2f", saldo));
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Banco Banco;

		System.out.print("Number::");
		String cadastro = scanner.next();

		System.out.print("Holder:");
		String titular = scanner.next();

		System.out.print("Is there na initial deposit(y/n)?");
		char depositar = scanner.next().charAt(0);

		if (depositar == 'y'){
			System.out.print("Enter initial deposit value:");
			double initdeposit = scanner.nextDouble();
			Banco = new Banco(cadastro, titular, initdeposit);
			Banco.DadosBanco();

		}else{
			Banco = new Banco(cadastro, titular, 0.00);
			Banco.DadosBanco();
		}
		System.out.print("deposit:");
		double deposit = scanner.nextDouble();
		Banco.getdeposit(deposit);
		System.out.print("Conta data: ");
		Banco.DadosBanco();

		System.out.print("withdraw:");
		double withdraw = scanner.nextDouble();
		Banco.getwithdraw(withdraw);
		System.out.print("Conta data: ");
		Banco.DadosBanco();
	}
}
