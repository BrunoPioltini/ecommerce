package com.github.brunopioltini.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	 @GetMapping
	 public List<ClientDTO> getAll() {
		 List<ClientDTO> result = null;
		 return result;
	 }
}