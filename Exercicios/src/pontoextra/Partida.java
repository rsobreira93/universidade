package pontoextra;

import java.time.LocalDate;

public class Partida {

	
	private Time timeCasa;
	private Time timeFora;
	private int placarCasa;
	private int placarVisitante;
	private int golCas;
	private int golFor;
	
	LocalDate data1 = LocalDate.now();
	
	public Partida(LocalDate pData, Time pCas, Time pfora) {
		this.data1 = pData;
		this.timeCasa = pCas;
		this.timeFora = pfora;
	}
	public void golCasa() {
		this.golCas ++;
		System.out.println("GOOOOOOOOL é do(a) "+this.timeCasa.getNome());
		this.placarCasa = golCas;
	}
	public void golFora() {
		this.golFor ++;
		System.out.println("GOOOOOOOOL é do(a) "+this.timeFora.getNome());
		this.placarVisitante = golFor;
	}
	public String getPlacar() {
		String placar = this.timeCasa.getNome() + " " + this.placarCasa +" X " + this.placarVisitante +" "+ this.timeFora.getNome();
		return placar;
	}
	public LocalDate getData1() {
		return data1;
	}
	public void setData1(int dia, int mes, int ano) {
		this.data1 = LocalDate.of(ano, mes, dia);
	}
}
