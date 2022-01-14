package br.com.daniel.exercicio.coder.springboot.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	// outra forma de escrita do metodo acima (Create)

// @PostMapping 
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;

	}

	// obter todos os produtos do banco de dados ( Read)
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}

	// obter produto por ID
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}

	// update do produto
	@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	// excluir produto
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);

	}
}
