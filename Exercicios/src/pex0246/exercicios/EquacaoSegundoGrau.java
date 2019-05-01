package pex0246.exercicios;

public class EquacaoSegundoGrau {
	private int a;
	private int b;
	private int c;
	private double delta;
	private double x1;
	private double x2;
	
	private void operacao(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
		System.out.println("Delta: " + this.delta);
		
		this.x1 = (-this.b + Math.sqrt(this.delta))/(2 * this.a); 
		this.x2 = (-this.b - Math.sqrt(this.delta))/(2 * this.a); 
		
		System.out.println("X' = " + this.x1);
		System.out.println("X'' = " + this.x2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquacaoSegundoGrau eq = new EquacaoSegundoGrau();
		eq.operacao(1, 8, 16);
	}

}
