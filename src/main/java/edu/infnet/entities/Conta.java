package edu.infnet.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.infnet.entities.enums.TipoConta;

@Entity
@Table(name = "conta")
public class Conta implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero")
	private Integer numero;

	@Column(name = "pin")
	private Integer pin;
	
	@Column(name = "saldo")
	private Double saldo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_transacao")
	private TipoConta tipoConta;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "conta")
	private List<Transacao> transacoes = new ArrayList<>();
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, Integer pin, Double saldo, TipoConta tipoConta, Cliente cliente, List<Transacao> transacoes) {
		super();
		this.numero = numero;
		this.pin = pin;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		this.cliente = cliente;
		this.transacoes = transacoes;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void sacar(Double valorSaque) {
		this.saldo -= valorSaque;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}
	
	public void addTransacao(Transacao transacao) {
		if (getTransacoes() == null) {
			this.transacoes = new ArrayList<Transacao>();
		}
		getTransacoes().add(transacao);
	}
}
