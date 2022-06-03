package Modulo_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiaMesesAnosESemanas {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Data Atual -> "+localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		System.out.println("Dia da Semana "+localDate.getDayOfWeek().name());
		System.out.println("Dia do mes "+localDate.getDayOfMonth());
		System.out.println("Dia do ano °"+localDate.getDayOfYear());
		System.out.println("quantidade de dias do ano "+localDate.lengthOfYear());
		System.out.println("valor do mes"+localDate.getMonthValue());
		System.out.println("CE significa era comum (ou atual), \nenquanto BCE significa antes da era comum (ou atual) resultado-> "+localDate.getEra());
		
		
	}

}
