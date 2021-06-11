package edu.infnet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.infnet.entities.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer>{

}
