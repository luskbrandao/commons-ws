package br.com.commonsws.service;

import javax.ejb.Remote;

import br.com.commonsws.entity.Pessoa;

@Remote
public interface PessoaService {

	public void salvar(Pessoa pessoa);

	public void alterar(Pessoa pessoa);

	public void excluir(Integer id);

	public Pessoa buscarPorId(Integer id);

}
