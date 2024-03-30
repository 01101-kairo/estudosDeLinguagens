import javax.swing.JOptionPane;

public class Vegano extends Alimentos{
	private String vegetal;
	private String fruta;

	public Vegano(String modoDpreparo, String tipo, int valor, String historia, String vegetal, String fruta){
		super(modoDpreparo, tipo, valor, historia);
		this.vegetal = vegetal;
		this.fruta = fruta;
	}public String getvegetal(){
		return vegetal; 
	}public void setvegetal(String vegetal){
		this.vegetal = vegetal;
	}public String getfruta(){
		return fruta; 
	}public void setfruta (String fruta){
		this.fruta = fruta;
	}
	@Override
	public void getDados(){
		JOptionPane.showMessageDialog(null, 
				"Dados do alimento\nmodo de preparo:" + modoDpreparo 
				+ "\nvegetal:" + vegetal 
				+ "\nfruta:" + fruta 
				+ "\ntipo:" + tipo 
				+ "\nvalor:" + valor 
				+ "\nhistoria:"+ historia);
	} 
}
