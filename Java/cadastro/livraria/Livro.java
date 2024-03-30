package livraria;

import javax.swing.JOptionPane;

public class Livro {
  public static Livro livro1;
  protected String titulo;
  protected Autor autor;
  protected Editora editora;
  protected int ano;

  public Livro(String titulo, Autor autor, Editora editora, int ano) {
    this.titulo = titulo;
    this.autor = autor;
    this.editora = editora;
    this.ano = ano;
  }

  public Livro(String poo, Autor autor, Editora editora) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public Autor getAutor() {
    return autor;
  }
  public void setAutor(Autor autor) {
    this.autor = autor;
  }
  public Editora getEditora() {
    return editora;
  }
  public void setEditora(Editora editora) {
    this.editora = editora;
  }
  public int getAno() {
    return ano;
  }
  public void setAno(int ano) {
    this.ano = ano;
  }
  public void getDados(){
    JOptionPane.showMessageDialog(null, 
      "Dados do livro: " + titulo
      + "\nAutor do livro: " + autor.getNome()
      + "\nEditora do livro: " + editora.getNome() 
      + "\nAno do livro: " + ano);
  }
}
