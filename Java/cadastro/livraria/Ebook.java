package livraria;

import javax.swing.JOptionPane;

public class Ebook extends Livro {
  private String formato;
  private String site;

  public Ebook(String titulo, Autor autor, Editora editora,
    int ano, String formato, String site){
      super(titulo, autor, editora, ano);
      this.formato = formato;
      this.site = site;
  }
  public String getFormato() {
    return formato;
  }

  public void setFormato(String formato) {
    this.formato = formato;
  }

  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }
  @Override
  public void getDados(){
    JOptionPane.showMessageDialog(null, 
      "Dados do book: " + titulo
      + "\nAutor: " + autor.getNome()
      + "\nEditora: " + editora.getNome()
      + "\nAno: " + ano
      + "\nFormato: " + formato
      + "\nSite: " + site);
  }
}
