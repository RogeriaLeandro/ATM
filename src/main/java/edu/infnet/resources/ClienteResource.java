package edu.infnet.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import edu.infnet.entities.Cliente;
import edu.infnet.services.ClienteService;

@RestController
@RequestMapping(value="/atm")
public class ClienteResource {
		
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "/clientes")
	public ResponseEntity<List<Cliente>> findAll() {
		
		List<Cliente> list = clienteService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/cliente/{idCliente}")
	public ResponseEntity<Cliente> findById(@PathVariable Integer idCliente) {
		System.out.print(idCliente);
		Cliente cliente = clienteService.findById(idCliente);
		return ResponseEntity.ok().body(cliente);
	}

}
