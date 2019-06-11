package pex0246.exercicios;

public class SimuladorDeCaixaDeBanco {

	static private int numeroDoCliente;
	private int numeroDoCaixa;
	
	public SimuladorDeCaixaDeBanco(int n) {
		// TODO Auto-generated constructor stub
		numeroDoCaixa = n;
		numeroDoCliente = 0;
		System.out.println("Caixa "+ numeroDoCaixa+" iniciou a operação");
	}
	public void proximoAtendimento() {
		numeroDoCliente = numeroDoCliente + 1;
		System.out.print("Cliente com a senha número " + numeroDoCliente+ ", favor");
		System.out.println("dirigir-se ao caixa de número: "+numeroDoCaixa+".");
	}
}
