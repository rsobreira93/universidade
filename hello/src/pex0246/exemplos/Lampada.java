package pex0246.exemplos;

public class Lampada {
	private boolean estadoDaLampada;
	
	private void ascende() {
		this.estadoDaLampada = true;
	}
	private void desliga() {
		if(this.estadoDaLampada)
			this.estadoDaLampada = false;
	}
	private void mostraEstado() {
		if(this.estadoDaLampada) {
			System.out.println("A lampada está acessa!");
		}else {
			System.out.println("A lampada está apagada!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada lp = new Lampada();
		//lp.ascende();
		//lp.mostraEstado();
		lp.desliga();
		lp.mostraEstado();

	}

}
