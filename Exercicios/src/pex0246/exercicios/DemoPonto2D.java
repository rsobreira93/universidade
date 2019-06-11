package pex0246.exercicios;

public class DemoPonto2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ponto2D p1;
		Ponto2D p2, p3, p4;
		
		p1 = new Ponto2D();
		p2 = new Ponto2D();
		
		p1.inicializaPonto2D(-1.34,9.17);
		
		System.out.println("As coordenadas do ponto p1 são: "+p1);
		System.out.println("As coordenadas do ponto p2 são: " + p2);
		
		p3 = p1.clona();
		p4 = p1.origem();
		
		System.out.println("As coordenadas do ponto p3 são: "+p3);
		System.out.println("As coordenadas do ponto p4 são: "+p4);
		
		System.out.println("p1 está na mesma posição que p2? "+p1.eIgual(p2));
		System.out.println("p1 está na mesma posição que p3? "+p1.eIgual(p3));
		System.out.println("p1 está na mesma posição que p4? "+p1.eIgual(p4));
		System.out.println("p2 está na mesma posição que p4? "+p2.eIgual(p4));
		
		System.out.println(new Ponto2D());
		
	}

}
