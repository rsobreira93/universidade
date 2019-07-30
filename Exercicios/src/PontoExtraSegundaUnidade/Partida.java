package PontoExtraSegundaUnidade;

import java.util.Date;

public class Partida {

	private Date data;
	private Time timeCasa;
	private Time timeFora;
	private int placarCasa;
	private int placarVisitante;
	private int golsCasa;
	private int golFora;
	
	
	public Partida(Date pDat, Time pCas, Time pVis) {
		// TODO Auto-generated constructor stub
		this.data = pDat;
		this.timeCasa = pCas;
		this.timeFora = pVis;
	}
	public void golCasa() {
		this.golsCasa ++;
		System.out.println("GOOOOOOOOL é do(a) "+this.timeCasa.getNome());
		this.placarCasa = this.golsCasa;
	}
	public void golFora() {
		this.golFora ++;
		System.out.println("GOOOOOOOOL é do(a) "+this.timeCasa.getNome());
		this.placarCasa = this.golFora;
	}
	public String getPlacar() {
		String placar = this.timeCasa.getNome() + " " + this.placarCasa +" X " + this.placarVisitante +" "+ this.timeFora.getNome();
		return placar;
	}
	
}
