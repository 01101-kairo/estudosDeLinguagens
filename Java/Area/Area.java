public class Area{

	public int geometrica(int a,int b,int c,int d){
		return a+b+c+d;
	}
	public double geometrica(double a,double b, double c){
		return a+b+c;
	}

	public static void main(String args[]){
		Area sobre= new Area();
		System.out.println("Ah area das formas geometricas");
		System.out.println(sobre.geometrica(4,4,4));
		System.out.println(sobre.geometrica(3.6,3.6,6.1));
	}
}
