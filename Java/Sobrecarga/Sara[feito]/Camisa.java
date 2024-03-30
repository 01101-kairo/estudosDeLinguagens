ublic class Camisa {
    private String modelo;
    private double preco;
    private Marca marca;
    private Tecido tecido;

    public Camisa(String modelo, double preco, Marca marca, Tecido tecido) {
        this.modelo = modelo;
        this.preco = preco;
        this.marca = marca;
        this.tecido = tecido;
        
    }
    public String getmodelo() {
        return modelo;
    }
    public void setmodelo(String modelo) {
        this.modelo = modelo;
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
        JOptionPane.showMessageDialog(null, "Informações do produto;" + "\nmodelo:" + modelo 
        + "\nPreço:" + preco 
        + "\nMarca:" + marca
        + "\nTecido:"+ tecido);

    }

    
    
}
