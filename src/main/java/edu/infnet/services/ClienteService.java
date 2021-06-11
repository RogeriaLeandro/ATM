package edu.infnet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.infnet.entities.Cliente;
import edu.infnet.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll() {
		
		return clienteRepository.findAll();
	}
	
	public Cliente findById(Integer idCliente) {
		
		Optional<Cliente> cliente = clienteRepository.findById(idCliente);
		return cliente.get();
	}
	
}
