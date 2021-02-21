package jb.blaschka.bioCCool.model;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class Utilisateur {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @NotEmpty(message = "Nom à remplir")
    private String nom;

    @NotNull
    @NotEmpty(message = "Prénom à remplir")
    private String prenom;

    @Column(unique = true)
    @NotNull
    @NotEmpty(message = "Mail à remplir")
    private String mail;

    @Column(unique = true)
    @NotNull
    @NotEmpty(message = "Pseudo à remplir")
    private String pseudo;

    @NotNull
    @NotEmpty(message = "Password à remplir")
    private String password;

    @ManyToOne
    private RoleUser role;


}
