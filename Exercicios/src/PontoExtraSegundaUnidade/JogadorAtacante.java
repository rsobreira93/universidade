package PontoExtraSegundaUnidade;

public class JogadorAtacante extends Jogador{
	
	private int velocidade;
	private int tecnica;
	
	public int getHabilidade() {
		return (((habilidade*5)+(velocidade*2)+(tecnica*3))/10);
	}
	public JogadorAtacante(String pNom, int pIda, int pHa, int pVel, int pTec) {
		super(pNom, pIda, pHa);
		this.velocidade = pVel;
		this.tecnica = pTec;
	}
}
