package com.sebasprog.demoMaven4.app.utilties;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utility {
	
	public static Date convertirFecha(String fch) {
		SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
		Date date=null;
		
		try {
			date= formato.parse(fch);
			
		}catch (ParseException e ) {
			e.printStackTrace();
		}
		return date;
	}

	}

