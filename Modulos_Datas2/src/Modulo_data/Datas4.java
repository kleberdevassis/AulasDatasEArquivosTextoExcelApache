package Modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Datas4 {
	
	public static void main(String[] args) throws ParseException {
		
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-02-01"), LocalDate.now());
		System.out.println("Possui "+dias+ " dias entre a faixa de data");
		
	}

}
