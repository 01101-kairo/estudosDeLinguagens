import javax.swing.JOptionPane;

public class asogue extends Comercio{
  private String qtcarne;
  private String enderecocarnes;

  public asogue(String modoDpreparo, String endereco, int valor, String historia, String qtcarne, String enderecocarnes){
    super(modoDpreparo, endereco, valor, historia);
    this.qtcarne = qtcarne;
    this.enderecocarnes = enderecocarnes;
  }

  public String getqtcarne(){
    return qtcarne;
  }

  public void setqtcarne(String qtcarne){
    this.qtcarne = qtcarne;
  }

  public String getenderecocarnes(){
    return enderecocarnes;
  }

  public void setenderecocarnes (String enderecocarnes){
    this.enderecocarnes = enderecocarnes;
  }

  @Override
  public void getDados(){
    JOptionPane.showMessageDialog(null, 
      "Dados do Comercio\nnome: " + nome 
      + "\nqtcarne:" + qtcarne 
      + "\nenderecocarnes:" + enderecocarnes 
      + "\nendereco:" + endereco 
      + "\nvalor:" + valor 
      + "\npropetario:"+ propetario);

  }
}
