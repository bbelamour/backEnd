package com.bag.bck.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String tituloEdu;
    private String fechaEdu;
    private String descripcionEdu;
    private String imgEdu;

    public Education(){}

    public Education(Long id, String tituloEdu, String fechaEdu, String descripcionEdu, String imgEdu) {
        this.id = id;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descripcionEdu = descripcionEdu;
        this.imgEdu = imgEdu;
    }
}
