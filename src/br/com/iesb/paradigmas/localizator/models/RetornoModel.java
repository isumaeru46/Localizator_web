package br.com.iesb.paradigmas.localizator.models;

import java.util.List;

public class RetornoModel {
	
	private Boolean sucesso;
	private String mensagem;
	private List<Object> conteudo;
	
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

	public List<Object> getConteudo() {
		return conteudo;
	}

	public void setConteudo(List<Object> conteudo) {
		this.conteudo = conteudo;
	}

}
