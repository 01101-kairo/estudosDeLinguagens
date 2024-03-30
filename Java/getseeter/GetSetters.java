import java.util.Scanner;

import fut.Futebol;

public class GetSetters {
  public static void main (String[] args) {
    String time;
    Futebol torcida = new Futebol();
    try (Scanner texto = new Scanner(System.in)) {
      System.out.printf("pra qual time tu torce? ");
      time = texto.nextLine();
    }

    torcida.setTime(time);
    torcida.mostrTime();
  }
}
