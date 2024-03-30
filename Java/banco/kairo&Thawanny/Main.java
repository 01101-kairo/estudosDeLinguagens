import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Banco banco;
			System.out.print("deseja se cadastrar em nosso banco precione (y/n)?");
			char cadastrar = sc.next().charAt(0);
			if (cadastrar == 'y'){

				System.out.print("informe um cadastro para sua conta de banco:");
				int cadastro = sc.nextInt();

				System.out.print("informe o nome completo para sua conta de banco:");
				String titular = sc.next();

				System.out.print("\ndeseja fazer um deposito inicial para nao comecar de bolso vazio(y/n)?");
				char depositar = sc.next().charAt(0);

				if (depositar == 'y'){
					System.out.print("\nqual o valor deseja pro seu primeiro deposito?");
					double initDeposito = sc.nextDouble();

					banco = new Banco(cadastro, titular, initDeposito);
					banco.getDados();

				}
				else{banco = new Banco(cadastro, titular);banco.getDados();}

			}
			else{
				System.out.print("informe seu cadastro no banco:");
				int cadastro = sc.nextInt();

				System.out.print("informe o nome de titular:");
				String titular = sc.next();

				banco = new Banco(cadastro, titular);
				banco.getDados();

			}

			// System.out.print("deseja fazer um deposito[1] ou um saque[2]:");
			// char desejo = sc.next().charAt(0);

			// if(desejo == '1'){
			System.out.print("deposito:");
			double deposito = sc.nextDouble();
			banco.deposito(deposito);
			banco.getDados();
			// }

			// if(desejo == '2'){
			System.out.println("infomamos que cada saque e cobrado uma taxa de R$5.00");
			/**
			 * nao quis descociedera o 0.00 como saque eu poderia colocar apenas valores positivos nao nulos no saque mas
			 * nem tenho certeza se fiz o'que era sesejavel para o desafio
			 * */
			System.out.print("saque:");
			double saque = sc.nextDouble();
			banco.saque(saque);
			banco.getDados();
			// }
		}
	}
}
