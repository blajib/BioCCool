package jb.blaschka.bioCCool.service;


import jb.blaschka.bioCCool.model.Utilisateur;
import jb.blaschka.bioCCool.repository.RoleRepository;
import jb.blaschka.bioCCool.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository ur;
    @Autowired
    private RoleRepository rr;

    public String saveUser(Utilisateur utilisateur){
        long l = 1;
        utilisateur.setRole(rr.findById(l).get());
        ur.save(utilisateur);



        return null;
    }


}
