package segundaUnidade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoEventoDelegacao {

	public static void main(String[] args) {
		DateFormat strDf = new SimpleDateFormat("03/04/1993");
		Date date = new Date();
		EventoDelegacao e1 = new EventoDelegacao(date, "ECOP");
		System.out.println(e1);
	}

	
}
