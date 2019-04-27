package pex0246.exemplos;


import java.util.Scanner;

public class MinMax1 {

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
		
		if(n1 > n2) {
			if(n1 > n3) {
				if(n2 < n3) {
					System.out.println("O menor numero é: " + n2);
				}else {
					System.out.println("O menor numero é: " + n3);
				}
				System.out.println("O maior numero é: " + n1);
			}else {
				if(n1 < n2) {
					System.out.println("O menor numero é: " + n1);
				}else {
					System.out.println("o menor numero é: " + n2);
				}
				System.out.println("O maior numero é: " + n3);
			}
		}else {
			if(n2 > n3) {
				if(n1 < n3) {
					System.out.println("O menor numero é: " + n1);
				}else {
					System.out.println("O menor nuemro é: " + n3);
				}
				System.out.println("O maior numero é: " + n2);
			}else {
				if(n1 < n2) {
					System.out.println("O menor numero é: " + n1);
				}else {
					System.out.println("O menor numero é: " + n2);
				}
				System.out.println("O maior nuemro é: " + n3);
			}
	}
}

}
