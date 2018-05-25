package br.com.iesb.paradigmas.localizator.models;

import java.util.List;

public class IdosoModel extends PessoaModel {

	private static final long serialVersionUID = 3811218471825253600L;
	private String tipoSanguineo;
	private List<PessoaModel> contatosEmergencia;
	
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public List<PessoaModel> getContatosEmergencia() {
		return contatosEmergencia;
	}

	public void setContatosEmergencia(List<PessoaModel> contatosEmergencia) {
		this.contatosEmergencia = contatosEmergencia;
	}
	
	
}
