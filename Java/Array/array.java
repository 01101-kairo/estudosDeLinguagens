import java.util.Scanner;

public class array {
  public static void main(String[] args) {
    try (Scanner ent = new Scanner(System.in)) {
      int[] Valor = new int[10];
      for( int a = 0; a<Valor.length; a++){
        System.out.printf("coloque o valor " + a+" : ");
        Valor[a] = ent.nextInt();
      }
      System.out.println("\n");
      for(int valo:Valor){
        System.out.printf(valo+" ");
      }
    }
    System.out.println("\n");
  }
}
