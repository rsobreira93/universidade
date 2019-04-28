package pex0246.exemplos;

import java.util.Scanner;

public class Aposentadoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double quantia_minima_total = 10000;
		final double menor_contribuicao = 200;
		
		System.out.println("Quanto dinheiro vc quer para se aposentar? ");
		double alvo = receDoubleMaiorQue(quantia_minima_total);
		
		System.out.println("Quanto dinheiro vc vai contribuir todo ano? ");
		double contribuicaoAnual = receDoubleMaiorQue(menor_contribuicao);
		
		System.out.println("Taxa de juros (ex.: digite 0,075 para 7,5%): ");
		double juros = recebePercentual();
		
		System.out.println("Voce pode se aposentar em " + computaAnosDeContribuicao(alvo, contribuicaoAnual, juros) + "anos");
		
	}
	private static int computaAnosDeContribuicao(double alvo, double contribuicao, double juros) {
		int anos = 0;
		double saldo = 0;
		
		while(saldo < alvo) {
			saldo = (saldo + contribuicao)*(1 + juros);
			anos++;
		}
		return anos;
	}
	private static double recebePercentual() {
		Scanner sc = new Scanner(System.in);
		if(!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Voce deve digitar um valor real entre 0 e 1. ");
			return recebePercentual();
		}
		double valor = sc.nextDouble();
		
		if(valor > 1 || valor < 0) {
			System.out.println("Voce deve digitar um valor real entre 0 e 1. ");
			return recebePercentual();
		}
		return valor;
	}
	private static double receDoubleMaiorQue(double minimo) {
		Scanner sc = new Scanner(System.in);
		
		if(!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Voce deve digitar um valor real maior que " + minimo);
			return receDoubleMaiorQue(minimo);
		}
		
		double valor = sc.nextDouble();
		
		if(valor < minimo) {
			System.out.println("Voce deve digitar uma valore real maior que " + minimo);
			return receDoubleMaiorQue(minimo);
		}
		return valor;
	}

}
