import livraria.*;
import static livraria.Livro.livro1;

public class Poo2 {

  public static void main(String[] args) {
    Autor paulo = new Autor("Paulo Oliveira", "paulo.oliveira@gmail.com");
    Editora casadocodigo = new Editora("Casa do código", "123.234.345/32", "casacodigo@gmail.com");
    Livro.livro1 = new Livro("POO", paulo, casadocodigo, 2020);

    livro1.getDados();
  }
}
