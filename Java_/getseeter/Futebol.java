
package getset;

public class Futebol {
    private String nomeTime;

    public void setTime(String meuTime){
        nomeTime = meuTime;
    }
    public String getTime(){
        return nomeTime;
    }
    public void mostrTime(){
        System.out.printf("seu time eh %s\n", getTime());
    }
}
