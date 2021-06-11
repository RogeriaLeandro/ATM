package edu.infnet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.infnet.entities.Conta;
import edu.infnet.repositories.ContaRepository;

@Service
public class ContaService {

	@Autowired
	private ContaRepository contaRepository;
	
	public List<Conta> findAll() {
		
		return contaRepository.findAll();
	}
	
	public Conta findById(Integer numero) {
		
		Optional<Conta> conta = contaRepository.findById(numero);
		return conta.get();
	}
	
}
