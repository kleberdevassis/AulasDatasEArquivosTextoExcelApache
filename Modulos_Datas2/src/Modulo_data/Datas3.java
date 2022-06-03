package Modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas3 {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance(); // pega a data atual
		// simular que data vem do banco de dados

		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2021")); // definindo uma data qualquer

		calendar.add(calendar.MONTH, 1); //data de hoje + 1mes

		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

		calendar.add(calendar.DAY_OF_MONTH, 1); // data +1 dia
		
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(calendar.YEAR, 1); // adicionando 1 ano
		
	}

}
