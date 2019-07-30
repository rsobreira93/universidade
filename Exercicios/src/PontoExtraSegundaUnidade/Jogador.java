package PontoExtraSegundaUnidade;

public class Jogador {
	protected int idade;
	protected int habilidade;
	private int gols;
	private int camisa;
	

	public Jogador(String pNome, int pIda, int pHa) {
		this.nome = pNome;
		this.idade = pIda;
		this.habilidade = pHa;
	}
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getHabilidade() {
		return habilidade;
	}
	public void setHabilidade(int habilidade) {
		this.habilidade = habilidade;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	
}
