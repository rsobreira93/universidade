package pexe0246.exercicios;

public class Livro {
	private String genero;
	private String autor;
	private int numPaginas;
	private String editora;
	private String nome;
	private boolean aberto;
	
	public void criaLivro(String nome, String autor, String genero, int pag, String editora) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.genero = genero;
		this.numPaginas = pag;
	}
	
	private void abreLivro() {
		if(!this.aberto)
			this.aberto = true;
	}
	private void fechaLivro() {
		if(this.aberto)
			this.aberto = false;
	}
	private void mostraDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Autor: "+this.autor);
		System.out.println("Numero Paginas: "+this.numPaginas);
		System.out.println("Editora: "+this.editora);
		if(this.aberto)
			System.out.println("Livro aberto!");
		else
			System.out.println("Livro fechado!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro l = new Livro();
		l.criaLivro("Estrutura de Dados", "Waldmar celles", "Academico", 450, "Elisilver");
		l.fechaLivro();
		l.mostraDados();
	}

}
