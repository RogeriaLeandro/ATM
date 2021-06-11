package edu.infnet.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.infnet.entities.Transacao;
import edu.infnet.services.TransacaoService;

@RestController
@RequestMapping
public class TransacaoResource {
	
	@Autowired
	private TransacaoService transacaoService;
	
	@GetMapping(value="/transacoes")
	public ResponseEntity<List<Transacao>> findAll() {
		
		List<Transacao> list = transacaoService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/transacao/{id}")
	public ResponseEntity<Transacao> findById(@PathVariable Integer id) {
		
		Transacao transacao = transacaoService.findById(id);
		return ResponseEntity.ok().body(transacao);
	}

}
