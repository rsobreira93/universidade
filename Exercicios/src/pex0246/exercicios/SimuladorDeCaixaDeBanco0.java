package pex0246.exercicios;

public class SimuladorDeCaixaDeBanco0 {

	private int numeroDoCliente;
	private int numeroDoCaixa;
	
	public SimuladorDeCaixaDeBanco0(int n) {
		// TODO Auto-generated constructor stub
		numeroDoCaixa = n;
		numeroDoCliente = 0;
		System.out.println("Caixa " + numeroDoCaixa +
				" inciou a operação");
	}
	public void proximoAtendimento() {
		numeroDoCliente ++;
		System.out.print("Cliente com a senha número " +
		numeroDoCliente+".");
		System.out.println("dirigir-se ai cuaxa de número "+
		numeroDoCaixa+".");
	}
}
