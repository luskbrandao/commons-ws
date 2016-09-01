package br.com.commonsws.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.commonsws.dao.PessoaDAO;
import br.com.commonsws.entity.Pessoa;

public class PessoaDAOImpl implements PessoaDAO {

	@PersistenceContext
	private EntityManager em;

	public void salvar(Pessoa pessoa){
		em.persist(pessoa);
	}

	public void alterar(Pessoa pessoa){
		em.merge(pessoa);
	}

	public void excluir(Integer id){
		em.remove(em.find(Pessoa.class, id));
	}

	public Pessoa buscarPorId(Integer id){
		return em.find(Pessoa.class, id);
	}

}
