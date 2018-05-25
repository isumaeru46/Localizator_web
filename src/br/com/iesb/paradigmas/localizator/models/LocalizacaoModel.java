package br.com.iesb.paradigmas.localizator.models;

import java.util.Date;

public class LocalizacaoModel {
	
	private String latitude;
	private String longitude;
	private Date data;
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
