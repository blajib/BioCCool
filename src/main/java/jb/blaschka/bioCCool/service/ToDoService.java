package jb.blaschka.bioCCool.service;


import jb.blaschka.bioCCool.model.ToDo;
import jb.blaschka.bioCCool.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository tr;

    public List<ToDo> getAllToDos(){

        return null;
    }
}
