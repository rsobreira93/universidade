package pex0246.exemplos;

import pex0246.exemplos.Data;

public class RegistroAcademico {
	private String nomeDoAluno;
	private int numeroDaMatricula;
	private Data dataDeNascimento;
	private boolean eBolsista;
	private int anoDaMatricula;
	
	private void inicializaRegistro(String nome, int matricula, Data data, boolean bolsa, int ano) {
		this.nomeDoAluno = nome;
		this.numeroDaMatricula = matricula;
		this.dataDeNascimento = data;
		this.eBolsista = bolsa;
		this.anoDaMatricula = ano;
	}
	private double calculaMensalidade() {
		double mensalidade = 400;
		if(this.eBolsista) {
			return (mensalidade/2);
		}
		return mensalidade;
	}
	
	private void mostrRegitro() {
		System.out.println("Nome: " + this.nomeDoAluno);
		System.out.println("Matricula: " + this.numeroDaMatricula);
		System.out.println("Data de nascimento: " + this.dataDeNascimento);
		if(this.eBolsista) {
			System.out.println("O aluno é bolsista");
		}else {
			System.out.println("O aluno não é bolsista");
		}
		System.out.println("Ano da matricula: " + this.anoDaMatricula);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data dc = new Data();
		RegistroAcademico ra = new RegistroAcademico();
		dc.inicializaData(3, 4, 1993);
		ra.inicializaRegistro("Romulo Ismael Pereira Sobreira", 2017021342, dc, false, 2017);
		
		ra.calculaMensalidade();
		ra.mostrRegitro();

	}

}
