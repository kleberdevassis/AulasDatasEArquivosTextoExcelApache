package Modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas2 {
       
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");

		Date dataAualHoje = simpleDateFormat.parse("07/04/2021");
           // AFTER E BEFORE
		if (dataVencimentoBoleto.before(dataAualHoje)) {// ANTES da data atual
			System.out.println("Boleto vencido - Urgente");

		} else {
			System.out.println("Boleto não vencido");
		}

	}

}
