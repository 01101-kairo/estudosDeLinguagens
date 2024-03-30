package testescanner;
import java.util.Scanner;
public class Entra{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite: ");
        String nome = entrada.nextLine();
        System.out.println("digite outra coisa: ");
        String cidade = entrada.nextLine();
        System.out.println();
        System.out.println("nome: "+nome);
        System.out.println("cidade: "+cidade);
        entrada.close();
    }
}
