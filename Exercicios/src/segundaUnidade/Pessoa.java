package segundaUnidade;

import java.util.Date;

public class Pessoa {

	private String nome;
	private int identidade;
	private Date nasscimento;
	
	public Pessoa(String n, int i, Date  dt) {
		// TODO Auto-generated constructor stub,
		nome = n;
		identidade = i;
		nasscimento = dt;
	}
	public String toString() {
		return "Nome: "+nome+"\nIdentidade: "+identidade+"\nData de nascimento: "+nasscimento;
	}
}
