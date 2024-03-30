import java.util.Scanner;
public class Testes {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o nome: ");
    String nome = entrada.nextLine();
    System.out.print("Digite a idade: ");
    int idade = entrada.nextInt(); 
    System.out.print("Digite a altura: ");
    float altura = entrada.nextFloat(); 
    System.out.println();
    System.out.println("Nome: " + nome);
    System.out.println("Altura: " + altura);
    System.out.println("Idade: " + idade);
    entrada.close();
  }
}
