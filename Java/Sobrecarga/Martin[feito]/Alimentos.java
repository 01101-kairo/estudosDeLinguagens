import javax.swing.JOptionPane;

public class Alimentos {
	protected String modoDpreparo;
	protected String tipo;
	protected int valor;
	protected String historia;

	public Alimentos(){}
	public Alimentos(String modoDpreparo, String tipo, int valor, String historia) {
		this.modoDpreparo = modoDpreparo;
		this.tipo = tipo;
		this.valor = valor;
		this.historia = historia;
	}
	public Alimentos(String tipo, int valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	public String getmodoDpreparo() {
		return modoDpreparo; 
	}
	public void setmodoDpreparo(String modoDpreparo) {
		this.modoDpreparo = modoDpreparo;
	}
	public String gettipo(){
		return tipo; 
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	public void getvalor(int valor) {
		this.valor = valor;
	}
	public int setvalor() {
		return valor; 
	}
	public String gethistoria() {
		return historia;  
	}
	public void sethistoria(String historia) {
		this.historia = historia;
	}
	public void getDados(){
		JOptionPane.showMessageDialog(null, 
				"Dados do alimento\nmodo de preparo: " + modoDpreparo 
				+ "\ntipo:" + tipo 
				+ "\nvalor:" + valor 
				+ "\nhistoria:"+ historia);
	}
	public static void main(String[] args) {
		Alimentos vei = new Alimentos("ferve na agua", "vegano - sopa de mato", 12,"um dia um chines fervel mato e tomou e assim descobril a sopa de mato");
		Alimentos car = new Alimentos("carne - bife", 56);

		vei.getDados();
		car.getDados();
	}
}
