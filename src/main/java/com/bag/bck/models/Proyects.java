package com.bag.bck.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Proyects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String tituloProyects;
    private String fechaProyects;
    private String descripcionProyects;
    private String imgProyects;

    public Proyects(){}

    public Proyects(Long id, String tituloProyects, String fechaProyects, String descripcionProyects, String imgProyects) {
        this.id = id;
        this.tituloProyects = tituloProyects;
        this.fechaProyects = fechaProyects;
        this.descripcionProyects = descripcionProyects;
        this.imgProyects = imgProyects;
    }
}


