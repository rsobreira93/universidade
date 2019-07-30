package segundaUnidade;

import java.util.Date;

public class ChefeDepartamento  extends Funcionario{

	private String departamento;
	private Date promoxaoAChefe;
	
	public ChefeDepartamento(String n, int i, Date dt, Date ad, float sal,
			String dep, Date prom) {
		super(n, i, dt, ad, sal);
		departamento = dep;
		promoxaoAChefe = prom;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String resultado;
		resultado = super.toString() +"\n";
		resultado = resultado +"Departamento: "+departamento+"\n";
		resultado = resultado + "Data de promoção ao cargo: " + promoxaoAChefe;
		return resultado;
	}

	public String qualDepartamento() {
		return departamento;
	}
}
