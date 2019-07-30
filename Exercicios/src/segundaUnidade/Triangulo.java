package segundaUnidade;

public class Triangulo extends ObjetoGeometrico{

	double a, b, c, s;
	public Triangulo(double x, double y, double l1, double l2, double l3) {
		// TODO Auto-generated constructor stub
		super(x, y);
		a = l1;
		b = l2;
		c = l3;
	}
	public double calculaPerimetro() {
		return (a+b+c);
	}
	public double calculaArea() {
		s = calculaPerimetro()/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	@Override
	public String toString() {
		String resultado;
		resultado = super.toString();
		return resultado + "[a=" + a + ", b=" + b + ", c=" + c + ", s=" + s + "]";
	}
	
}
