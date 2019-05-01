package pex0246.exercicios;

public class EmpregadoNovo {
	private String nome;
	private String departamento;
	private double horasTrabaladasNoMes;
	private double salarioPorHora;
	private double salario;
	
	private void inicializaEmpregado(String nome, String depart, double horas, double salPorHora) {
		this.nome = nome;
		this.departamento = depart;
		this.horasTrabaladasNoMes = horas;
		this.salarioPorHora = salPorHora;
	}
	
	private void calculaSalarioMensal() {
		if(this.departamento == "Diretoria") {
			this.salario = (this.horasTrabaladasNoMes * this.salarioPorHora);
			this.salario =  this.salario + (0.2 * this.salario) ;
			System.out.println("Salario: R$" + this.salario);
		}else {
			this.salario = this.horasTrabaladasNoMes * this.salarioPorHora;
			System.out.println("Salario: R$" + this.salario);
		}
	}
	private void mostraDados() {
		System.out.println("Dados do funcionario!");
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		//System.out.println("Salario: R$ "+this.salario);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpregadoNovo e1 = new EmpregadoNovo();
		e1.inicializaEmpregado("Romulo Sobreira", "Diretoria", 220, 9.09);
		e1.mostraDados();
		e1.calculaSalarioMensal();
	}


}
