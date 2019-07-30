package segundaUnidade;

public class ConcessionariaDeAutomoveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovel a1 = new Automovel("Fiat", "bege", Automovel.MOVIDOAALCOOL);
		AutomovelBasico a2 = new AutomovelBasico("Corsa", "cinza", Automovel.MOVIDOAGASOLINA);
		AutomovelBasico a3 = new AutomovelBasico("Gol", "branco", Automovel.MOVIDOAGASOLINA, false, false, true);
		AutomovelDeLuxo a4 = new AutomovelDeLuxo("Ibiza", "vermelho", Automovel.MOVIDOAGASOLINA);
		AutomovelDeLuxo a5 = new AutomovelDeLuxo("Honda", "prata", Automovel.MOVIDOAGASOLINA, true, true, false, true, false, true);
		
		imprime(a1);
		imprime(a2);
		imprime(a3);
		imprime(a4);
		imprime(a5);
	}
	public static void imprime(Automovel a) {
		System.out.println("\nSeguem os dados do automóvel escolhido:");
		System.out.println(a);
		System.out.println("Valor: "+a.quantoCusta());
		System.out.println(a.quantasPrestacoes()+" prestações" + (a.quantoCusta()/a.quantasPrestacoes()));
	}

}
