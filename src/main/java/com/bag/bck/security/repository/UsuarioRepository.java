package com.bag.bck.security.repository;

import com.bag.bck.security.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario , Long> {
       Optional<Usuario> findByUserName(String userName);
       boolean existsByUserName(String userName);
       boolean existsByEmail(String email);

}
