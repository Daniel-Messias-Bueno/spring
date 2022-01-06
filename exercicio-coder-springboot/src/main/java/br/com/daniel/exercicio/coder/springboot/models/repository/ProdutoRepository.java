package br.com.daniel.exercicio.coder.springboot.models.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.daniel.exercicio.coder.springboot.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
