package edu.infnet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.infnet.entities.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Integer>{

}
