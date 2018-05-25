package br.com.iesb.paradigmas.localizator.services;

public class UtilService {
	
	protected Boolean isNumero(String value){
		try {
			@SuppressWarnings("unused")
			Long test = new Long(value.toString());
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

}
