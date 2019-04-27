package pex0246.exemplos;


import java.util.Scanner;

public class MinMax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Entre com o primeiro inteiro: ");
		n1 = sc.nextInt();
		
		System.out.println("Entre com o segundo inteiro: ");
		n2 = sc.nextInt();
		
		System.out.println("Entre com o terceiro inteiro: ");
		n3 = sc.nextInt();
		
		int minimo, maximo;
		
		if(n1 > n2) {
			if(n1 > n3) {
				if(n2 < n3) {
					minimo = n2;
				}else {
					minimo = n3;
				}
				maximo = n1;
			}else {
			if(n1 < n2) {
				minimo = n1;
			}else {
				minimo = n2;
			}
			maximo = n3;
		}
	}else {
		if(n2 > n3) {
			if(n1 < n3) {
				minimo = n1;
			}else {
				minimo = n3;
			}
			maximo = n3;
		}else {
			if(n1 < n2) {
				minimo = n1;
			}else {
				minimo = n3;
			}
			maximo = n3;
		}
	}
		System.out.println("O menor numero é: " + minimo);
		System.out.println("O maior nuemro é: " + maximo);
}

}
