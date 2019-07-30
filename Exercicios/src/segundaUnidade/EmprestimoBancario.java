package segundaUnidade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmprestimoBancario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat strDf = new SimpleDateFormat("03/04/1993");
		Date d1 = new Date();
		DateFormat strf = new SimpleDateFormat("05/03/2010");
		Date d2 = new Date();
		DateFormat str = new SimpleDateFormat("05/03/2010");
		Date d3 = new Date();
		Pessoa p1 = new Pessoa("Kurt Godel", 10973213, d1);
		Funcionario f1 = new Funcionario("Henri Poincaré", 19283712, d1, d2, 2500.0f);
		Funcionario f2 = new Funcionario("Paul Dirac", 98736812, d1, d2, 3200.0f);
		Funcionario f3 = new Funcionario("Wolfgang Pauli", 33886620, d2, d1, 3600.0f);
		ChefeDepartamento c1 =  new ChefeDepartamento("Edwin Hubble", 425782, d1, d2, 4100.0f,"Laboratório de Astorfísica", d3);
		System.out.println(calculaEmprestimo(p1));
		System.out.println(calculaEmprestimo(f1));
		System.out.println(calculaEmprestimo(f2));
		System.out.println(calculaEmprestimo(f3));
		System.out.println(calculaEmprestimo(c1));
	}
	/*public static float calculaEmprestimo(Pessoa p) {
		return 1000.0f;
	}
	public static float calculaEmprestimo(Funcionario f) {
		float emprestimo = 0f;
		if(f instanceof ChefeDepartamento) {
			emprestimo = 4.0f * f.qualSalario();
		}else if(f instanceof Funcionario) {
			emprestimo = 2.0f * f.qualSalario();
		}
		return emprestimo;
	}*/
	public static float calculaEmprestimo(Pessoa p) {
		float emprestimo = 100.0f;
		if(p instanceof ChefeDepartamento) {
			ChefeDepartamento temporario = (ChefeDepartamento) p;
			emprestimo = 4.0f * temporario.qualSalario();
		}else if(p instanceof Funcionario) {
			Funcionario temp = (Funcionario) p;
			emprestimo = 2.0f * temp.qualSalario();
		}
		return emprestimo;
	}
}
