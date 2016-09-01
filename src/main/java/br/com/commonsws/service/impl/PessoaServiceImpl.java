package br.com.commonsws.service.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.commonsws.dao.PessoaDAO;
import br.com.commonsws.entity.Pessoa;
import br.com.commonsws.service.PessoaService;

@Stateless
public class PessoaServiceImpl implements PessoaService {

	@Inject
	private PessoaDAO pessoaDAO;

	public void salvar(Pessoa pessoa) {
		pessoaDAO.salvar(pessoa);
	}

	public void alterar(Pessoa pessoa) {
		pessoaDAO.alterar(pessoa);
	}

	public void excluir(Integer id) {
		pessoaDAO.excluir(id);
	}

	public Pessoa buscarPorId(Integer id) {
		return pessoaDAO.buscarPorId(id);
	}
}
