public class Calculadora{

	private String modelo;
	private String marca;
	private String uso;

	public Calculadora(){
	}
	public Calculadora(String marca,String modelo){
		this.marca=marca;
		this.modelo=modelo;
	}

	public Calculadora(String marca,String modelo,String uso){
		this.marca=marca;
		this.modelo=modelo;
		this.uso=uso;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}

	public int calcula(int n1,int n2){
		return n1+n2;
	}
	public double calcula(double n1,double n2){
		return n1+n2;
	}
	public String calcula(String n1,String n2){
		return n1+n2;
	}

	public static void main(String args[]){
		Calculadora calc= new Calculadora("zelda","int");
		Calculadora cald= new Calculadora("neo geneses","double","comercial");
		System.out.println(calc.calcula(7,10));
		System.out.println(calc.calcula(7.0,10.1));
		System.out.println(calc.calcula("Sobrecarga d","e construtores"));
		System.out.println("calculadora de inteiro, Marca: "+calc.marca
				+" Modelo: "+calc.modelo);
		System.out.println("calculadora de flutuante, Marca: "+cald.marca
				+" Modelo:"+cald.modelo
				+" Uso: "+cald.uso);
	}
}
