package pontoextra;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Partida {

	private Date data;
	private Time timeCasa;
	private Time timeFora;
	private int placarCasa;
	private int placarVisitante;
	private int golCas;
	private int golFor;
	
	Locale brasil = new Locale("pt", "BR"); 
	DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
	
	public Partida(Date pData, Time pCas, Time pfora) {
		this.data = pData;
		this.timeCasa = pCas;
		this.timeFora = pfora;
	}
	public void golCasa() {
		this.golCas ++;
		this.placarCasa = golCas;
	}
	public void golFora() {
		this.golFor ++;
		this.placarVisitante = golFor;
	}
	public String getPlacar() {
		String placar = this.timeCasa.getNome() + " " + this.placarCasa +" X " + this.placarVisitante +" "+ this.timeFora.getNome();
		return placar;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
