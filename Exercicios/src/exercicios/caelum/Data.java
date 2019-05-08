package exercicios.caelum;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	void incializaData(int d, int m, int a) {
		
		if(dataValida(d, m,  a)) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}else {
			this.ano = 0;
			this.dia = 0;
			this.mes = 0;
		}
	}
	boolean dataValida(int d, int m, int a) {
		if(m == 2) {
			if(a % 4 == 0 && (a % 100 == 0 || a % 400!= 0)) {
				if((d >= 1 && d <= 29) && (m>= 1 && m <= 12)) {
					return true;
				}
			}
		}
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
}
