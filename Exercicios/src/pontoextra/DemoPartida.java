package pontoextra;

import java.util.Date;

public class DemoPartida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogador j1 = new Jogador("Romulo Sobreira", 26, 50);
		j1.setTipo("Atacante");
		j1.getHabilidade();
		j1.somaGol();
		j1.somaGol();
		j1.somaGol();
		System.out.println("Get gols  " + j1.getGols());
		Jogador j2 = new Jogador("Ana Paula", 20, 60);
		Jogador j3 = new Jogador("Euder Sena", 22, 70);
		Jogador j4 = new Jogador("Jose Souza", 25, 30);
		Jogador j5 = new Jogador("João da Silva", 19, 90);
		Jogador j11 = new Jogador("Vaca morta", 27, 35);
		Jogador j13 = new Jogador("Cronaldo do Nordeste", 33, 98);
		
		Jogador j6 = new Jogador("Ramon Sousa", 26, 50);
		Jogador j7 = new Jogador("Geovane dos Santos", 20, 60);
		Jogador j8 = new Jogador("Obinna Queiroz", 22, 70);
		Jogador j9 = new Jogador("João victor", 25, 30);
		Jogador j10 = new Jogador("Larissa Milena", 19, 90);
		Jogador j12 = new Jogador("Messi do sertão", 29, 99);
		Jogador j14 = new Jogador("Não tive ideia", 25, 100);
		
		Time t1 = new Time("Juventus");
		Time t2 = new Time("Corinthians");
		
		t1.insertJogador(j1);
		t1.insertJogador(j2);
		t1.insertJogador(j3);
		t1.insertJogador(j4);
		t1.insertJogador(j5);
		t1.insertJogador(j11);
		t1.insertJogador(j13);
	
		t2.insertJogador(j6);
		t2.insertJogador(j7);
		t2.insertJogador(j8);
		t2.insertJogador(j9);
		t2.insertJogador(j10);
		t2.insertJogador(j12);
		t2.insertJogador(j14);
		
		System.out.println();
		t1.imprimeJogadores();
		t2.imprimeJogadores();
		System.out.println();
		
		Date dt = new Date();
		Partida p1 = new Partida(dt, t1, t2);
		
		p1.golFora();
		p1.golFora();
		p1.golFora();
		p1.golCasa();
		p1.golCasa();
		
		System.out.println();
		System.out.println(p1.getPlacar()); 
		System.out.println("Data da partida: " + p1.getData());
		
		j1.mostrDadosJogador();
	}

}
