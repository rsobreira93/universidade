package pontoextra;

import java.util.Random;

public class Jogador {

	private String nome;
	protected int idade;
	private  String tipo;
	protected int habilidade;
	private int gols;
	private int camisa;

	private  double altura;
	private int reflexos;
	private int cobertura;
	private int desarme;
	private int velocidade;
	private int tecnica;
	private Random gerador = new Random(); 
	
	public Jogador(String pNome, int pIda, int pHab) {
		this.nome = pNome;
		this.idade = pIda;
		this.habilidade = pHab;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String pnome) {
		this.nome = pnome;
	}
	public int getHabilidade() {
		if(this.tipo == "Goleiro") {
			this.camisa = 1;
			this.reflexos = gerador.nextInt(100);
			this.altura = (float)1+gerador.nextFloat();
			this.habilidade = ((this.habilidade * 5) + (((int)(this.altura * 100)) * 2) + (this.reflexos * 3))/10;
			return this.habilidade;
		}else if(this.tipo == "Defensor") {
			this.camisa =(int)2+ gerador.nextInt(6);
			this.cobertura = gerador.nextInt(100);
			this.desarme = gerador.nextInt(100);
			this.habilidade = ((this.habilidade * 5) + (this.cobertura * 3) + (this.desarme * 2))/10;
			return this.habilidade;
		}else {
			this.camisa = (int)7+ gerador.nextInt(10);
			this.velocidade = (int) gerador.nextInt(100);
			this.tecnica = (int)gerador.nextInt(100);
			this.habilidade = ((this.habilidade * 5) + (this.velocidade * 2) + (this.tecnica * 3))/10;
			return this.habilidade;
		}
	}
	public int getGols() {
		this.gols = 0;
		return this.gols;
	}
	public int somaGol() {
		return this.gols ++;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getCamisa() {
		return camisa;
	}
	
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	public void mostrDadosJogador() {
		System.out.println();
		System.out.println("Nome: " + this.nome);
		System.out.println("Posição: " + this.tipo);
		if(this.tipo == "Goleiro") {
			System.out.printf("Altura: %.2f %n", this.altura);
			System.out.println("Reflexos: " + this.reflexos);
		}else if(this.tipo == "Defensor") {
			System.out.println("Cobertura: " + this.cobertura);
			System.out.println("Desarme: " + this.desarme);
		}else {
			System.out.println("Velocidade: " + this.velocidade);
			System.out.println("Tecnica: " + this.tecnica);
		}
		System.out.println("Camisa: " + this.camisa);
		System.out.println("Gols na carreira: " + this.gols);
		System.out.println("Idade: " + this.idade);
		System.out.println("Habilidade: "+ this.habilidade);
		System.out.println();
	}
	
}
