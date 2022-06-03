package Modulo_data;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class NovaApiDataHora {

	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();

		System.out.println("data atual " + dataAtual);

		LocalTime horaAtual = LocalTime.now();

		System.out.println("hora atual " + horaAtual);

		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();

		System.out.println("data e hora atual " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String dataFormatada = dataAtualHoraAtual.format(formatter);

		System.out.println("data atualizada " + dataFormatada);

	}

}
