package br.com.umdesenvolvedor.catFx.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {

	public static Date stringToDate(String data) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataFormatada = null;
		
		try {
			
			dataFormatada = format.parse(data);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return dataFormatada;
	}
	
	//2019-05-18 20:34:50.0
	public static String formataData(Date data, String mascara) {
		mascara = mascara != null ? mascara : "dd/MM/yyyy";
		
		DateFormat format = new SimpleDateFormat(mascara);
		
		String dataFormatada = null;
		
		dataFormatada = format.format(data);
		
		return dataFormatada;
	}
	
	public static String formataData(Date data) {
		return formataData(data, null);
	}
}
