package pex0246.exercicios;

public class Caneta {

	private String marca;
	private float ponta;
	private boolean tamapda;
	private int nivelDeTinta;
	private static String cor;
	
	private Caneta(String m, float p, int nivel, boolean t, String c) {
		nivelDeTinta = nivel;
		marca = m;
		ponta = p;
		tamapda = t;
		cor = c;
	}
	private Caneta(String m) {
		this(m, 0.5f, 50, true, "Azul");
	}
	private Caneta() {
		this("BIC", 0.7f, 90, false, "Preto");
	}
	
	public int getNivelDeTinta() {
		return nivelDeTinta;
	}
	public void setNivelDeTinta(int nivelDeTinta) {
		this.nivelDeTinta = nivelDeTinta;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public boolean isTamapda() {
		return tamapda;
	}
	public void setTamapda(boolean tamapda) {
		this.tamapda = tamapda;
	}
	@Override
	public String toString() {
		return "Caneta [marca=" + marca + ", ponta=" + ponta + ", tamapda=" + tamapda + ", nivelDeTinta=" + nivelDeTinta
				+ ", cor="+cor+ "]";
	}
	public static String getCor() {
		return cor;
	}
	public static void setCor(String cor) {
		Caneta.cor = cor;
	}
	public static Caneta novaCaneta(String cor) {
		return new Caneta("Bic", 0.5f, 75, false, cor);
	}
	
}
