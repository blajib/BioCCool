package jb.blaschka.bioCCool.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Entity
public class Commentaire {

    @Id
    @GeneratedValue
    private Long id;
    private String texte;
    private LocalDateTime dateEnvoi;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Lieu lieu;

}
