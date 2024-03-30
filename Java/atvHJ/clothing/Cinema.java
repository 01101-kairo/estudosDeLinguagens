import javax.swing.JOptionPane;

public class Cinema{
    private String fimesnocadalogo;
    private String secao;
    private int numeromaximodpessoas;

    public Cinema(String fimesnocadalogo, String secao, int numeromaximodpessoas) {
		this.fimesnocadalogo = fimesnocadalogo;
		this.secao = secao;
		this.numeromaximodpessoas = numeromaximodpessoas;

}
    public String getfilmes(){
        return fimesnocadalogo;
    }
    public void setfilmes(String fimesnocadalogo){
        this.fimesnocadalogo = fimesnocadalogo;
    }
    public String getsecao(){
        return secao;
    }
    public void setsecao(String secao){
        this.secao = secao;
    }
    public int getnumer(){
        return numeromaximodpessoas;
    }
    public void setnumer(int numeromaximodpessoas){
        this.numeromaximodpessoas = numeromaximodpessoas;
    }
	public void mostraCinema(){
		JOptionPane.showMessageDialog(null,"filme:"+fimesnocadalogo
				+"\nsecao:"+secao
				+"\nnumero maximo de pessoas:"+numeromaximodpessoas);
	}
}
