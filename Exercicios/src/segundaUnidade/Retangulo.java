package segundaUnidade;

public class Retangulo extends ObjetoGeometrico{

	private double base, altura;
	
	public Retangulo(double x, double y, double b, double h) {
		// TODO Auto-generated constructor stub
		super(x, y);
		base = b;
		altura = h;
	}
	
	public double calculaArea() {
		return base * altura;
	}
	public double calculaperimetro() {
		return ((2*base)+(2*altura));
	}

	@Override
	public String toString() {
		String resultado;
		resultado = super.toString();
		return resultado + " [base=" + base + ", altura=" + altura + "]";
	}
	
}
