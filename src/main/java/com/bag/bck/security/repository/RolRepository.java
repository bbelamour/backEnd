package com.bag.bck.security.repository;

import com.bag.bck.security.enums.RolName;
import com.bag.bck.security.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findByRolName(RolName rolName);

}
