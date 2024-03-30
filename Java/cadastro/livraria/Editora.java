package livraria;

public class Editora {
  private String nome;
  private String CNPJ;
  private String email;

  public Editora(String nome, String CNPJ, String email) {
    this.nome = nome;
    this.CNPJ = CNPJ;
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(String CNPJ) {
    this.CNPJ = CNPJ;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
