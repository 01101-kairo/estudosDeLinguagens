package livraria;

import javax.swing.JOptionPane;

public class LivroFisico extends Livro {
  private int impressoes;
  private String registro;

  public LivroFisico(String titulo, Autor autor, Editora editora,
    int ano, int impressoes, String registro){
      super(titulo, autor, editora, ano);
      this.impressoes = impressoes;
      this.registro = registro;
  }
  public int getImpressoes() {
    return impressoes;
  }

  public void setImpressoes(int impressoes) {
    this.impressoes = impressoes;
  }

  public String getRegistro() {
    return registro;
  }

  public void setRegistro(String registro) {
    this.registro = registro;
  }
  @Override
  public void getDados(){
    JOptionPane.showMessageDialog(null, 
      "Dados do livro fisico: " + titulo
      + "\nAutor do livro: " + autor.getNome()
      +"\nEditora: " + editora.getNome()
      +"\nAno: " + ano
      + "\nImpressões: " + impressoes
      + "\nRegistro: " + registro);
  }
}
