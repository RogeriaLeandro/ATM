package edu.infnet.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.infnet.entities.Conta;
import edu.infnet.entities.Transacao;
import edu.infnet.services.ContaService;
import edu.infnet.services.TransacaoService;

@RestController
@RequestMapping
public class TransacaoResource {
	
	@Autowired
	private TransacaoService transacaoService;
	
	@Autowired
	private ContaService contaService;
	
	@GetMapping(value = "/transacao2")
    public ModelAndView getMainPage() {
		
		ModelAndView modelAndView = new ModelAndView("principal");
		
//		modelAndView.addObject("clientes", clienteService.getClientes());
//		modelAndView.addObject("coletores", coletorService.getColetores());
//		modelAndView.addObject("emprestimos", emprestimoService.getEmprestimos());
		
		
		return modelAndView;
    }
	
	@GetMapping(value = "/transacoes")
    public ModelAndView getPagamentos(@RequestParam("numero") int numero) {
		
		Conta conta = contaService.findById(numero);
		List<Transacao> transacoes = transacaoService.findByConta(conta);
		
		ModelAndView modelAndView = new ModelAndView("transacoes");
		
		modelAndView.addObject("transacoes", transacoes);
		modelAndView.addObject("conta", conta);
		
		return modelAndView;
    }
	
	@GetMapping(value = "/transacao")
    public ModelAndView getTransacao(@RequestParam("idTransacao") int idTransacao) {
		
		ModelAndView modelAndView = new ModelAndView("transacao");
		
		modelAndView.addObject("transacao", transacaoService.findById(idTransacao));
		
		return modelAndView;
    }
	
	@PostMapping(value = "/transacao")
    public ModelAndView efetuarTransacao(@RequestParam("numero") int numero, 
    		@RequestParam("tipoTransacao") String tipoTransacao, @RequestParam("valor") double valor) {
		
		ModelAndView modelAndView = new ModelAndView("redirect:/");
		
		transacaoService.efetuarTransacao(numero, tipoTransacao, valor);
		
		return modelAndView;
    }
	
	
//	@GetMapping(value="/transacoes")
//	public ResponseEntity<List<Transacao>> findAll() {
//		
//		List<Transacao> list = transacaoService.findAll();
//		return ResponseEntity.ok().body(list);
//	}
//	
//	@GetMapping(value = "/transacao/{id}")
//	public ResponseEntity<Transacao> findById(@PathVariable Integer id) {
//		
//		Transacao transacao = transacaoService.findById(id);
//		return ResponseEntity.ok().body(transacao);
//	}
//	
//	@CrossOrigin("*")
//	@PostMapping("/transacao")
//	public ResponseEntity<String> cadastrarTransacao(@RequestBody Transacao transacao) {
//		System.out.println("ok");
//		transacaoService.cadastrarTransacao(transacao);
//		return ResponseEntity.status(HttpStatus.CREATED).body(transacao.toString());
//	}
	
}
