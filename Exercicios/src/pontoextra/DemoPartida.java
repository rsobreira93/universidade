package pontoextra;

import java.time.LocalDate;

public class DemoPartida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogador j1 = new Jogador("Romulo Sobreira", 26, 50);
		j1.setTipo("Atacante");
		j1.getHabilidade();
		j1.somaGol();
		j1.somaGol();
		j1.somaGol();
		Jogador j2 = new Jogador("Ana Paula", 20, 60);
		j2.setTipo("Goleiro");
		j2.getHabilidade();
		Jogador j3 = new Jogador("Euder Sena", 22, 70);
		j3.setTipo("Defensor");
		j3.getHabilidade();
		Jogador j4 = new Jogador("Jose Souza", 25, 30);
		j4.setTipo("Defensor");
		j4.getHabilidade();
		Jogador j5 = new Jogador("João da Silva", 19, 90);
		j5.setTipo("Meia");
		j5.getHabilidade();
		Jogador j6 = new Jogador("Vaca morta", 27, 35);
		j6.setTipo("Meia");
		j6.getHabilidade();
		Jogador j7 = new Jogador("Cronaldo do Nordeste", 33, 98);
		j7.setTipo("Meia");
		j7.getHabilidade();
		
		Jogador j8 = new Jogador("Ramon Sousa", 26, 50);
		Jogador j9 = new Jogador("Geovane dos Santos", 20, 60);
		Jogador j10 = new Jogador("Obinna Queiroz", 22, 70);
		Jogador j11 = new Jogador("João victor", 25, 30);
		Jogador j12 = new Jogador("Larissa Milena", 19, 90);
		Jogador j13 = new Jogador("Messi do sertão", 29, 99);
		Jogador j14 = new Jogador("Não tive ideia", 25, 100);
		
		Time t1 = new Time("Juventus");
		Time t2 = new Time("Corinthians");
		
		t1.insertJogador(j1);
		t1.insertJogador(j2);
		t1.insertJogador(j3);
		t1.insertJogador(j4);
		t1.insertJogador(j5);
		t1.insertJogador(j6);
		t1.insertJogador(j7);
	
		t2.insertJogador(j8);
		t2.insertJogador(j9);
		t2.insertJogador(j10);
		t2.insertJogador(j11);
		t2.insertJogador(j12);
		t2.insertJogador(j13);
		t2.insertJogador(j14);
		
		LocalDate dia = LocalDate.of(2010,3,4);
		Partida p1 = new Partida(dia, t1, t2);
		
		System.out.println();
		t1.imprimeJogadores();
		System.out.println();
		t2.imprimeJogadores();
		System.out.println();
		
		p1.golFora();
		p1.golFora();
		p1.golFora();
		p1.golCasa();
		p1.golCasa();
		
		t1.somaDerota();
		t2.somaVitoria();
		
		System.out.println(t2.getNome());
		System.out.println(t2.getResultado());
		
		System.out.println();
		System.out.println("Data da partida: " + p1.data1);
		System.out.println(p1.getPlacar()); 
		
		j1.mostrDadosJogador();
		j2.mostrDadosJogador();
		j3.mostrDadosJogador();
		j4.mostrDadosJogador();
		j5.mostrDadosJogador();
		j6.mostrDadosJogador();
		j7.mostrDadosJogador();
	}

}
