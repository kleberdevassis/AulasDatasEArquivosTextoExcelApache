package Modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasVencimento {
	
	public static void main(String[] args) throws ParseException {
		
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse("02/06/2022");
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		
		for (int vencimento = 1; vencimento <= 12; vencimento++) {
			calendar.add(calendar.MONTH, 1);
			
			System.out.println("parcela numero"+ vencimento + "vence na data ->"+ new SimpleDateFormat().format(calendar.getTime()));
		}
	}

}
