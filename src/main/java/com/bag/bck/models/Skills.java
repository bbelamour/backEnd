package com.bag.bck.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String tituloSkills;
    private String imgSkills;

    private String porcentaje;

    public Skills(){}

    public Skills(Long id, String tituloSkills, String imgSkills, String porcentaje) {
        this.id = id;
        this.tituloSkills = tituloSkills;
        this.imgSkills = imgSkills;
        this.porcentaje = porcentaje;
    }
}

