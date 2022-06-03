package Modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();

		Date date = new Date();

		System.out.println("data em milisegundos" + date.getTime());
		System.out.println("calendar em milisegundos : " + calendar.getTimeInMillis());

		System.out.println("dia do mes ->" + date.getDate());
		System.out.println("calendar dia do mes ->" + calendar.get(calendar.DAY_OF_MONTH));

		System.out.println("dia da semana ->" + date.getDay());
		System.out.println("calendar dia da semana ->" + (calendar.get(calendar.DAY_OF_WEEK) - 1));

		System.out.println("hora do dia ->" + date.getHours());
		System.out.println("calendar hora do dia ->" + calendar.get(calendar.HOUR_OF_DAY));

		System.out.println("minuto da hora ->" + date.getMinutes());
		System.out.println("calendar minuto da hora ->" + calendar.get(calendar.MINUTE));

		System.out.println("segundos ->" + date.getSeconds());
		System.out.println("calendar segundos ->" + calendar.get(calendar.SECOND));

		System.out.println("ano->" + (date.getYear() + 1900));
		System.out.println("calendar ano->" + (calendar.get(calendar.YEAR)));

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");

		System.out.println("data atual em formato Padrao e String -> " + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

		System.out.println("Data em formato para banco de dados -> " + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Objeto date -> " + simpleDateFormat.parse("1987-10-18 20:10.2"));

		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto date -> " + simpleDateFormat.parse("18/10/1987"));

	}

}
