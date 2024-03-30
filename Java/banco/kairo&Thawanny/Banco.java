/* 
@info: como e uma simples atividade escolhi fazer em apenas um arquivo
por nao saber que conceitos desejava na atividade escolhi fazer da forma
que veio primeiro na minha mente
@name: Banco
@deve: Kairo Costa, Thawanny Rodrigues
@creation: 22/02/12 10h13
@change: 22/02/12 12h13
@Description:

1-cadastro(numerodaconta(imutavel), titular(mutavel), valord(init)
 > troca opcional de nome de titular
2-saldo(deposito, saque, taxa:5.00,negativar saldo)
3-mostrar dados da conta apos cada operacao

ex:
nuber:8532
holder:Alex Green
deposit(y,n)?y deposit value: 500.00

Accout data
accout $nuber, Holder $holder, Balance $700.00

withdraw(y,n)?y withdraw value: 500.00
Withdraw value: 300.00
Updated account data
accout $nuber, Holder $holder, Balance $395.00
*/

import java.util.Scanner;

public class Banco {
  private int cadastro;
  private String titular;
  private double saldo;

  public Banco(int cadastro, String titular){
    this.cadastro = cadastro;
    this.titular = getTitular(titular);

  }

  public Banco(int cadastro, String titular, double initDeposito){
    /*
      saldo icicial é opcional, ou seja: se o titular não tiver dinheiro
      a depositar no momento de abrir sua conta, o depósito inicial não será́feito e o saldo
      inicial da conta será́, naturalmente, zero.
    */
    this.cadastro = cadastro;
    this.titular = getTitular(titular);
    deposito(initDeposito);

  }
  public int getCadastro() {
    return cadastro;
  }
  public String getTitular(String titular) {
    Scanner sc = new Scanner(System.in);
    System.out.print("deseja mudar o nome de titular precione (y/n)?");
    char mudar = sc.next().charAt(0);

    if (mudar == 'y'){
      System.out.print("novo nome de titular: ");
      return titular = titular.replace(titular, sc.next());
    }else{
      return titular;
    }
  }
  public double getSaldo() {
    return saldo;
  }

  public void deposito(double deposito) {
    saldo += deposito;
  }

  public void saque(double deposito) {
    saldo -= deposito + 5.0;
  }

  public void getDados() {
    System.out.println("Conta: "+ cadastro
      + ", Titular:"+ titular
      + ", Saldo: $ "+ String.format("%.2f", saldo));
  }
}
