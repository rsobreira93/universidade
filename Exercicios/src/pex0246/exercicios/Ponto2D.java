package pex0246.exercicios;

public class Ponto2D {
	private double x, y;
	
	public void inicializaPonto2D(double _x, double _y) {
		x = _x;
		y = _y;
	}
	public boolean eIgual(Ponto2D outroponto) {
		if((x == outroponto.x) &&
				(y == outroponto.y)) {
			return true;
		}else {
			return false;
		}
	}
	public Ponto2D origem() {
		Ponto2D temporario = new Ponto2D();
		temporario.inicializaPonto2D(0, 0);
		return temporario;
	}
	public Ponto2D clona() {
		Ponto2D temporario = new Ponto2D();
		temporario.inicializaPonto2D(x, y);
		return temporario;
	}
	@Override
	public String toString() {
		return "Ponto2D [x=" + x + ", y=" + y + "]";
	}
	

}
