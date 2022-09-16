package com.bag.bck.controller;

import com.bag.bck.models.Education;
import com.bag.bck.models.Proyects;
import com.bag.bck.service.IProyectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("https://belenag-portfolio.web.app")
@RequestMapping("/proyects")
@RestController
public class ProyectsController {

    @Autowired
    private IProyectsService proyectsServ;


    @GetMapping("/find/{id}")
    @ResponseBody
    public Proyects findProyects(@PathVariable Long id) {
        return proyectsServ.findProyect(id);
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Proyects> seeProyects(){
        return proyectsServ.seeProyects();
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("add")
    public void addProyect(@RequestBody Proyects proy){
        proyectsServ.addProyect(proy);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit")
    public void editProyect(@RequestBody Proyects proy){
        proyectsServ.editProyect(proy);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void deleteProyect(@PathVariable Long id){
        proyectsServ.deleteProyect(id);
    }
}
