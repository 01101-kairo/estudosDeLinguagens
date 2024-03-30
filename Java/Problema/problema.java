import java.util.Scanner;
class problema{
	static double triangolo(){
		double a,b,c,p=0.00;
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o lado a do triangolo:");
		a = entrada.nextDouble();
		System.out.println("informe o lado b do triangolo:");
		b = entrada.nextDouble();
		System.out.println("informe o lado c do triangolo:");
		c = entrada.nextDouble();
		p = (a+b+c)/2;
		return (java.lang.Math.sqrt( p*(p-a)*(p-b)*(p-c)));
	}
	public static void main(String[] args) {
		double x,y;
		System.out.println("x:");
		x = problema.triangolo();
		System.out.println("y:");
		y = problema.triangolo();
		if(x>y){
			System.out.println("O maior é x q é :"+x);
		}else{
			System.out.println("O maior é y q é :"+y);
		}
	}
}
