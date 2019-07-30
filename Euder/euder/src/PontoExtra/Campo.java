package PontoExtra;

import java.util.Date;
import java.util.Random;

public class Campo {

	public static void main(String[] args) {
		Date dat = new Date();
		Random temp = new Random();
		Jogador[] pTime1 = new Jogador[8];
		Jogador[] pTime2 = new Jogador[8];

		Time tCasa = new Time("Avengers");
		Time tVisitante = new Time("Evil Praise");

		Partida partida = new Partida(dat, tCasa, tVisitante);
		
				  //new Jogador(pNom, pIda, pHab)
		pTime1[0] = new Jogador("Jarvis", 32, 69);
		pTime1[1] = new Jogador("Tony", 49, 36);
		pTime1[2] = new Jogador("Cap. Marvel", 23, 99);
		pTime1[3] = new Jogador("Thor", 580, 79);
		pTime1[4] = new Jogador("Steve", 75, 58);
		pTime1[5] = new Jogador("Groot", 18, 7);
		pTime1[6] = new Jogador("Scarlett", 27, 49);
		pTime1[7] = new Jogador("GaviGod", 35, 100);

		pTime2[0] = new Jogador("ultron", 32, 72);
		pTime2[1] = new Jogador("Thanos", 54, 98);
		pTime2[2] = new Jogador("Killmonger", 25, 87);
		pTime2[3] = new Jogador("Loki", 580, 89);
		pTime2[4] = new Jogador("Ossos Cruzados", 77, 55);
		pTime2[5] = new Jogador("Minion", 19, 10);
		pTime2[6] = new Jogador("Buck", 27, 62);
		pTime2[7] = new Jogador("Dormammu", 999, 100);

		
		for (int i = 0; i < pTime1.length; i++) {
			tCasa.insertJogador(pTime1[i]);
			tVisitante.insertJogador(pTime2[i]);
			pTime1[i].setCamisa(101 + temp.nextInt(99));
			pTime2[i].setCamisa(201 + temp.nextInt(99));
			// (01 goleiro, 02 defensores, 03 meias(Nao tem) e 02 atacantes
			if (i > 5) {
				pTime1[i].setTipo("Atacante");
				pTime2[i].setTipo("Atacante");

			} else if (i <= 5 && i <= 1) {
				pTime1[i].setTipo("Defensores");
				pTime2[i].setTipo("Defensores");

			} else {
				pTime1[i].setTipo("Goleiro");
				pTime2[i].setTipo("Goleiro");
			}

		}

		for (int j = 0; j < 5; j++) {
			int aux = 1 + temp.nextInt(100); // Seleciona um time aleatorio; Menos que 50 time de casa,maior que 50 time visitante
								
			if (aux > 50) {//Casa
				aux = temp.nextInt(8); // Selecionma um jogador aleatorio;

				System.out.println("------------------------------------------------------------");
				if (pTime1[aux].getHabilidade() > 75) {
					partida.golCasa();
					pTime1[aux].somaGol();
					System.out.println(
							"Eeeeee GOLLLLL!!!! O CAMISA  " + pTime1[aux].getCamisa() + " Do time " + tCasa.getNome());
					System.out.println("O jogador(a) " + pTime1[aux].getNome() + ", Faz o seu " + pTime1[aux].getGols()
							+ " na partida.");
					System.out.println(
							"O " + pTime1[aux].getTipo() + " Com habilidade geral de " + pTime1[aux].getHabilidade());

				} else {
					System.out.println(
							"Eeeee na trave.....O CAMISA  " + pTime1[aux].getCamisa() + " Do time " + tCasa.getNome());
					System.out.println("O jogador(a) " + pTime1[aux].getNome() + ", Quase faz o seu "
							+ (pTime1[aux].getGols() + 1) + " na partida.");
					System.out.println(
							"O " + pTime1[aux].getTipo() + " Com habilidade geral de " + pTime1[aux].getHabilidade());
				}

			} else {
				aux = temp.nextInt(8);// Selecionma um jogador aleatorio;

				System.out.println("------------------------------------------------------------");
				if (pTime2[aux].getHabilidade() > 75) {

					partida.golsVisitante();
					pTime2[aux].somaGol();
					System.out.println("Eeeeee GOLLLLL!!!! O CAMISA  " + pTime2[aux].getCamisa() + " Do time "
							+ tVisitante.getNome());
					System.out.println("O jogador(a) " + pTime2[aux].getNome() + ", Faz o seu " + pTime2[aux].getGols()
							+ " na partida.");
					System.out.println(
							"O " + pTime2[aux].getTipo() + " Com habilidade geral de " + pTime2[aux].getHabilidade());

				} else {
					System.out.println("Eeeee na trave.....O CAMISA  " + pTime2[aux].getCamisa() + " Do time "
							+ tVisitante.getNome());
					System.out.println("O jogador(a) " + pTime2[aux].getNome() + ", Quase faz o seu "
							+ (pTime2[aux].getGols() + 1) + " na partida.");
					System.out.println(
							"O " + pTime2[aux].getTipo() + " Com habilidade geral de " + pTime2[aux].getHabilidade());
				}
			}
		}
		System.out.println("\n============================================");
		System.out.println(partida.getPlacar());
		System.out.println("============================================\n");
				
		
		System.out.println(partida.getData().getMonth());
		/*
		 * nao consegui manipular corretamente 
		 */
	}

}
