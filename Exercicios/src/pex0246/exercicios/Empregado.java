package pex0246.exercicios;

public class Empregado {
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
		this.salario = this.horasTrabaladasNoMes * this.salarioPorHora;
	}
	private void mostraDados() {
		System.out.println("Dados do funcionario!");
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: R$ "+this.salario);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado e1 = new Empregado();
		e1.inicializaEmpregado("Romulo Sobreira", "Exatas", 220, 9.09);
		e1.calculaSalarioMensal();
		e1.mostraDados();
	}

}
