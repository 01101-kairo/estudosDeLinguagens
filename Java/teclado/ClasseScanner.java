import java.util.Scanner;

public class ClasseScanner{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String str;
    System.out.printf("entre com seu nome: ");
    str = scanner.nextLine();
    System.out.printf("bem-vindo %s, digite um numero: ", str);
    int numero = scanner.nextInt();
    System.out.printf("Obrigado %s, numero digitado foi: %d\n", str, numero);

    scanner.close();
  }
}
