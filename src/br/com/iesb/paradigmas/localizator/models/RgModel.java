package br.com.iesb.paradigmas.localizator.models;

import java.util.Date;

public class RgModel {
	
	private String numero;
	private String orgaoEmissor;
	private String ufEmissor;
	private Date dataEmissao;
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public String getUfEmissor() {
		return ufEmissor;
	}

	public void setUfEmissor(String ufEmissor) {
		this.ufEmissor = ufEmissor;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

}
