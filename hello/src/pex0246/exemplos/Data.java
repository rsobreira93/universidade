package pex0246.exemplos;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public void inicializaData(int d, int m, int a) {
		if(dataValida(d, m, a)) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}else {
			this.dia = 0;
			this.mes = 0;
			this.ano = 0;
		}
	}
	private boolean dataValida(int d, int m, int a) {
		if((d >= 1 && d <= 31) && (m >= 1 && m <= 12)) {
			return true;
		}else {
			return false;
		}
	}
	public String mostraData() {
		String d = String.valueOf(this.dia);
		String m = String.valueOf(this.mes);
		String a = String.valueOf(this.ano);
		
		String data = d + "/"+ m + "/" +a;
		return data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data dc = new Data();
		dc.inicializaData(03, 04, 1993);
		
		System.out.println(dc.mostraData());
	}

}
