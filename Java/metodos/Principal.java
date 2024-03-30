
package metodos_parametros;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	String nomi;
	int idadi;

	Scanner entrada = new Scanner(System.in);
	
	MandaMensagem oi = new MandaMensagem();

	System.out.printf("Entre com seu nome: ");
	nomi = entrada.nextLine();
	
	System.out.printf("Entre com sua idadi: ");
	idadi = entrada.nextInt();

	oi.mBV(nomi,idadi);
	entrada.close();
	}
}
