package segundaUnidade;

public class Automovel {

	public static final byte MOVIDOAGASOLINA = 1;
	public static final byte MOVIDOAALCOOL = 2;
	public static final byte MOVIDOADIESEL = 3;
	public static final byte MOVIDOAGAS = 4;
	
	private static final byte NUMEROMAXIMODEPRESTACOES = 24;
	
	private String modelo;
	private String cor;
	private byte combustivel;
	Automovel(String m, String c, byte comb){
		modelo = m;
		cor = c;
		combustivel = comb;
	}
	public float quantoCusta() {
		float preco = 0;
		switch(combustivel) {
		case MOVIDOAGASOLINA:
			preco = 12000.0f;
			break;
		case MOVIDOAALCOOL:
			preco = 10500.0f;
			break;
		case MOVIDOADIESEL:
			preco = 11000.0f;
			break;
		case MOVIDOAGAS:
			preco = 13000.0f;
			break;
		}
		return preco;
	}
	public byte quantasPrestacoes() {
		return NUMEROMAXIMODEPRESTACOES;
	}
	public String toString() {
		String resultado;
		resultado = modelo + "" + cor+"\n";
		switch(combustivel) {
		case MOVIDOAGASOLINA:
			resultado+= "Movido a gasolina\n";
			break;
		case MOVIDOAALCOOL:
			resultado+= "Movido a álcool\n";
			break;
		case MOVIDOADIESEL:
			resultado += "Movido a diesil\n";
			break;
		case MOVIDOAGAS:
			resultado += "Movido a gás\n";
			break;
		}
		return resultado;
	}
}
