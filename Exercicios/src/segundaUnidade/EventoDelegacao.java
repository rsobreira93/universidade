package segundaUnidade;

import java.util.Date;

public class EventoDelegacao {

	private Date d1;
	private String Evento;
	
	public EventoDelegacao(Date dt, String nome) {
		// TODO Auto-generated constructor stub
		d1 = dt;
		Evento = nome;
	}
	
	@Override
	public String toString() {
		return "Nome do evento: "+Evento+ "\nData do evento: "+d1;
	}
}
