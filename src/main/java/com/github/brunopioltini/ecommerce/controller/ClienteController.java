package com.github.brunopioltini.ecommerce.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.brunopioltini.ecommerce.model.Cliente;
import com.github.brunopioltini.ecommerce.service.ClienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {
	
	private final ClienteService clienteService;
	private final ModelMapper modelMapper;
	
	 @GetMapping
	 public List<ClienteDTO> getAll() {
		 List<Cliente> clientes = clienteService.getAll();
		 
		 
		 List<ClienteDTO> result = clientes.stream().map(this::map).collect(Collectors.toList());
		 return result;
	 }
	 
	 private ClienteDTO map(Cliente cliente) {
		 ClienteDTO dto = modelMapper.map(cliente, ClienteDTO.class);
		 return dto;
	 }
}
