package com.sebasprog.demoMaven4.app.utilties;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Utility {

	public static Date convertiFecha(String fch) {
		SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
		Date date=null;
		try {
			date= formato.parse(fch);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
