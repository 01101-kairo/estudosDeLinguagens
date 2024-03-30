import javax.swing.JOptionPane;

public class Comercio {
  protected String nome;
  protected String endereco;
  protected int valor;
  protected String propetario;

  public Comercio(String nome, String endereco, int valor, String propetario) {
    this.nome = nome;
    this.endereco = endereco;
    this.valor = valor;
    this.propetario = propetario;
  }

  public String getnome() {return nome;}
  public void setnome(String nome) {this.nome = nome;}

  public String getendereco() {return endereco;}
  public void setendereco(String endereco) {this.endereco = endereco;}

  public void getvalor(int valor) {this.valor = valor;}
  public int setvalor() {return valor;}

  public String getpropetario() {return propetario;}
  public void setpropetario(String propetario) {this.propetario = propetario;}

  public void getDados() {
    JOptionPane.showMessageDialog(null, "Dados do Comercio\nnome: " + nome
      + "\nendereco:" + endereco + "\nvalor:" + valor + "\npropetario:"+ propetario);
  }
}
