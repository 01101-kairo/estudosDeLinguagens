// Classe Cachorro
import javax.swing.JOptionPane;

public class Cachorro{
	public String nome;
	public float  peso;
	public float  altura;
	public String cor;
	public Cachorro(String nome, float peso, float altura, String cor){
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.cor = cor;
	}

	public void setNome ( String nome ){
		this.nome = nome;
	}
	public String getNome (){
		return nome;
	}
	public void setPeso ( float peso){
		this.peso = peso;
	}
	public float  getPeso (){
		return peso;
	}
	public void setAltura ( float altura){
		this.altura = altura;
	}
	public float  getAltura (){
		return altura;
	}
	public void setCor ( String cor ){
		this.cor = cor;
	}
	public String getCor (){
		return cor;
		}
	public void exib(){
		JOptionPane.showMessageDialog(null,
				+"\n"+nome
                +"\n"+peso
                +"\n"+altura
                +"\n"+cor
				)
	}

// Classe Jogador
import javax.swing.JOptionPane;

public class Jogador{
	public String nome;
	public int idade;
	public int altura;
	public String sexo;

	public Jogador(String nome, int idade, int altura, String sexo){
		this.nome= nome;
		this.idade = idade;
		this.altura = altura;
		this.sexo = sexo;
	}

	public void setNome ( String nome ){
		this.nome = nome;
	}
	public String getNome (){
		return nome;
	}
	public void setIdade ( int idade ){
		this.idade = idade;
	}
	public int getIdade (){
		return idade;
	}
	public void setAltura ( int altura){
		this.altura = altura;
	}
	public int getAltura (){
		return altura;
	}
	public void setSexo ( String sexo){
		this.sexo =sexo;
	}
	public String getSexo (){
		return sexo;
	}
	public void exib(){
		JOptionPane.showMessageDialog(null,
				+"\n"+nome+"\n"+idade+"\n"+altura+"\n"+sexo)
	}
}
