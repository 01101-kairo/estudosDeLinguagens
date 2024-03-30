//exemplodeconstanteefunção
import java.util.Scanner;//importedaclaseScanner
public class ClasseScanner{//declarandoclasedocodico
	private static final double LARGURA = 10.0;//constante

	public static void main(String[] args){	//funçãomain(padrão)dojava
		Scanner entrada = new Scanner(System.in);//instanciandooScanner

		System.out.println("entre com o comprimentop:");//saidadocodico
		double compr = entrada.nextDouble();//entradadousuario

		double area = calculaArea(LARGURA, compr);//chamandoafunção
		System.out.println("a área é: " +area);//saidadocodico
	}//função
	private static double calculaArea(double largura, double comprimento){
		return largura * comprimento;//retornodafunção
	}
}
