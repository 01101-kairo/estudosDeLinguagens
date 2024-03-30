package orientacao_objetos;

public class Livro {
	String nome;
    String descricao;
    String autor;
    String isbn;
    double preco;
    String dataPub;

    void dados(){//metodo
        System.out.println("\nnome do livro "+nome);
        System.out.println("preço "+preco);
        System.out.println("autor(a) "+autor);
        System.out.println("data de publicação "+dataPub);
    }
}
