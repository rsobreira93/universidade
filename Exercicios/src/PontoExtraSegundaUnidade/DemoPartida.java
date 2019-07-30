package PontoExtraSegundaUnidade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoPartida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat strDf = new SimpleDateFormat("20/07/2019");
		Date dat = new Date();
		JogadorAtacante j1 = new JogadorAtacante("Romulo Sobreira", 26, 75, 75, 88);
		JogadorAtacante j2 = new JogadorAtacante("João Victor", 25, 77, 66, 66);
		JogadorGoleiro j3 = new JogadorGoleiro("Euder Sena", 23, 88, 50, 1.7f);
		JogadorDefesa j4 = new JogadorDefesa("Ana Paula", 23, 77, 66, 99);
		JogadorDefesa j5 = new JogadorDefesa("Eduardo Duarte", 21, 40, 32, 66);
		
		JogadorGoleiro j6 = new JogadorGoleiro("Joelton Santana", 24, 99, 75, 1.2f);
		JogadorDefesa j7 = new JogadorDefesa("Jhon Mago", 23, 44, 99, 32);
		JogadorDefesa j8 = new JogadorDefesa("Raito Ne", 27, 80, 75, 69);
		JogadorAtacante j9 = new JogadorAtacante("Luiz Pordeus", 21, 75, 65, 74);
		JogadorAtacante j10 = new JogadorAtacante("Vaca Atolada", 33, 100, 100, 100);
		
		Time t1 = new Time("Corinthians");
		Time t2 = new Time("Juventos");
		
		t1.insereJogador(j1);
		t1.insereJogador(j2);
		t1.insereJogador(j3);
		t1.insereJogador(j4);
		t1.insereJogador(j5);
		
		
		Partida p1 = new Partida(dat, t1, t2);
		
	}


}
