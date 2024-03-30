import javax.swing.JOptionPane;

public class Carnivoro extends Alimentos{
	private String carneVermelha;
	private String carneBranca;

	public Carnivoro(String modoDpreparo, String tipo, int valor, String historia, String carneVermelha, String carneBranca){
		super(modoDpreparo, tipo, valor, historia);
		this.carneVermelha = carneVermelha;
		this.carneBranca = carneBranca;
	}
	public String getcarneVermelha(){
		return carneVermelha; 
	}
	public void setcarneVermelha(String carneVermelha){
		this.carneVermelha = carneVermelha;
	}
	public String getcarneBranca(){
		return carneBranca; 
	}
	public void setcarneBranca (String carneBranca){
		this.carneBranca = carneBranca;
	}
	@Override
	public void getDados(){
		JOptionPane.showMessageDialog(null, 
				"Dados do alimento\nmodo de preparo:" + modoDpreparo 
				+ "\ncarneVermelha:" + carneVermelha 
				+ "\ncarneBranca:" + carneBranca 
				+ "\ntipo:" + tipo 
				+ "\nvalor:" + valor 
				+ "\nhistoria:"+ historia);
	} 
}
