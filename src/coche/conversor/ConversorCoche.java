package coche.conversor;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import coche.DTO.Coche;

public class ConversorCoche extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		
			
			Coche coche = new Coche(arg1[0], arg1[1]);
		
		
		return coche;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		Coche coche = (Coche) arg1;
		return coche.toString();
	}

}
