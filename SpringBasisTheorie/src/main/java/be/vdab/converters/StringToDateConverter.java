package be.vdab.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date>{
	private static final String DATUM_FORMAAT = "yyyy-MM-dd";
	@Override
	public Date convert(String string) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATUM_FORMAAT);
		try {
			return dateFormat.parse(string);
		} catch (ParseException ex){
			throw new IllegalArgumentException();
		}
	}
	
}
