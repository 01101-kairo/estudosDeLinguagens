public class Camisa {
    private String tamanho;
    private double preco;
    private Marca marca;
    private Tecido tecido;

    public Camisa(String tamanho, double preco, Marca marca, Tecido tecido) {
        this.tamanho = tamanho;
        this.preco = preco;
        this.marca = marca;
        this.tecido = tecido;
        
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Tecido getTecido() {
        return tecido;
    }
    public void setTecido(Tecido tecido) {
        this.tecido = tecido;
    }

    public void dadosDoProduto(){
        JOptionPane.showMessageDialog(null, "Informações do produto;" + "\nTamanho:" + tamanho 
        + "\nPreço:" + preco 
        + "\nMarca:" + marca
        + "\nTecido:"+ tecido);

    }

    
    
}
