package com.github.brunopioltini.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.brunopioltini.ecommerce.model.Cliente;
import com.github.brunopioltini.ecommerce.repository.ClienteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
	
	
	private final ClienteRepository clienteRepository;
	
	public List<Cliente> getAll(){
		return clienteRepository.findAll();
	}
}
