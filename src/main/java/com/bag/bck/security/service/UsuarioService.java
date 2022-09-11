package com.bag.bck.security.service;

import com.bag.bck.security.model.Usuario;
import com.bag.bck.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByUserName(String userName){
        return usuarioRepository.findByUserName(userName);

    }
    public boolean existsByUserName(String userName){

        return usuarioRepository.existsByUserName(userName);
    }
    public boolean existsByEmail(String email){

        return usuarioRepository.existsByEmail(email);
    }
    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
