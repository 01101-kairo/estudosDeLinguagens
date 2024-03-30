public class math {
	public static void main(String[] args) {
		int x1 = 7,y1 = 9;
		double x2 = 7.25,y2 = 9.78;
		System.out.println("======================");
		System.out.println("||matematica do java||");
		System.out.println("======================\n");
		System.out.println("valor de x1 int "+x1+"\nvalor de y1 int "+y1+"\nvalor de x2 double "+x2+"\nvalor de y2 double \n"+y2);
		System.out.println("valor de PI : "+Math.PI+"\n");
		System.out.println("valor absoluto de x1 : "+Math.abs(x1)+"\n");
		System.out.println("arredondado x2 pra valor cima : "+Math.ceil(x2)+"\n");
		System.out.println("arredondado x2 para o inteiro inferior : "+Math.floor(x2)+"\n");
		System.out.println("retorna o maior valor entre x1 e y1 : "+Math.max(x1,y1)+"\n");
		System.out.println("retorna o menor valor entre x1 e y1 : "+Math.min(x1,y1)+"\n");
		System.out.println("retorna o valor de x2 elevado a y2 : "+Math.pow(x2,y2)+"\n");
		System.out.println("calculo da raiz quadrada de x2 : "+Math.sqrt(x2)+"\n");
		System.out.println("logaritimo de x2 na base 10 : "+Math.log10(x2)+"\n");
		System.out.println("valor aleatório : "+Math.random()+"\n");
		System.out.println("hipotenusa dos catetos de x2 e y2 : "+Math.hypot(x2,y2));
	}
}
