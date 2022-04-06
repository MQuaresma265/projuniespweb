package br.edu.uniesp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.uniesp.api.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
