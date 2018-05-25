package br.com.iesb.paradigmas.localizator.models;

public class RetornoModel {
	
	private Boolean sucesso;
	private String mensagem;
	
	public Boolean getSucesso() {
		return sucesso;
	}
	
	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
