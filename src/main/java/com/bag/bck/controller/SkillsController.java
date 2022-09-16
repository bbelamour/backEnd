package com.bag.bck.controller;


import com.bag.bck.models.Skills;
import com.bag.bck.service.ISkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("https://belenag-portfolio.web.app")
@RequestMapping("/skills")
@RestController
public class SkillsController {

    @Autowired
    private ISkillsService skillsServ;

    @GetMapping("/find/{id}")
    @ResponseBody
    public Skills findSkills(@PathVariable Long id) {
        return skillsServ.findSkill(id);
    }


    @GetMapping("/list")
    @ResponseBody
    public List<Skills> listSkills(){
        return skillsServ.listSkills();
    }


    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public void addSkill(@RequestBody Skills sk){
        skillsServ.addSkill(sk);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit")
        public void editSkill(@RequestBody Skills sk){
            skillsServ.editSkill(sk);
        }
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void deleteSkill(@PathVariable Long id){
        skillsServ.deleteSkill(id);
       }
    }

