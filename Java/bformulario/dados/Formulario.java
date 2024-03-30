package dados;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Formulario extends Endereco {
	public String nome, email, cpf, telefone;
	public String vaga, conhecimento;
	public Nascimento idade;

	public Formulario(String rua, String numero, String bairro, String cidade, String estado, String cep,
			Nascimento idade, String nome, String email, String cpf, String telefone) {
		super(rua, numero, bairro, cidade, estado, cep);
		this.idade = idade;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public int getIdade(int dia, int mes, int ano) {
		Calendar c = Calendar.getInstance();
		if (c.get(Calendar.MONTH) < mes) {
			return (c.get(Calendar.YEAR) - ano) - 1;
		} else {
			if (c.get(Calendar.DAY_OF_MONTH) < dia) {
				return (c.get(Calendar.YEAR) - ano) - 1;
			} else {
				return c.get(Calendar.YEAR) - ano;
			}
		}
	}
	public String getIdade(){
		if (idade.dia<=10&&idade.mes<=10){ 
			return "0"+idade.dia+"/"+"0"+idade.mes+"/"+idade.ano+"\nIdade: "+getIdade(idade.dia, idade.mes, idade.ano);
	}else{
			return idade.dia+"/"+idade.mes+"/"+idade.ano+"\nIdade: "+getIdade(idade.dia, idade.mes, idade.ano);
	}
}
	public void getDados(String nome, String email, String cpf, String telefone,String rua, String numero, String bairro, String cidade, String estado, String cep) {
		JOptionPane.showMessageDialog(null,"\nFormulario\n"
				+"\nNome: "+ nome
				+"\nE-mail: "+email
				+"\nCPF: "+cpf
				+"\nTelefone: "+telefone
				+"\nNacimento:"+getIdade()
				+"\n\nEndereco\n"
				+"\nRua: "+ rua
				+"\nNumero: "+numero
				+"\nBairro: "+bairro
				+"\nCidade: "+cidade
				+"\nEstado: "+estado
				+"\nCEP: "+ cep);
	}

}
