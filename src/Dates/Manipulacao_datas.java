package Dates;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Manipulacao_datas {
	public static void main(String[]args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2020-03-17T09:18:44Z"));
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		System.out.println("---------Brincando com a Data ------------");
		System.out.println("Adicionando 1 dia a + na data: ");
		cal.add(Calendar.DATE,1);
		d = cal.getTime();
		System.out.println(d);
		
		System.out.println();
		System.out.println("Adicionando 2 meses a + na data: ");
		cal.add(Calendar.MONTH, 2);
		d = cal.getTime();
		System.out.println(d);
		
		
		System.out.println();
		System.out.println("Obtendo os minutos e dia , da data: ");
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		int segundos = cal.get(Calendar.SECOND);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		System.out.println("Segundos: " + segundos);
		
	
	}

}
