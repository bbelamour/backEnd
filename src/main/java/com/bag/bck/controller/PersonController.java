package com.bag.bck.controller;

import com.bag.bck.models.Person;
import com.bag.bck.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("https://belenag-portfolio.web.app")
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private IPersonService personServ;

    @GetMapping("/find/{id}")
    @ResponseBody
    public Person findPerson(@PathVariable Long id){
        return personServ.findPerson(id);
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Person> seePerson(){ return personServ.seePerson();  }

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public void addPerson(@RequestBody Person pers){
        personServ.addPerson(pers);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit")
        public void editPerson(@RequestBody Person pers){
        personServ.editPerson(pers);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void deletePerson(@PathVariable Long id){
        personServ.deletePerson(id);
    }
}

