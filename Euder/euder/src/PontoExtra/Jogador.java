package PontoExtra;

import java.util.Random;

public class Jogador {

	private String nome;
	protected int idade;
	private String tipo;
	protected int habilidade;
	private int gols = 0;
	private int camisa;

	private float altura;
	private int reflexo;
	private int cobertura;
	private int desarme;
	private int velocidade;
	private int tecnica;

	private Random temp = new Random();

	public Jogador(String pNom, int pIda, int pHab) {
		this.setNome(pNom);
		this.setIdade(pIda);
		this.setHabilidade(pHab);
		this.gols = 0;

	}

	public int getHabilidade() {

		if (this.getTipo() == "Goleiro") {
			return (((this.habilidade * 5) + (((int) (this.altura * 100)) * 2) + (this.reflexo * 3)) / 10);
		} else if (this.getTipo() == "Defensor") {
			return (((this.habilidade * 5) + (this.cobertura * 3) + (this.desarme * 2)) / 1);
		} else {
			return (((this.habilidade * 5) + (this.velocidade * 2) + (this.tecnica * 3)) / 10);
		}
	}

	public int somaGol() {
		return this.gols++;
	}

	public String getNome() {
		return this.nome;
	}

	public void setHabilidade(int pHab) {
		this.habilidade = pHab;
	}

	public int getGols() {
		return gols;
	}

	public void setNome(String pNom) {
		this.nome = pNom;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {

		if (tipo == "Goleiro") {
			this.altura = (float) 1.10 + temp.nextFloat();
			this.reflexo = temp.nextInt(100);
		} else if (tipo == "Defensor") {
			this.cobertura = temp.nextInt(100);
			this.desarme = temp.nextInt(100);
		} else {
			this.velocidade = temp.nextInt(100);
			this.tecnica = temp.nextInt(100);
		}

		this.tipo = tipo;
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

}
