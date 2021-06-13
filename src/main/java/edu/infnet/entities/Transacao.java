package edu.infnet.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.infnet.entities.enums.TipoTransacao;


@Entity
@Table(name = "transacao")
public class Transacao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTransacao;
	
	//dar nomes às colunas
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_transacao")
	private TipoTransacao tipoTransacao;
	
	@Column(name = "valor")
	private double valor;
	
	@Column(name = "saldoMomento")
	private double saldoMomento;
	
	@ManyToOne()
	@JoinColumn(name = "numero")
	private Conta conta;

	public Transacao() {
		
	}

	public Transacao(Integer idTransacao, TipoTransacao tipoTransacao, double valor, double saldoMomento, Conta conta) {
		super();
		this.idTransacao = idTransacao;
		this.tipoTransacao = tipoTransacao;
		this.valor = valor;
		this.saldoMomento = saldoMomento;
		this.conta = conta;
		
	}

	public Integer getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(Integer idTransacao) {
		this.idTransacao = idTransacao;
	}

	public TipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(TipoTransacao tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public double getSaldoMomento() {
		return saldoMomento;
	}

	public void setSaldoMomento(double saldoMomento) {
		this.saldoMomento = saldoMomento;
	}

	@Override
	public String toString() {
		return "Transacao [idTransacao=" + idTransacao + ", tipoTransacao=" + tipoTransacao + ", valor=" + valor
				+ ", conta=" + conta + "]";
	}
	
}
