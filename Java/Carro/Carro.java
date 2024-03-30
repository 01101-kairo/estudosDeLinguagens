package Java;

public class Carro {
    private String marca, modelo;
    private int ano, valor;
    private String motor, quantCabines, tipoDeAbastecimento;

    public Carro(String marca, String modelo, int ano, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public Carro(String motor, String quantCabines, String tipoDeAbastecimento) {
        this.motor = motor;
        this.quantCabines = quantCabines;
        this.tipoDeAbastecimento = tipoDeAbastecimento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getQuantCabines() {
        return quantCabines;
    }

    public void setQuantCabines(String quantCabines) {
        this.quantCabines = quantCabines;
    }

    public String getTipoDeAbastecimento() {
        return tipoDeAbastecimento;
    }

    public void setTipoDeAbastecimento(String tipoDeAbastecimento) {
        this.tipoDeAbastecimento = tipoDeAbastecimento;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("2.5 Flex ou 2.8 Diesel", "2 Cabines", "A Diesel ou Gasolina");
        Carro carro2 = new Carro("Chevrolet", "S10 High Country", 2022, 156);
        System.out.println(carro1.motor+ carro2.ano);
    }
}
