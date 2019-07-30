package PontoExtraSegundaUnidade;

public class JogadorDefesa extends Jogador{

	private  int cobertura;
	private int desarme;
	
	public int getHabilidade() {
		return (((habilidade*5)+(cobertura*3)+(desarme*2))/10);
	}
	public JogadorDefesa(String pNom, int pIda, int pHa, int pCob, int pDes) {
		super(pNom, pIda, pHa);
		this.cobertura = pCob;
		this.desarme = pDes;
		
	}
}
