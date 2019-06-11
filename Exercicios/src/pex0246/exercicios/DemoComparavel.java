package pex0246.exercicios;

public class DemoComparavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparavel meuValor = new Comparavel(123);
		
		double valor1 = 120;
		double valor2 = 122;
		if(meuValor.eIgual(valor1)) {
			System.out.println("Os valores "+meuValor+" e "+ valor1 + " são iguais.");
		}
		if(meuValor.eIgual(valor1, valor2)) {
			System.out.println("Os valores "+meuValor+", "+ valor2+ " e "+valor1+ "são iguais.");
		}
		if(meuValor.eMaiorQue(valor1)) {
			System.out.println("O valor "+meuValor+" é maior que o valor "+valor1);
		}
		if(meuValor.eMaiorQue(valor1, valor2)) {
			System.out.println("O valor "+meuValor+" é maior que os valores "+valor1+" e "+valor2);
		}
		if(meuValor.eMenorQue(valor1)) {
			System.out.println("O valor "+meuValor+ " é menor que o valor "+valor1);
		}
		if(meuValor.eMenorQue(valor1, valor2)) {
			System.out.println("O valor "+meuValor+" é menor que os valores "+valor1+ " e "+valor2);
		}
	}

}
