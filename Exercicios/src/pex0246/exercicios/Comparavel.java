package pex0246.exercicios;

public class Comparavel {
	
	private double valor;
	
	Comparavel(double v){
		valor = v;
	}

	@Override
	public String toString() {
		return "Comparavel [valor=" + valor + "]";
	}
	
	public boolean eIgual(double v1) {
		if(valor == v1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean eIgual(double v1, double v2) {
		if((valor == v1)&&(valor ==v2)) {
			return true;
		}else {
			return false;
		}
	}
	public boolean eMaiorQue(double v1) {
		if(valor > v1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean eMaiorQue(double v1, double v2) {
		if((valor > v1) && (valor > v2)) {
			return true;
		}else {
			return false;
		}
	}
	public boolean eMenorQue(double v1) {
		if(valor < v1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean eMenorQue(double v1, double v2) {
		if((valor < v2) &&( valor < v2)) {
			return true;
		}else {
			return false;
		}
	}
}
