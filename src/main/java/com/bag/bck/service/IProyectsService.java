package com.bag.bck.service;

import com.bag.bck.models.Proyects;

import java.util.List;

public interface IProyectsService {
    public void addProyect(Proyects proy);

    public List<Proyects> seeProyects();

    public void editProyect(Proyects proy);

    public void deleteProyect(Long id);

    public Proyects findProyect(Long id);
}
