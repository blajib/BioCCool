package jb.blaschka.bioCCool.controller;


import jb.blaschka.bioCCool.model.ToDo;
import jb.blaschka.bioCCool.service.ToDoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    private ToDoService tr;

    @PostMapping("/getAllToDos")
    public List<ToDo> getAllToDos(){


        return null;
    }
}
