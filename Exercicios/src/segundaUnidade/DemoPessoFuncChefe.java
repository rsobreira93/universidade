package segundaUnidade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoPessoFuncChefe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat strDf = new SimpleDateFormat("03/04/1993");
		Date date = new Date();
		DateFormat str = new SimpleDateFormat("10/07/2009");
		Date date1 = new Date();
		DateFormat str1 = new SimpleDateFormat("10/07/2009");
		Date date2 = new Date();
		Pessoa p1 = new Pessoa("Romulo", 3242935, date);
		System.out.println(p1);
		System.out.println();
		Funcionario f1 = new Funcionario("Romulo Sobreira", 3242935, date, date1, 1500.0f);
		System.out.println(f1);
		System.out.println();
		ChefeDepartamento c1 = new ChefeDepartamento("Romulo Ismael Pereira", 3242935, date, date1, 1500.f, "Exatas", date2);
		System.out.println(c1);
	}

}
