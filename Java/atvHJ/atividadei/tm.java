
Classe Conta
package atividadei;

import javax.swing.JOptionPane;

public class Conta {
    private String titular, agencia, numero, tipo;
    private double saldo;
    private double limiteSaque;
    
    public Conta(String titular, String agencia, String numero,
                 String tipo, double saldo, double limiteSaque){
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }
    
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getAgencia(){
        return agencia;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getNumero(){
        return numero;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getLimiteSaque(){
        return limiteSaque;
    }
    public void setLimiteSaque(double limiteSaque){
        this.limiteSaque = limiteSaque;
    }
    public void mostrarDetalhes(){
        JOptionPane.showMessageDialog(  
            null, "Detalhes da conta:\nTitular: "
            + titular + "\nAgência: " + agencia
            + "\nNúmero: " + numero + "\nTipo: " + tipo
            + "\nSaldo: " + saldo + "\nLimite: " + limiteSaque);
    }
}
