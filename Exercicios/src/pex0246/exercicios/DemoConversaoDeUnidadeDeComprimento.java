package pex0246.exercicios;

public class DemoConversaoDeUnidadeDeComprimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConversaoDeUnidadeDeComprimento conv = null;
		System.out.println("Vinte pés são: " + conv.pesParaCentimetros(20)+ " centímetros");
		System.out.println("Cinco polegadas são: " + conv.polegadasParaCentimetros(5) + " centímetros");
		
		//muito mais pratico acessar os metodos diretamente
		System.out.println("Vinte pés são: " + ConversaoDeUnidadeDeComprimento.pesParaCentimetros(20)+" centímetros");
		System.out.println("Cinco polegadas são: " + ConversaoDeUnidadeDeComprimento.polegadasParaCentimetros(5) + " centímetros");
	}

}
