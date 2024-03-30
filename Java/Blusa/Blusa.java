import javax.swing.JOptionPane;
public class Blusa {
	private String cor;
	private String marca;
	private String tamanho;

	public Blusa(){}
	public Blusa(String cor, String marca){
		this.cor=cor;
		this.marca=marca;
	}
	public Blusa( String cor,String marca,String tamanho){
		this.cor=cor;
		this.marca=marca;
		this.tamanho=tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public void dadosDoProduto(){
		JOptionPane.showMessageDialog(null, "nformações:"+"\ncor:"+cor
				+"\nMarca:"+marca
				+"\nTamanho:"+tamanho);
	}
	public static void main(String[] args) {
		Blusa blusa1=new Blusa("Azul", "Macaronada", "M");
		Blusa blusa2= new Blusa("Amarelo", "Adidas", "GG");
		blusa1.dadosDoProduto();
		blusa2.dadosDoProduto();
	}
}