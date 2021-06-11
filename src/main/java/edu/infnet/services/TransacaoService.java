package edu.infnet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.infnet.entities.Transacao;
import edu.infnet.repositories.TransacaoRepository;

@Service
public class TransacaoService {

	@Autowired
	private TransacaoRepository transacaoRepository;
	
	public List<Transacao> findAll() {
		
		return transacaoRepository.findAll();
	}
	
	public Transacao findById(Integer id) {
		
		Optional<Transacao> transacao = transacaoRepository.findById(id);
		return transacao.get();
	}
	
}
