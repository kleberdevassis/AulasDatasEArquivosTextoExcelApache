package Modulo_data;

import java.time.LocalDate;
import java.time.Period;

public class faixaTempoComObjetoPeriod {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.of(2019, 03, 22);

		LocalDate dataNova = LocalDate.of(2022, 06, 3);

		System.out.println("data antiga é posterior a nova? " + dataAntiga.isAfter(dataNova));

		System.out.println("data antiga é anterior que a nova? " + dataAntiga.isBefore(dataNova));

		System.out.println("Data são iguais? " + dataAntiga.isEqual(dataNova));

		Period periodo = Period.between(dataAntiga, dataNova);

		System.out.println("dias entre as datas " + periodo.getDays());
		System.out.println("meses entre as datas " + periodo.getMonths());
		System.out.println("anos entre as datas " + periodo.getYears());

		System.out.println("O periodo é de " + periodo.getYears() + " anos " + periodo.getMonths() + " meses" + " e "
				+ periodo.getYears() + " dias");

		System.out.println("somente meses " + periodo.toTotalMonths());

	}

}
