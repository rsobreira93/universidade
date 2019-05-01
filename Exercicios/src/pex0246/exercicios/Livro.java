package pex0246.exercicios;


public class Livro {
	private String nome;
	private String autor;
	private String genero;
	private int numPag;
	private int anoDeLancamento;
	private boolean estado;
	
	private void criaLivro(String nome, String autor, String genero, int pag, boolean estado, int anoDeLancamento) {
		this.autor = autor;
		this.nome = nome;
		this.genero = genero;
		this.numPag = pag;
		this.estado = estado;
		this.anoDeLancamento= anoDeLancamento;
	}
	
	private void abreLivro() {
		if(!this.estado)
			this.estado = true;
	}
	private void fechaLivro() {
		if(this.estado)
			this.estado = false;
	}
	private void mostraEstado() {
		System.out.println("Caracteristas do livro!");
		System.out.println("Nome do livro: " + this.nome);
		System.out.println("Autor: " + this.autor);
		System.out.println("Genero: " + this.genero);
		System.out.println("Ano de lançamento: " + this.anoDeLancamento);
		if(this.estado)
			System.out.println("O livro está aberto");
		else
			System.out.println("O livro está aberto");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro l = new Livro();
		
		l.criaLivro("Estruturas de Dados usando C", "Waldemar Celles", "Academico", 450, false, 2015);
		l.mostraEstado();
	}

}
