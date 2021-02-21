package jb.blaschka.bioCCool.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class TypeMedia {


    @Id
    @GeneratedValue
    private Long id;
    private String nom;


}
