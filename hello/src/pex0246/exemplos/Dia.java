package pex0246.exemplos;

public class Dia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int dias_na_semana = 7;
		final String[] diasDaSemana = { "", "Domingo", "Segunda", "Terça",
				"Quarta", "Quinta", "Sexta", "Sabado"};
		if(args.length != 1) {
			System.err.println("Sintaxe: dia número!");
			System.exit(1);
		}
		
		int dia = Integer.parseInt(args[0]);
		
		if(dia < 1 || dia > dias_na_semana) {
			System.err.println("O dia na semana deve estar entre 1 e " + dias_na_semana);
			System.exit(1);
		}
		
		System.out.println(diasDaSemana[dia]);
	}

}
