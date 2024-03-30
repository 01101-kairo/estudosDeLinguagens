public class Msobre{
  public static void main(String[] args) {
    double a = 3;
    double b = 2;
    System.out.printf("o quadrado de %.2f  %2f\n", a, Espoente.elevar(a));
    System.out.printf("%.2f elevado a %.2f %.2f\n", a, b, Espoente.elevar(a,b));
    Espoente.elevar();
  }
}
