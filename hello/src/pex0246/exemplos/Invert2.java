package pex0246.exemplos;

import java.util.Scanner;

public class Invert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int numeros_a_ler = 10;
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[numeros_a_ler];
		
		for(int i = 0; i < numeros.length; i ++) {
			System.out.println("Entre com o proximo inteiro: ");
			numeros[i] = sc.nextInt();
		}
		
		for(int i = numeros.length - 1; i >= 0; i-- )
			System.out.println(numeros[i]);
	}

}
