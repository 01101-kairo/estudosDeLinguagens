import dados.*;

public class Main{
  public static void main(String[] args) {
    Nascimento idade = new Nascimento(07,07,2002);
    Formulario form = new Formulario("rua", "numero", "bairro", "cidade",
      "estado", "cep", idade, "nome", "mail", "cpf", "telefone");
    form.getDados(form.nome, form.email, form.cpf, form.telefone, form.rua,
      form.numero, form.bairro, form.cidade, form.estado, form.cep);
  }
}
