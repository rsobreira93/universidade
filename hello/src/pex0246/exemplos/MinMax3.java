package pex0246.exemplos;


import java.util.Scanner;

public class MinMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;
		
		System.out.println("Entre com o primeiro inteiro: ");
		num = sc.nextInt();
		
		if(num < minimo) {
			minimo = num;
		}
		if(num > maximo) {
			maximo = num;
		}
		
		System.out.println("Entre com o segundo inteiro: ");
		num = sc.nextInt();
		
		if(num < minimo) {
			minimo = num;
		}
		if(num > maximo) {
			maximo = num;
		}
		
		System.out.println("Entre com o terceiro inteiro: ");
		num = sc.nextInt();
		
		if(num < minimo) {
			minimo = num;
		}
		if(num > maximo) {
			maximo = num;
		}
		
		System.out.println("O menor numero é: " + minimo);
		System.out.println("O maior numeor é: " + maximo);
	}
	

}
