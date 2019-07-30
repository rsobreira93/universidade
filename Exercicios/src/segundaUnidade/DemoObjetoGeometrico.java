package segundaUnidade;

public class DemoObjetoGeometrico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjetoGeometrico o = new ObjetoGeometrico(0.0, 0.0);
		System.out.println(o);
		Circulo c = new Circulo(0, 0 , 2);
		System.out.println(c);
		System.out.println(c.caluclaArea());
		System.out.println(c.calculaPerimetro());
		Retangulo r = new Retangulo(0, 0, 2, 4);
		System.out.println(r);
		System.out.println(r.calculaArea());
		System.out.println(r.calculaperimetro());
		Triangulo t = new Triangulo(0, 0, 1, 2, 3);
		System.out.println(t);
		System.out.println(t.calculaArea());
		System.out.println(t.calculaPerimetro());
		
	
	}

}
