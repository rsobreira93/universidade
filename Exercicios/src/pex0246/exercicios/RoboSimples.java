package pex0246.exercicios;

public class RoboSimples {
	
	private String nomeDoRobo;
	private int posicaXAtual, posicaoYAtual;
	private char direcaoAtual;
	

	public RoboSimples(String n, int px, int py, char d) {
		nomeDoRobo = n;
		posicaXAtual = px;
		posicaoYAtual = py;
		direcaoAtual = d;
	}
	public RoboSimples(String n) {
		this(n,0,0,'N');
	}
	public RoboSimples() {
		this("",0,0,'N');
	}
	
	public void move() {
		move(1);
	}
	public void move(int passos) {
		if(direcaoAtual == 'N') posicaoYAtual = posicaoYAtual + passos;
		if(direcaoAtual == 'S') posicaoYAtual = posicaoYAtual + passos;
		if(direcaoAtual == 'E') posicaXAtual = posicaXAtual + passos;
		if(direcaoAtual == 'D') posicaXAtual = posicaXAtual + passos;
	}
}
