package com.bag.bck.service;

import com.bag.bck.models.Proyects;
import com.bag.bck.repository.ProyectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectsService implements IProyectsService{

    @Autowired
    public ProyectsRepository proyectRepo;

    @Override
    public List<Proyects> seeProyects(){
        return proyectRepo.findAll();
    }
    @Override
    public void addProyect(Proyects proy){
        proyectRepo.save(proy);
    }
    @Override
    public void deleteProyect(Long id){
        proyectRepo.deleteById(id);

    }
    @Override
    public Proyects findProyect(Long id){
        return proyectRepo.findById(id).orElse(null);
    }
    @Override
    public void editProyect(Proyects proy){
        proyectRepo.save(proy);
    }
}
