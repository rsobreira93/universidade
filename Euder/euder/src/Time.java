package PontoExtra;

public class Time {
	
	private String Nome;
	private Jogador[] jogadores = new Jogador[8];
	private int vitorias;
	private int derrotas;
	private int empates;

	
	public Time(String pNom) {
		this.Nome = pNom;
		this.vitorias = 0;
		this.derrotas = 0;
		this.empates = 0;
	}

	public String getNome() {
		return this.Nome;
	}

	public String getResultados() {
		return ("(Vitorias: " + this.getVitorias() + ", Empates: " + this.getEmpates() + ", Derrotas: "
				+ this.getDerrotas() + ")");
	}

	public void somaVitoria() {
		this.vitorias++;
	}

	public void somaDerrota() {
		this.derrotas++;
	}

	public void somaEmpate() {
		this.empates++;
	}

	public void insertJogador(Jogador pJog) {
		int J = 0;
		for (int i = 0; i < this.jogadores.length; i++) {
			if (this.jogadores[i] != null)
				J++;
		}
		this.jogadores[J] = pJog;
	}

	public int getVitorias() {
		return vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public int getEmpates() {
		return empates;
	}

}
