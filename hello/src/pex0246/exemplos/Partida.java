package PontoExtra;

import java.util.Date;

public class Partida {

	private Date data = new Date();
	private Time timeCasa;
	private Time timeVisitante;
	private int placarCasa;
	private int placarVisitante;

	public Partida(Date pDat, Time pCas, Time pVis) {
		this.data = pDat;
		this.timeCasa = pCas;
		this.timeVisitante = pVis;

	}

	public void golCasa() {
		this.placarCasa++;
	}

	public void golsVisitante() {
		this.placarVisitante++;
	}

	public String getPlacar() {
		return (this.timeCasa.getNome() + "(Casa)" + this.placarCasa + " x " + this.placarVisitante + "(Visitante)"
				+ this.timeVisitante.getNome());
	}

	public Date getData() {
		return data;
	}
	
	

}
