package pexe0246.exercicios;

public class ContaBancariaSimples {
	private String nomeDoCorrentista;
	private double saldo;
	private boolean contaEspecial;
	
	private void abreConta(String nome, double saldo, boolean especial) {
		this.nomeDoCorrentista = nome;
		this.saldo = saldo;
		if(this.saldo < 0)
			this.saldo = 0.0f;
		this.contaEspecial = especial;
	}
	private void criaContaSimples(String nome) {
		this.nomeDoCorrentista = nome;
		this.saldo = 0.0f;
		this.contaEspecial = false;
	}
	private void depositar(double v) {
		this.saldo += v;
	}
	private void retira(double v) {
		if(!this.contaEspecial) {
			if(v <= this.saldo) {
				this.saldo -= v;
			}
		}else {
			this.saldo -= v;
		}
	}
	private void mostraDados() {
		System.out.println("Nome: "+this.nomeDoCorrentista);
		System.out.println("Saldo: "+this.saldo);
		if(this.contaEspecial)
			System.out.println("Conta espcial!");
		else
			System.out.println("Conta não espcial!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancariaSimples cb = new ContaBancariaSimples();
		cb.abreConta("Romulo Sobreira", 1000, true);
		cb.depositar(500);
		cb.mostraDados();
	}

}
