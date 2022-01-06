package br.com.daniel.exercicio.coder.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.exercicio.coder.springboot.models.entities.Produto;
import br.com.daniel.exercicio.coder.springboot.models.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	

	@PostMapping
	public @ResponseBody Produto novoProduto(@RequestParam String nome) {   
		Produto produto = new Produto(nome);
		produtoRepository.save(produto);
		return produto;

	}

}
