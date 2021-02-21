package jb.blaschka.bioCCool.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Lieu {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String description;
    private String lienSite ;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private TypeLieu typeLieu;



}
