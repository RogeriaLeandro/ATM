package edu.infnet.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.infnet.entities.Conta;
import edu.infnet.services.ContaService;

@RestController
@RequestMapping(value="/atm")
public class ContaResource {
	
	@Autowired
	private ContaService contaService;
	
	@GetMapping(value = "/contas")
	public ResponseEntity<List<Conta>> findAll() {
		
		List<Conta> list = contaService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/conta/{numero}")
	public ResponseEntity<Conta> findById(@PathVariable Integer numero) {
		
		Conta conta = contaService.findById(numero);
		return ResponseEntity.ok().body(conta);
	}

}
