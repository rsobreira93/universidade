package pex0246.exercicios;

import pex0246.exercicios.Livro;

public class LivroDeBiblioteca {
	Livro l = new Livro();
	private boolean disponivel;
	
	
	private void empretimo() {
		if(this.disponivel == true ){
			System.out.println("O livro pode ser emprestado");
		}else {
			System.out.println("O livro não está disponivel para ser emprestado");
		}
	}
	public void devolucao() {
		this.l.mostraEstado();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LivroDeBiblioteca lb = new LivroDeBiblioteca();
		lb.l.criaLivro("asas ", "sasas ", "asasas ", 150, true, 2017);
		lb.disponivel = false;
		lb.empretimo();
		lb.devolucao();
	}

}