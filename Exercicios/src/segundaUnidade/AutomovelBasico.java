package segundaUnidade;

public class AutomovelBasico extends Automovel{

	private boolean retrovisorDoLadoDoPassageiro;
	private boolean limpadorDoVidroTraseiro;
	private boolean radioAMFM;
	
	AutomovelBasico(String m, String c, byte comb, boolean retro, boolean limpa, boolean radio){
		super(m, c, comb);
		retrovisorDoLadoDoPassageiro = retro;
		limpadorDoVidroTraseiro = limpa;
		radioAMFM = radio;
	}
	AutomovelBasico(String m, String c, byte comb){
		super(m, c, comb);
		retrovisorDoLadoDoPassageiro = true;
		limpadorDoVidroTraseiro = true;
		radioAMFM = true;
	}
	
	@Override
	public float quantoCusta() {
		float preco = super.quantoCusta();
		if(retrovisorDoLadoDoPassageiro) preco += 280;
		if(limpadorDoVidroTraseiro) preco += 650;
		if(radioAMFM) preco += 190;
		return preco;
	}
	@Override
	public String toString() {
		String resultado = super.toString();
		if(retrovisorDoLadoDoPassageiro) 
			resultado+="Com retrovisor do lado do passageiro\n";
		if(limpadorDoVidroTraseiro)
			resultado += "Com limpador do vidro traseiro\n";
		if(radioAMFM)
			resultado+= "Com rádio AM/FM\n";
		return resultado;
	}
	
}
