package br.com.iesb.paradigmas.localizator.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PessoaModel implements Serializable{
	
	private static final long serialVersionUID = 3265757944754925276L;
	private String nome; 
	private String email;
	private String cpf;
	private Date dataNascimento;
	private List<TelefoneModel> telefones;
	private RgModel rg;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<TelefoneModel> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneModel> telefones) {
		this.telefones = telefones;
	}

	public RgModel getRg() {
		return rg;
	}

	public void setRg(RgModel rg) {
		this.rg = rg;
	}

}
