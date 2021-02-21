package jb.blaschka.bioCCool.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Media {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String suffixe;
    @ManyToOne
    private Lieu lieu;
    @ManyToOne
    private TypeMedia typeMedia;
}
