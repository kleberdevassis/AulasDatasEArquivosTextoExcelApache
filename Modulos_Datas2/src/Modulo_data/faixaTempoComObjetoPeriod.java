package Modulo_data;

import java.time.LocalDate;
import java.time.Period;

public class faixaTempoComObjetoPeriod {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.of(2019, 03, 22);

		LocalDate dataNova = LocalDate.of(2022, 06, 3);

		System.out.println("data antiga � posterior a nova? " + dataAntiga.isAfter(dataNova));

		System.out.println("data antiga � anterior que a nova? " + dataAntiga.isBefore(dataNova));

		System.out.println("Data s�o iguais? " + dataAntiga.isEqual(dataNova));

		Period periodo = Period.between(dataAntiga, dataNova);

		System.out.println("dias entre as datas " + periodo.getDays());
		System.out.println("meses entre as datas " + periodo.getMonths());
		System.out.println("anos entre as datas " + periodo.getYears());

		System.out.println("O periodo � de " + periodo.getYears() + " anos " + periodo.getMonths() + " meses" + " e "
				+ periodo.getYears() + " dias");

		System.out.println("somente meses " + periodo.toTotalMonths());

	}

}
