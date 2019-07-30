package PontoExtraSegundaUnidade;

public class JogadorGoleiro extends Jogador{

	private int reflexos;
	private float altura;
	
	public JogadorGoleiro(String pNom, int pIda, int pHa, int pRef, float pAlt) {
		super(pNom,pIda,pHa);
		this.altura = pAlt;
		this.reflexos = pRef;
		
	}
	
	public int getHabilidade() {
		return(((habilidade*5)+((int)(altura*100))+(reflexos*3))/10);
	}
	
}
