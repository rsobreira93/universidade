package segundaUnidade;

public class Circulo extends ObjetoGeometrico{

	private double raio;
	Circulo(double a, double b, double r) {
		super(a, b);
		// TODO Auto-generated constructor stub
		raio = r;
	}
	public double caluclaArea() {
		return Math.PI * (raio*raio);
	}
	public double calculaPerimetro() {
		return 2*Math.PI * raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public String toString() {
		String resultado;
		resultado = super.toString();
		return resultado + " [raio=" + raio + "]";
	}

}
