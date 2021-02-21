package jb.blaschka.bioCCool.controller;

import jb.blaschka.bioCCool.exception.ListExceptions;
import jb.blaschka.bioCCool.model.Utilisateur;
import jb.blaschka.bioCCool.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


    private ListExceptions le;
    @Autowired
    private UtilisateurService us;

    @GetMapping("/goInscription")
    public String goInscription(Model model){
            model.addAttribute("user", new Utilisateur());
        return "user/pageInscription";
    }
    @PostMapping("/doInscription")
    public String doInscription(@ModelAttribute Utilisateur utilisateur,Model model){
        try{
            us.saveUser(utilisateur);

        }catch (Exception e){
            model.addAttribute(le.erreurInsert);
            System.out.println(e);
            return "redirect:/goInscription";
        }

        return "redirect:/home";
    }
    @GetMapping("/login")
    public String login(){


        return "user/login";
    }

}
