package POO;
import javax.swing.JOptionPane;

/**
 *
 * @author edwin
 */
public class Data {
	private int dia;
	private String mes;
	private int ano;
	public Data(String mes,int dia, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Data(int dia, String mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Data(int dia, int ano, String mes) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}


	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public void getString() {
		JOptionPane.showMessageDialog(null,
				"Data{" 
				+ "dia=" + dia 
				+ ", mes=" + mes 
				+ ", ano=" + ano + "}");

	}
}
