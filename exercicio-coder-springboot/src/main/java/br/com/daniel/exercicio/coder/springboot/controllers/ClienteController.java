package br.com.daniel.exercicio.coder.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.exercicio.coder.springboot.models.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente (28 ,"Pedro" ,"123.784.789-00");
	}
	
	
	@GetMapping("/{id}")
	public Cliente obterClienteId1(@PathVariable int id) {
		return new Cliente (id ,"Pedro" ,"123.784.789-00");
	}
	
	

}
