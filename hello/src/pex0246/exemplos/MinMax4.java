package pex0246.exemplos;

import java.util.Scanner;

public class MinMax4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int numeros_a_ler = 3;
		
		Scanner sc = new Scanner(System.in);
		
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;
		
		for(int i = 0; i < numeros_a_ler; i ++) {
			System.out.println("Entre com o proximo inteiro: ");
			int num = sc.nextInt();
			if(num < minimo) {
				minimo = num;
			}
			if(num > maximo) {
				maximo = num;
			}
		}
		System.out.println("O menor numero é: " + minimo);
		System.out.println("O maior numero é: " + maximo);
	}

}
