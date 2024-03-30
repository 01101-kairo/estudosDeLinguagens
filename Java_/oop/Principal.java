package orientacao_objetos;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        
        livro.nome = "pequeno principe";
        livro.descricao = "livro infantil";
        livro.isbn = "978671866176";
        livro.preco = 45.95;
        livro.autor = "nemsei";
        livro.dataPub = "17/12/2020";
        
        livro.dados();//invocandoMetodo
    }
}