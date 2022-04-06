package br.edu.uniesp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.uniesp.api.model.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao,Long> {
}
