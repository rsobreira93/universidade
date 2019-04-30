package pex0246.exemplos;

public class ContaBancariaSimples {
	private String nomeDoCorrentista;
	private double saldo;
	private boolean contaEspecial;
	
	private void abreConta(String nome, double saldo, boolean especial) {
		this.nomeDoCorrentista = nome;
		this.saldo = saldo;
		this.contaEspecial = especial;
	}
	private void abreContaSimples(String nome) {
		this.nomeDoCorrentista = nome;
		this.saldo = 0.0f;
		this.contaEspecial = false;
	}
	private void deposita(double deposito) {
		this.saldo += deposito;	
	}
	private void retira(double valor) {
		if(!this.contaEspecial) {
			if(valor <= saldo) {
				this.saldo -= valor;
			}
		}else {
			this.saldo -= valor;
		}
	}
	private void mostraDados() {
		System.out.println("Nome do correntista: " + this.nomeDoCorrentista);
		System.out.println("Saldo da conta: " + this.saldo);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancariaSimples cb = new ContaBancariaSimples();
		cb.abreContaSimples("Romulo Sobreira");
		cb.abreConta("Romulo Sobreira", 1000.00, true);
		cb.deposita(500.00);
		cb.retira(1600.00);
		cb.mostraDados();
	}

}
