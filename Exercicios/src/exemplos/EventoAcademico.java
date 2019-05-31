package exemplos;

/*A classe evento academico representa um congresso, etc*/
public class EventoAcademico {

	private String nomeEvento, localEvento;
	private Data inicioEvento, fimEvento;
	private int numeroDeParticipante;
	
	/*Construtor*/
	EventoAcademico(String ne, String le, Date ini, Date fim, int np){
		nomeEvento = ne;
		localEvento = le;
		inicioEvento = ini;
		fimEvento = fim;
		numeroDeParticipante = np;
	}
	
}
