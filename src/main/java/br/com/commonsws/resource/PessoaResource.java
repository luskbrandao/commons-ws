package br.com.commonsws.resource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.commonsws.entity.Pessoa;
import br.com.commonsws.service.PessoaService;

@RequestScoped
@Path("pessoa")
public class PessoaResource {

	@Inject
	private PessoaService pessoaService;

	@POST
	@Path("salvar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void salvar(Pessoa pessoa){
		pessoaService.salvar(pessoa);
	}

	@PUT
	@Path("alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void alterar(Pessoa pessoa){
		pessoaService.alterar(pessoa);
	}

	@DELETE
	@Path("excluir/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(@PathParam("id") Integer id){
		pessoaService.excluir(id);
	}

	@GET
	@Path("buscarPorId/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Pessoa buscarPorId(@PathParam("id") Integer id){
		return pessoaService.buscarPorId(id);
	}
}
