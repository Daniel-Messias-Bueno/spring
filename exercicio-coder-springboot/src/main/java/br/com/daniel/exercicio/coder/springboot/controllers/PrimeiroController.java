package br.com.daniel.exercicio.coder.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

//@RequestMapping(method = RequestMethod.GET, path = "/ola")	 ==    @GetMapping (path = "/ola")

	@GetMapping(path = "/ola")
	public String ola() {
		return "olá Spring Boot";
	}

}
