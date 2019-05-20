package pex0246.exercicios;

import java.util.Scanner;


public class ContagemSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		int soma = 0;
		int cont = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + i + "° valor: ");
			n = sc.nextInt();
			if( n >= 10 && n <= 20) {
				soma ++;
			}else {
				cont ++;
			}
		}
		System.out.println("Estão no intervalo: " + soma);
		System.out.println("Não estão no intervalo: " + cont);
	}

}
