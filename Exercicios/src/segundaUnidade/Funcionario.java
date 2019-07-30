package segundaUnidade;

import java.util.Date;

public class Funcionario extends Pessoa{
	private Date admissao;
	private float salario;
	
	
	public Funcionario(String n, int i, Date dt, Date ad, float sal) {
		super(n, i, dt);
		admissao = ad;
		salario = sal;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String resultado;
		resultado = super.toString();
		resultado = resultado + "Data de admissao: "+admissao+"\n";
		resultado = resultado + "Salário: "+salario;
		return resultado;
	}
	final public float qualSalario() {
		return salario;
	}
}
