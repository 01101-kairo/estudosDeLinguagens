public class Espoente {
  //metodo que nao calcula nada
  public static void elevar(){
    System.out.println("\neste metodo nao calcula nada!");
  }
  //metodo que calcula o quadrado de 1
  public static double elevar(double i){
    return i * i;
  }
  //metodo que calcula ai elevado a j
  public static double elevar(double i, double j){
    return Math.pow(i, j);
  }
}
