package com.bag.bck.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String tituloExp;
    private String fechaExp;
    private String descripcionExp;


    public Experience(){}

    public Experience(Long id, String tituloExp, String fechaExp, String descripcionExp) {
        this.id = id;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descripcionExp = descripcionExp;
    }
}
