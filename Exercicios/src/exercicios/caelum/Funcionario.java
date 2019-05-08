package exercicios.caelum;

//import pex0246.exercicios.DataEValida;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private double salario;
	private String RG;
	//private String dataDeEntradaNoBanco;
	private Data dataEntrad;
	
	void recebeAumento(double aumento) {
		aumento = aumento /100;
		
		if(departamento == "Diretoria") {
			this.salario = this.salario + (aumento * this.salario);
		}else {
			this.salario = this.salario + (aumento * this.salario);
		}
	}
	
	double calculoAnual() {
		return(this.salario*12);
	}
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("RG: " + this.RG);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario mensal: R$ " + this.salario);
		System.out.println("Salario anual: R$ " + this.calculoAnual());
		System.out.println("Data de entrada: " + this.dataEntrad.mostraData());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		
		f1.nome = "Romulo";
		f1.departamento = "Diretoria";
		f1.salario = 100;
		f1.recebeAumento(50);
		f1.dataEntrad = data;
		data.incializaData(3, 4, 1993);
		f1.mostra();
		
		/*Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario = 100;
		*/
		Funcionario f2 = new Funcionario();
		f2 = f1;
		if(f1 == f2) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
	}

}
