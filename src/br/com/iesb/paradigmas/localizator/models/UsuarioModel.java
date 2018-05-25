package br.com.iesb.paradigmas.localizator.models;

public class UsuarioModel extends PessoaModel {
	
	private static final long serialVersionUID = 2419226893986220549L;
	
	private String login;
	private String senha;
	private Long id;
	
	public UsuarioModel () {
	}
	
	public UsuarioModel (String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
