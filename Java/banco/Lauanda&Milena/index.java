import java.util.Scanner;
public class index {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Banco banco;

		System.out.print("informe um cadastro para sua conta de banco:");
		int cadastro = scan.nextInt();

		System.out.print("informe o nome completo para sua conta de banco:");
		String titular = scan.next();

		System.out.print("\ndeseja fazer um deposito inicial (y/n)?");
		char depositar = scan.next().charAt(0);

		if (depositar == 'y'){
			System.out.print("\nqual o valor deseja pro seu primeiro deposito?");
			double initDeposito = scan.nextDouble();
			banco = new Banco(cadastro, titular, initDeposito);
			banco.getConta();

		}else{
			banco = new Banco(cadastro, titular, 0.00);
			banco.getConta();
		}

		System.out.print("deposito:");
		double deposito = scan.nextDouble();
		banco.deposito(deposito);
		System.out.print("Conta data: ");
		banco.getConta();

		System.out.print("saque:");
		double saque = scan.nextDouble();
		banco.saque(saque);
		System.out.print("Conta data: ");
		banco.getConta();
	}
}
