package com.bag.bck.repository;

import com.bag.bck.models.Proyects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectsRepository extends JpaRepository<Proyects, Long> {
}
