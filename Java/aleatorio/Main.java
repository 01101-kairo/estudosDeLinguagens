// package aleatorios;
import java.util.Random;

public class Main{
  public static void main(String[] args) {
    Random aleatorio = new Random();

    //gera os numeros inteiros no intervalo dederminado
    int valor = aleatorio.nextInt(32);
    //exibe os numeros aleatorios
    System.out.println("numero gerado: "+valor);
  }
}
