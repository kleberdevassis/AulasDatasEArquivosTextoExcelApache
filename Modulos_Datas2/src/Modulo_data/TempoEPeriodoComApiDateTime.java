package Modulo_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TempoEPeriodoComApiDateTime {

	public static void main(String[] args) {

		LocalDate dataBase = LocalDate.parse("2019-10-05");

		System.out.println("Mais 5 dias " + (dataBase = dataBase.plusDays(5)));
		System.out.println("Mais 5 semanas " + (dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais 5 anos " + (dataBase = dataBase.plusYears(5)));
		System.out.println("Mais 5 meses " + (dataBase = dataBase.plusMonths(2)));
		System.out.println("Menos 5 dias " + (dataBase = dataBase.minusDays(3)));

		LocalDate fatura = LocalDate.parse("2022-06-03");

		for (int parcela = 1; parcela <= 12; parcela++) {
			fatura = fatura.plusMonths(1);

			System.out.println("Data de vencimento do boleto:"
		+ fatura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mes : " + parcela);

		}

	}

}
