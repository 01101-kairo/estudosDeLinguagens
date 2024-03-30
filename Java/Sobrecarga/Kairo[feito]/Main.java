import pessoa.Aluno;
import pessoa.Pessoa;
import pessoa.Professor;
import pessoa.Servidor;

public class Main {

    public static void main(String[] args) {
        Aluno studante = new Aluno("matutino", "turma-A2");
        Professor mestre = new Professor("Artes", "2200");
        Servidor tio = new Servidor("Vigia", "1400");
        Pessoa humano = new Pessoa("Valdones", "ramos.valdones@gmail.com", "masculino", "21/02/1992", "00028922-78", "Antonio Marcos", "Raimundo Ramos", "Andrezinho Gamer");

        Pessoa.getDados();
    }
}
