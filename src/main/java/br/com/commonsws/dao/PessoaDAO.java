package br.com.commonsws.dao;

import br.com.commonsws.entity.Pessoa;

public interface PessoaDAO {

	public void salvar(Pessoa pessoa);

	public void alterar(Pessoa pessoa);

	public void excluir(Integer id);

	public Pessoa buscarPorId(Integer id);


}
