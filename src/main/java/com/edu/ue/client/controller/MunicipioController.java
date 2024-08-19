package com.edu.ue.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import com.edu.ue.client.model.Municipio;
import com.edu.ue.client.service.MunicipioServiceI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class MunicipioController {
    @Autowired
    MunicipioServiceI service;

    @GetMapping(value = "municipios", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Municipio> municipios(){
        return service.listMunicipios();

    }
    @GetMapping(value = "municipios/{departamento}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Municipio> municipios(@PathVariable("departamento") String depart){
        return service.searchDepartamento(depart);
    }
    }
  
    


