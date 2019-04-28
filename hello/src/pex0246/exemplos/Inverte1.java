package pex0246.exemplos;

import java.util.Scanner;

public class Inverte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Entre com o proximo inteiro: ");
			numeros[i] = sc.nextInt();
		}
		
		for(int i = 10-1; i >= 0; i--)
			System.out.print(numeros[i] + " ");
	}

}
