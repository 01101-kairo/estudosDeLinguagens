import javax.swing.JOptionPane;

public class padaria extends Comercio{
  private String qtpao;
  private String sabores;

  public padaria(String modoDpreparo, String endereco, int valor, String historia, String qtpao, String sabores){
    super(modoDpreparo, endereco, valor, historia);
    this.qtpao = qtpao;
    this.sabores = sabores;
  }
  public String getqtpao(){
    return qtpao;}
  public void setqtpao(String qtpao){
    this.qtpao = qtpao;}
  public String getsabores(){
    return sabores;}
  public void setsabores (String sabores){
    this.sabores = sabores;}
  @Override
  public void getDados(){
    JOptionPane.showMessageDialog(null, 
      "Dados do Comercio\nnome: " + nome 
      + "\nqtpao:" + qtpao 
      + "\nsabores:" + sabores 
      + "\nendereco:" + endereco 
      + "\nvalor:" + valor 
      + "\npropetario:"+ propetario);
  }
}
