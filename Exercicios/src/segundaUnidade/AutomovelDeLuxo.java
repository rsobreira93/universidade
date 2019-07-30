package segundaUnidade;

public class AutomovelDeLuxo extends AutomovelBasico{

	private static final byte NUMEROMAXIMODEPRESTACOES = 36;
	
	private boolean direcaoHidraulica;
	private boolean combioAutomatico;
	private boolean vidrosETravasEletricos;
	
	AutomovelDeLuxo(String m, String c, byte comb,boolean retro, boolean limpa, boolean radio, boolean dir, boolean camb, boolean vidro ){
		super(m, c, comb, retro, limpa, radio);
		direcaoHidraulica = dir;
		combioAutomatico = camb;
		vidrosETravasEletricos = vidro;
	}
	public AutomovelDeLuxo(String m, String c, byte comb) {
		// TODO Auto-generated constructor stub
		super(m, c, comb);
		direcaoHidraulica = true;
		combioAutomatico = true;
		vidrosETravasEletricos = true;
	}
	@Override
	public float quantoCusta() {
		return NUMEROMAXIMODEPRESTACOES;
	}
	@Override
	public String toString(){
		String resultado = super.toString();
		if(direcaoHidraulica)
			resultado += "Com direção hidráulica\n";
		if(combioAutomatico)
			resultado += "Com câmbio automático\n";
		if(vidrosETravasEletricos)
			resultado+= "Com vidros e travas elétricas\n";
		return resultado;
	}
}
