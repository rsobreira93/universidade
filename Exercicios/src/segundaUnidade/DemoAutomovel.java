package segundaUnidade;

public class DemoAutomovel {

	public static void main(String[] args) {
		
		Automovel a1 = new Automovel("Uno", "Prata",(byte) 1);
		System.out.println(a1);
		
		AutomovelBasico a2 = new AutomovelBasico("Onix", "Preto",(byte) 2);
		AutomovelBasico a3 = new AutomovelBasico("Civic", "Branco", (byte) 1, true, true, false);
		System.out.println(a2);
		System.out.println(a3);
		
		AutomovelDeLuxo a4 = new AutomovelDeLuxo("BMW", "Prata", (byte)1, true, true, true, true, true, true);
		
		System.out.println(a4);
	}
}
