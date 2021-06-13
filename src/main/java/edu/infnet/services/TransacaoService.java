package edu.infnet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.infnet.entities.Conta;
import edu.infnet.entities.Transacao;
import edu.infnet.entities.enums.TipoTransacao;
import edu.infnet.repositories.ContaRepository;
import edu.infnet.repositories.TransacaoRepository;

@Service
public class TransacaoService {

	@Autowired
	private TransacaoRepository transacaoRepository;
	
	@Autowired
	private ContaRepository contaRepository;
		
	public List<Transacao> findAll() {
		
		return transacaoRepository.findAll();
	}
	
	public Transacao findById(Integer id) {
		
		Optional<Transacao> transacao = transacaoRepository.findById(id);
		return transacao.get();
	}
	
	public Transacao cadastrarTransacao(Transacao transacao) {
		System.out.println(transacao);
		transacaoRepository.save(transacao);
		return transacao;
	}
	
	public List<Transacao> findByConta(Conta conta){
		Integer numero = conta.getNumero();
		return transacaoRepository.findByConta(numero);
	}
	
	public void efetuarTransacao(int numero, String tipoTransacao, Double valor) {

		Conta conta = contaRepository.getOne(numero);
		Transacao transacaoAEfetuar = new Transacao();
		
		transacaoAEfetuar.setConta(conta);
		transacaoAEfetuar.setValor(valor);
		transacaoAEfetuar.setSaldoMomento(conta.getSaldo());
		
		if (tipoTransacao == "DEBITO") {
			transacaoAEfetuar.setTipoTransacao(TipoTransacao.DEBITO);
			conta.sacar(valor);
		} else if (tipoTransacao =="CREDITO"){
			transacaoAEfetuar.setTipoTransacao(TipoTransacao.DEBITO);
			conta.depositar(valor);
		}
		
		transacaoRepository.save(transacaoAEfetuar);
		
	}

	
}
