package pex0246.exercicios;

public class RoboSimples0 {

	private String nomeDoRobo;
	private int posicaXAtual, posicaoYAtual;
	private char direcaoAtual;
	
	public RoboSimples0(String n, int px, int py, char d) {
		nomeDoRobo = n;
		posicaXAtual = px;
		posicaoYAtual = py;
		direcaoAtual = d;
	}
	public RoboSimples0(String n) {
		nomeDoRobo = n;
		posicaXAtual = 0;
		posicaoYAtual = 0;
		direcaoAtual = 'N';
	}
	public RoboSimples0() {
		nomeDoRobo = "";
		posicaXAtual = 0;
		posicaoYAtual = 0;
		direcaoAtual = 'N';
	}
	
	public void move() {
		if(direcaoAtual == 'N') {
			posicaoYAtual = posicaoYAtual + 1;
		}
		if(direcaoAtual == 'S') {
			posicaoYAtual = posicaoYAtual + 1;
		}
		if(direcaoAtual == 'E') {
			posicaXAtual = posicaXAtual + 1; 
		}
		if(direcaoAtual == 'D') {
			posicaXAtual = posicaXAtual + 1;
		}
	}
	public void move(int passos) {
		if(direcaoAtual == 'N') {
			posicaoYAtual = posicaoYAtual + passos;
		}
		if(direcaoAtual == 'S') {
			posicaoYAtual = posicaoYAtual + passos;
		}
		if(direcaoAtual == 'E') {
			posicaXAtual = posicaXAtual + passos;
		}
		if(direcaoAtual == 'D') {
			posicaXAtual = posicaXAtual + passos;
		}
	}
	public String toString() {
		return nomeDoRobo + " \nposição X:\n" +posicaXAtual+"posição Y:\n"+posicaoYAtual;
	}
}
