package com.bag.bck.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;

    private String residencia;

    private String infoContacto;

    private String acercaDeMi;

    public Person(){}

    public Person(Long id, String nombre, String apellido, String residencia, String infoContacto, String acercaDeMi) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.residencia = residencia;
        this.infoContacto = infoContacto;
        this.acercaDeMi = acercaDeMi;
    }
}
