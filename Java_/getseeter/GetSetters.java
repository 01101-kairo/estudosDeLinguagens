
package getset;
import java.util.Scanner;

import geeset.Futebol; 

public class GetSetters {
    public static void main (String[] args) {
        String time;
        Futebol torcida = new Futebol();
        Scanner texto = new Scanner(System.in);

        System.out.println("pra qual time tu torce? ");
        time = texto.nextLine();

        torcida.setTime(time);
        torcida.mostrTime();
    }
}
