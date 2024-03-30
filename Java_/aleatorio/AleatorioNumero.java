//numeros aleatorios
package AleatorioNumero;

import java.util.Random;
public class AleatorioNumero{    
public static void main(String[] args) {
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(32);//gera os numeros inteiros
		System.out.println("numero gerado: "+valor);//exibe os numeros aleatorios
    } 
}
