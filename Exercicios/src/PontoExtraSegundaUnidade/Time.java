package PontoExtraSegundaUnidade;

import pontoextra.Jogador;

public class Time {

	private String nome;
	private Jogador[] jogadores = new Jogador[7];
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Time(String pNom) {
		this.nome = pNom;
		this.vitorias = 0;
		this.derrotas = 0;
		this.empates = 0;
	}
	public String getNome() {
		return this.nome;
	}
	public String getResultados() {
		String v = String.valueOf(this.vitorias);
		String d = String.valueOf(this.derrotas);
		String e = String.valueOf(this.empates);
		String res = "O número de Vitorias: " + v + "\nO número de derrotas:  " + d + "\nO número de empates: " + e;
		return  res;
	}
	public void imprimeJogadores() {
		System.out.println("Nome dos jogadores do time: "+this.nome);
		for(int i = 0; i < this.jogadores.length; i++) {
			System.out.println("Nome; "+this.jogadores[i].getNome());
			System.out.println("Camisa: "+this.jogadores[i].getCamisa());
			System.out.println("Habilidade: "+this.jogadores[i].getHabilidade());
			System.out.println(jogadores[i].getTipo());
		}
	}
	public void somaVitoria() {
		this.vitorias ++;
	}
	public void somaDerrota() {
		this.derrotas ++;
	}
	public void somaEmpate() {
		this.empates++;
	}
	public void insereJogador(Jogador pJog) {
		int posicao = 0;
		for (int i = 0; i < this.jogadores.length; i++) {
			if (this.jogadores[i] != null) {
				posicao ++;
			}
		}
		this.jogadores[posicao] = pJog;
	}
}
