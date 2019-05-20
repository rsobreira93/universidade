package pex0246.exercicios;

/*Exercício 2.29:
Escreva a classe Contador que encapsule um valor usado para contagem de
itens ou eventos. Essa classe deve esconder o valor encapsulado de
programadores-usuários, fazendo com que o acesso ao valor seja feito através
de métodos que devem zerar, incrementar e imprimir o valor do contador*/

public class Contador {
	private int cont;
	
	public void inicializaContador() {
		this.cont = 0;
	}
	public int incrementa() {
		this.cont ++;
		return cont;
	}
	public void imprimeValor() {
		System.out.println(this.cont);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador c = new Contador();
		
		c.inicializaContador();
		c.incrementa();
		c.imprimeValor();
	}

}
