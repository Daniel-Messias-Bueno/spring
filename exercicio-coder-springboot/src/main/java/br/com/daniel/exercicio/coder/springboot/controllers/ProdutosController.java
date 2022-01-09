package br.com.daniel.exercicio.coder.springboot.controllers;

import javax.validation.Valid;

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
	
//
//	@PostMapping
//	public @ResponseBody Produto novoProduto(@RequestParam String nome, @RequestParam double preco,@RequestParam double desconto) {   
//		Produto produto = new Produto(nome , preco, desconto);
//		produtoRepository.save(produto);
//		return produto;
//
//	}
	
	
	// outra forma de escrita do metodo acima
	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {   
		produtoRepository.save(produto);
		return produto;

	}

}
