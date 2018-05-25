package br.com.iesb.paradigmas.localizator.interfaces;

import br.com.iesb.paradigmas.localizator.models.RetornoModel;
import br.com.iesb.paradigmas.localizator.models.UsuarioModel;

public interface ServiceInterface {
	
	public RetornoModel create(UsuarioModel usuario);
	public RetornoModel update(Long id, UsuarioModel usuario);
	public RetornoModel delete(Long id);
	public RetornoModel find(Object value);

}
