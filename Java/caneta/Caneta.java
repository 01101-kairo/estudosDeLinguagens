public class Caneta{
  String modelo;
  String cor;
  double ponta;
  int carga;
  boolean tampada;
  void status(){
    System.out.println("Uma caneta " +this.cor);
    System.out.println("esta tampada? "+this.tampada);
  }
  void tampar(){
    this.tampada = true;
  }
  void dtampa(){
    this.tampada = false;
  }
}
