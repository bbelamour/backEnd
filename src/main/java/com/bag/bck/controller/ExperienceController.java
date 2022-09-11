package com.bag.bck.controller;


import com.bag.bck.models.Experience;
import com.bag.bck.service.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RequestMapping("/experience")
@RestController
public class ExperienceController {

    @Autowired
    private IExperienceService experienceServ;

    @GetMapping("/find/{id}")
    @ResponseBody
    public Experience findExperience(@PathVariable Long id) {
        return experienceServ.findExperience(id);
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Experience> seeExperience(){
        return experienceServ.seeExperience();
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public void addExperience(@RequestBody Experience exp){
        experienceServ.addExperience(exp);
    }


    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit")
    public void editExperience(@RequestBody Experience exp) {
        experienceServ.editExperience(exp);
    }



    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void deleteExperience(@PathVariable Long id){
        experienceServ.deleteExperience(id);
        }

    }