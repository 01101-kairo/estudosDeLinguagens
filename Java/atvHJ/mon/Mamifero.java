import javax.swing.JOptionPane;

public class Mamifero {
  private String indentificacao;
  private int idade;
  private String abtati;
  private String raca;
  private String caracteristicas;

  public Mamifero(String indentificacao, int idade, String abtati, String raca, String caracteristicas){
    this.indentificacao  = indentificacao;
    this.idade = idade;
    this.abtati = abtati;
    this.raca = raca;
    this.caracteristicas = caracteristicas;
  }

  public void setIndentificacao(String indentificacao){
    this.indentificacao = indentificacao;
  }
  public String getIndentificacao(){
    return indentificacao;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }
  public int getIdade(){
    return idade;
  }

  public void setAbtati(String abtati){
    this.abtati = abtati;
  }
  public String getAbtati(){
    return abtati;
  }

  public void setraca(String raca){
    this.raca = raca;
  }
  public String getraca(){
    return raca;
  }

  public void setCaracteristicas (String caracteristicas){
    this.caracteristicas = caracteristicas;
  }
  public String getCaracteristicas (){
    return caracteristicas;
  }

  public void dayMamifero(){
    JOptionPane.showMessageDialog(null,"indentificação:"+indentificacao
      +"\nidade:"+idade
      +"\nabtati:"+abtati
      +"\nraca:"+raca
      +"\ncaracteristicas:"+caracteristicas);
  }
}
