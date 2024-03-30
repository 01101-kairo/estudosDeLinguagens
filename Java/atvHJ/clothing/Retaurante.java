import javax.swing.JOptionPane;

public class Retaurante{

    private String muenu;
    private String nome;
    private String tuipoderestaurante;
    private int numeromaximodpessoas;

    public Retaurante(String muenu, String nome, String tuipoderestaurante, int numeromaximodpessoas){
		this.muenu = muenu;
		this.nome = nome;
		this.tuipoderestaurante = tuipoderestaurante;
		this.numeromaximodpessoas = numeromaximodpessoas;
	}
	public String getmuenu() {
		return muenu;
	}
	public void setmuenu(String muenu) {
		this.muenu = muenu;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String gettui() {
		return tuipoderestaurante;
	}
	public void settui(String tuipoderestaurante) {
		this.tuipoderestaurante = tuipoderestaurante;
	}
	public String getmax() {
		return numeromaximodpessoas;
	}
	public void setmax(int numeromaximodpessoas) {
		this.numeromaximodpessoas = numeromaximodpessoas;
	}
		JOptionPane.showMessageDialog(null,"menu:"+muienu
				+"\nnome:"+nome
				+"\nrestaurante:"+tuipoderestaurante
				+"\nnumero maximo de pessoas:"+numeromaximodpessoas);
	}
}
