package pex0246.exemplos;


import java.util.Scanner;

public class MinMax5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int numeros_a_ler = 3;
		
		Scanner sc = new Scanner(System.in);
		
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;
		
		for(int i = 0; i < numeros_a_ler; i ++) {
			int num = recebeProximoInteiro(sc);
			minimo = menorNumeroEntre(minimo, num);
			maximo = maiorNumeroEntre(maximo, num);
		}
		System.out.println("O menor numero é: " + minimo);
		System.out.println("O maior numero é: " + maximo);
	}
private static int maiorNumeroEntre(int n1, int n2) {
	return n2 > n1? n2: n1;
}
private static int menorNumeroEntre(int n1, int n2) {
	return n2 < n1? n2: n1;
}
private static int recebeProximoInteiro(Scanner sc) {
	System.out.println("Entre com o proximo inteiro: ");
	int num = sc.nextInt();
	return num;
}
}
