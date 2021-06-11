package edu.infnet.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import edu.infnet.entities.Cliente;
import edu.infnet.entities.Conta;
import edu.infnet.entities.enums.TipoConta;
import edu.infnet.repositories.ClienteRepository;
import edu.infnet.repositories.ContaRepository;

@Configuration
@Profile("teste")
public class ATMConfig implements CommandLineRunner{


	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ContaRepository contaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Conta conta1 = new Conta(null, 12345, 1000.0, TipoConta.CORRENTE, null, null);
		Conta conta2 = new Conta(null, 12345, 1000.0, TipoConta.CORRENTE, null, null);
		Conta conta3 = new Conta(null, 12345, 1000.0, TipoConta.CORRENTE, null, null);
		Conta conta4 = new Conta(null, 12345, 1000.0, TipoConta.POUPANÇA, null, null);
		
		contaRepository.saveAll(Arrays.asList(conta1, conta2, conta3, conta4));
		
		Cliente cliente1 = new Cliente(null, "Maria M.");
		Cliente cliente2 = new Cliente(null, "João J.");
		Cliente cliente3 = new Cliente(null, "Antonio A.");
		
		cliente1.getContas().add(conta1);
		cliente2.getContas().add(conta2);
		cliente3.getContas().add(conta3);
		cliente1.getContas().add(conta4);
		
		conta1.setCliente(cliente1);
		conta2.setCliente(cliente2);
		conta3.setCliente(cliente3);
		conta4.setCliente(cliente1);
		
		clienteRepository.saveAll(Arrays.asList(cliente1, cliente2, cliente3));
		contaRepository.saveAll(Arrays.asList(conta1, conta2, conta3, conta4));
		
				
	}
	
}
